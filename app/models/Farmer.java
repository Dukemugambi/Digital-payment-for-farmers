package models;

import java.util.*;
import java.lang.*;
import java.math.BigDecimal;
import java.io.IOException;

import org.json.JSONException;

import play.*;
import play.db.ebean.*;
import play.data.validation.Constraints;
import play.mvc.Http;
import controllers.Session;

import javax.persistence.*;

import com.wepay.*;
import com.wepay.model.*;
import com.wepay.model.data.*;
import com.wepay.net.WePayResource;
import com.wepay.exception.WePayException;

@Entity
public class Farmer extends Model {
	
	@Id
	public Long id;
	
	@Constraints.Required
	public String useremail;
	
	@Constraints.Required
	public String password;
	
	@Constraints.Required
	public String farm;
	
	@Constraints.Required
	public String username;
	
	@Constraints.Required
	public String produce;
	
	@Constraints.Required
	public BigDecimal produce_price;
	
	public String wepay_access_token;
	public Long wepay_account_id;
	
	public static Finder<Long,Farmer> find = new Finder(Long.class, Farmer.class);

	public static List<Farmer> all() {
		return find.all();
	}
	
	public static Farmer findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
	}

	public static Farmer findById(Long id) {
        return find.ref(id);
	}
	
	public static void create(Farmer farmer) {
		farmer.password = Session.encryptPassword(farmer.password);
		farmer.save();
	}

	public static void delete(Long id) {
		findById(id).delete();
	}

	public void update(Farmer farmer) {
		farmer.password = Session.encryptPassword(farmer.password);
		farmer.update(this.id);
	}
	
    public static Farmer authenticate(String useremail, String password) {
        Farmer farmer = find.where().eq("useremail", useremail).findUnique();
        if (Session.checkPassword(password, farmer.password)) return farmer;
        return null;
    }
	
	public boolean hasWepayAccessToken() {		
		return this.wepay_access_token != null;
	}
	
	public boolean hasWepayAccount() {
		return this.wepay_account_id != null;
	}
	
	public String wepayOauth2Authorize() throws IOException, JSONException {
		OAuth2Data data = new OAuth2Data();
		data.redirect_uri = "http://" + Http.Context.current().request().host() + "/farmers/oauth/" + this.id;
		data.scope = "manage_accounts,view_balance,collect_payments,view_user,preapprove_payments,send_money";
		data.user_email = this.useremail;
		data.user_name = this.username;
		String url = OAuth2.authorize(data, null);
		return url;
	}
	
	public void wepayOauth2Token(String code) throws IOException, JSONException, WePayException {
		OAuth2Data data = new OAuth2Data();
		data.redirect_uri = "http://" + Http.Context.current().request().host() + "/farmers/oauth/" + this.id;
		data.code = code;
		String token = OAuth2.token(data, null);
		this.wepay_access_token = token;
		this.save();
		if (this.hasWepayAccessToken()) this.wepayAccountCreate();
	}
	
	public void wepayAccountCreate() throws JSONException, IOException, WePayException {
		if (this.hasWepayAccessToken() && !this.hasWepayAccount()) {
			AccountData data = new AccountData();
			data.name = this.username;
			data.description = "Farm selling " + this.produce;
			Account account = Account.create(data, this.wepay_access_token);
			this.wepay_account_id = account.getAccount_id();
			this.save();
		}
	}
	
	public Checkout wepayCheckoutCreate(String redirect_uri) throws IOException, JSONException, WePayException {
		CheckoutData data = new CheckoutData();
		data.account_id = this.wepay_account_id;
		data.short_description = "Produce sold by " + this.farm;
		data.type = "GOODS";
		data.amount = this.produce_price;
		data.app_fee = this.produce_price.multiply(BigDecimal.valueOf(0.1));
		data.fee_payer = "payee";
		data.mode = "iframe";
		data.redirect_uri = redirect_uri;
		Checkout checkout = Checkout.create(data, this.wepay_access_token);
		return checkout;
	}

}

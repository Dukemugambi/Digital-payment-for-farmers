package controllers;

import java.io.IOException;

import org.json.JSONException;

import play.*;
import play.api.Play.*;
import play.mvc.*;
import play.db.*;
import play.data.*;
import models.*;

import com.typesafe.config.ConfigFactory;
import com.wepay.*;
import com.wepay.model.*;
import com.wepay.model.data.*;
import com.wepay.net.WePayResource;
import com.wepay.exception.WePayException;

public class Application extends Controller {	
		
	javax.sql.DataSource db = DB.getDataSource();
	
	public static Form<Farmer> farmerForm = Form.form(Farmer.class);
	public static Form<Farmer> loginForm = Form.form(Farmer.class);
	
	public static WePay wepay;
	
	/**
	 * landing page, show all farmers and initialize WePay object
	 */
	public static Result index() {
		String flash = flash("message");
		return ok(views.html.index.render(flash, Farmer.all()));
	}
		
	/**
	 * show this farmer 
	 */
	public static Result show(Long id) {
		Farmer farmer = Farmer.find.ref(id);
		String flash = flash("message");
		return ok(views.html.show.render(flash, farmer, Session.isSessionOwner(farmer), farmer.hasWepayAccount()));
	}
	
	/**
	 * render registration form page
	 */
	public static Result register() {
		return ok(views.html.register.render(farmerForm));
	}
	
	/**
	 * interpret registration form to create new farmer
	 */
	public static Result newFarmer() {
		Form<Farmer> filledForm = farmerForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			flash("message", "Sorry, something went wrong. Please try again.");
			return redirect(routes.Application.index());
		} else {
		    Farmer.create(filledForm.get());
		    session("connected", filledForm.data().get("useremail"));
		    flash("message", "Farmer was successfully created.");
		    return redirect(routes.Application.show(filledForm.get().id));  
		}
	}
	
	/**
	 * handle new farmer redirect for wepay oauth2 
	 */
	public static Result oauth(Long id, String code) throws IOException, JSONException, WePayException {
		Farmer farmer = Farmer.findById(id);
		farmer.wepayOauth2Token(code);
		if (farmer.hasWepayAccessToken() && farmer.hasWepayAccount()) flash("message", "We successfully connected you to WePay!");
		else flash("message", "Sorry, we were unable to connect you to WePay.");
		return redirect(routes.Application.show(id));
	}
	
	/**
	 * render edit form page
	 */
	public static Result edit(Long id) {
		Farmer farmer = Farmer.findById(id);
		if (Session.isSessionOwner(farmer)) {
			return ok(views.html.edit.render(farmerForm.fill(farmer), farmer));
		} else {
			flash("message", "You may not edit a farmer that is not you.");
			return redirect(routes.Application.index());
		}
	}
	
	/**
	 * interpret edit form to update farmer
	 */
	public static Result update(Long id) {
		Form<Farmer> filledForm = farmerForm.bindFromRequest();
		if(filledForm.hasErrors()) {
			Farmer farmer = Farmer.findById(id);
			flash("message", "Sorry, we were unable to update your information. Please try again.");
			return badRequest(views.html.edit.render(farmerForm.fill(farmer), farmer));
		} else {
		    filledForm.get().update(id);
		    flash("message", "Farmer was successfully updated.");
		    return redirect(routes.Application.index());  
		}
	}
	
	/**
	 * create wepay checkout object and render iframe for purchase completion
	 */
	public static Result buy(Long id) throws IOException, JSONException, WePayException {
		Farmer farmer = Farmer.findById(id);
		String redirect_uri = "http://" + Http.Context.current().request().host() + "/farmers/payment_success/" + id;
		Checkout checkout = farmer.wepayCheckoutCreate(redirect_uri);
		return ok(views.html.buy.render(farmer, checkout.getCheckout_uri()));
	}
	
	/**
	 * render show page with purchase completion alert
	 */
	public static Result paymentSuccess(Long id, String checkout_id) {
		Farmer farmer = Farmer.findById(id);
		if (checkout_id == null) {
			flash("message", "Sorry, we were unable to complete your order, please try again.");
			return redirect(routes.Application.show(id));
		}
		flash("message", "Thanks for the payment! You should receive a confirmation email shortly.");
		return redirect(routes.Application.show(id));
	}
	
}

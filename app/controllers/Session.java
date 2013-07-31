package controllers;

import org.mindrot.jbcrypt.BCrypt;

import play.*;
import play.mvc.*;
import play.db.*;
import play.data.*;
import static play.data.Form.*;
import models.*;

public class Session extends Controller {

	public static class Login {
        
		public String useremail;
		public String password;
        
		public String validate() {
			if(Farmer.authenticate(useremail, password) == null) return "Invalid user or password";
			else return null;
		}
	}
    
	public static String encryptPassword(String cleanPassword) {
		if (cleanPassword == null) return null;
		else return BCrypt.hashpw(cleanPassword, BCrypt.gensalt());
	}
	
	public static boolean checkPassword(String candidate, String encrypted) {
		if (candidate == null || encrypted == null) return false;
		else return BCrypt.checkpw(candidate, encrypted);
	}
    
	public static Result login() {
		return ok(views.html.login.render(flash("message"), form(Login.class)));
	}
	
	public static Result authenticate() {
		Form<Login> loginForm = form(Login.class).bindFromRequest();
		if(loginForm.hasErrors()) {
			flash("message", "Incorrect email or password.");
			return redirect(routes.Session.login());
		}
		else {
			session("connected", loginForm.get().useremail);
			flash("message", "Welcome back to WeFarm.");
			return redirect(routes.Application.index());
		}
	}
	
	public static Result logout() {
		session().clear();
		flash("message", "You've been logged out");
		return redirect(routes.Application.index());  
	}
	
	public static boolean isSessionOwner(Farmer farmer) {
		if (farmer.useremail.equals(session("connected"))) return true;
		else return false;
	}
	
}


package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[Session.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(flash: String, loginForm: Form[Session.Login]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.49*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	"""),_display_(Seq[Any](/*7.3*/if(flash!=null)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
		<div class="alert alert-block alert-info">
			"""),_display_(Seq[Any](/*9.5*/flash)),format.raw/*9.10*/("""
		</div>
	""")))})),format.raw/*11.3*/("""

	<h1>Farmer Login</h1>

	"""),_display_(Seq[Any](/*15.3*/form(routes.Session.authenticate())/*15.38*/ {_display_(Seq[Any](format.raw/*15.40*/("""
		"""),_display_(Seq[Any](/*16.4*/inputText(loginForm("useremail"), '_label -> "Email", '_showConstraints -> false))),format.raw/*16.85*/("""
	  	"""),_display_(Seq[Any](/*17.6*/inputPassword(loginForm("password"), '_label -> "Password", '_showConstraints -> false))),format.raw/*17.93*/("""
	  	<input type="submit" class="btn btn-primary" value="Login">
	""")))})),format.raw/*19.3*/("""

""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(flash:String,loginForm:Form[Session.Login]): play.api.templates.Html = apply(flash,loginForm)
    
    def f:((String,Form[Session.Login]) => play.api.templates.Html) = (flash,loginForm) => apply(flash,loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/login.scala.html
                    HASH: d7ec3a91ae4ab06b000dcfd09649822a6ae0fd6e
                    MATRIX: 743->1|883->48|911->67|947->69|969->83|1008->85|1046->89|1069->104|1108->106|1192->156|1218->161|1261->173|1324->201|1368->236|1408->238|1447->242|1550->323|1591->329|1700->416|1798->483|1832->486
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|39->11|43->15|43->15|43->15|44->16|44->16|45->17|45->17|47->19|49->21
                    -- GENERATED --
                */
            
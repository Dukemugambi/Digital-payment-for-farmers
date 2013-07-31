
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
object show extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,Farmer,Boolean,Boolean,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(flash: String, farmer: Farmer, isSession: Boolean, hasAccount: Boolean):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	"""),_display_(Seq[Any](/*7.3*/if(flash!=null)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
		<div class="alert alert-block alert-info">
			"""),_display_(Seq[Any](/*9.5*/flash)),format.raw/*9.10*/("""
		</div>
	""")))})),format.raw/*11.3*/("""

	<h1 class="floatLeft">"""),_display_(Seq[Any](/*13.25*/farmer/*13.31*/.farm)),format.raw/*13.36*/("""</h1>
	
	"""),_display_(Seq[Any](/*15.3*/if(isSession && !hasAccount)/*15.31*/ {_display_(Seq[Any](format.raw/*15.33*/("""
		<p>
			<b>Please create an account to manage your money: </b>
			<a class="btn btn-primary" href=""""),_display_(Seq[Any](/*18.38*/farmer/*18.44*/.wepayOauth2Authorize())),format.raw/*18.67*/("""">Click here to create your account</a>
		</p>
	""")))})),format.raw/*20.3*/("""
	
	"""),_display_(Seq[Any](/*22.3*/if(!isSession && hasAccount)/*22.31*/ {_display_(Seq[Any](format.raw/*22.33*/("""
		<p>
			<a class="btn btn-danger btn-large" href=""""),_display_(Seq[Any](/*24.47*/routes/*24.53*/.Application.buy(farmer.id))),format.raw/*24.80*/("""">Buy """),_display_(Seq[Any](/*24.87*/farmer/*24.93*/.produce)),format.raw/*24.101*/(""" Now!</a>
		</p>
	""")))})),format.raw/*26.3*/("""

	<p>
	  <b>Name:</b>
	  """),_display_(Seq[Any](/*30.5*/farmer/*30.11*/.username)),format.raw/*30.20*/("""
	</p>

	<p>
	  <b>Email:</b>
	  """),_display_(Seq[Any](/*35.5*/farmer/*35.11*/.useremail)),format.raw/*35.21*/(""" 
	</p>

	<p>
	  <b>Farm:</b>
	  """),_display_(Seq[Any](/*40.5*/farmer/*40.11*/.farm)),format.raw/*40.16*/("""
	</p>

	<p>
	  <b>Produce:</b>
	  """),_display_(Seq[Any](/*45.5*/farmer/*45.11*/.produce)),format.raw/*45.19*/("""
	</p>

	<p>
	  <b>Produce price:</b>
	  $"""),_display_(Seq[Any](/*50.6*/farmer/*50.12*/.produce_price)),format.raw/*50.26*/("""
	</p>
	
	"""),_display_(Seq[Any](/*53.3*/if(isSession)/*53.16*/ {_display_(Seq[Any](format.raw/*53.18*/("""
		<a href=""""),_display_(Seq[Any](/*54.13*/routes/*54.19*/.Application.edit(farmer.id))),format.raw/*54.47*/("""">Edit</a>
	""")))})),format.raw/*55.3*/(""" 
	
""")))})))}
    }
    
    def render(flash:String,farmer:Farmer,isSession:Boolean,hasAccount:Boolean): play.api.templates.Html = apply(flash,farmer,isSession,hasAccount)
    
    def f:((String,Farmer,Boolean,Boolean) => play.api.templates.Html) = (flash,farmer,isSession,hasAccount) => apply(flash,farmer,isSession,hasAccount)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/show.scala.html
                    HASH: 838b3247c38f040b0e5727c7355a7f9046e48e46
                    MATRIX: 745->1|910->73|938->92|974->94|996->108|1035->110|1073->114|1096->129|1135->131|1219->181|1245->186|1288->198|1350->224|1365->230|1392->235|1437->245|1474->273|1514->275|1652->377|1667->383|1712->406|1792->455|1832->460|1869->488|1909->490|1998->543|2013->549|2062->576|2105->583|2120->589|2151->597|2201->616|2263->643|2278->649|2309->658|2378->692|2393->698|2425->708|2494->742|2509->748|2536->753|2607->789|2622->795|2652->803|2730->846|2745->852|2781->866|2827->877|2849->890|2889->892|2938->905|2953->911|3003->939|3047->952
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|39->11|41->13|41->13|41->13|43->15|43->15|43->15|46->18|46->18|46->18|48->20|50->22|50->22|50->22|52->24|52->24|52->24|52->24|52->24|52->24|54->26|58->30|58->30|58->30|63->35|63->35|63->35|68->40|68->40|68->40|73->45|73->45|73->45|78->50|78->50|78->50|81->53|81->53|81->53|82->54|82->54|82->54|83->55
                    -- GENERATED --
                */
            
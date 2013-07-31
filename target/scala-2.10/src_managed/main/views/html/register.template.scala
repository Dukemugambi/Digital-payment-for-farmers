
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
object register extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Farmer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(farmerForm: Form[Farmer]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	<h1>New farmer registration</h1>
	
	"""),_display_(Seq[Any](/*9.3*/form(routes.Application.newFarmer())/*9.39*/ {_display_(Seq[Any](format.raw/*9.41*/("""
	    """),_display_(Seq[Any](/*10.7*/inputText(farmerForm("username"), '_label -> "Name", '_showConstraints -> false))),format.raw/*10.87*/(""" 
		"""),_display_(Seq[Any](/*11.4*/inputText(farmerForm("useremail"), '_label -> "Email", '_showConstraints -> false))),format.raw/*11.86*/("""
	  	"""),_display_(Seq[Any](/*12.6*/inputPassword(farmerForm("password"), '_label -> "Password", '_showConstraints -> false))),format.raw/*12.94*/("""
		"""),_display_(Seq[Any](/*13.4*/inputText(farmerForm("farm"), '_label -> "Farm", '_showConstraints -> false))),format.raw/*13.80*/("""
	  	"""),_display_(Seq[Any](/*14.6*/inputText(farmerForm("produce"), '_label -> "Produce", '_showConstraints -> false))),format.raw/*14.88*/("""
	  	"""),_display_(Seq[Any](/*15.6*/inputText(farmerForm("produce_price"), '_label -> "Produce Price", '_showConstraints -> false))),format.raw/*15.100*/("""
	  	<input type="submit" class="btn btn-primary" value="Create Farmer">
	""")))})),format.raw/*17.3*/("""
	<a href=""""),_display_(Seq[Any](/*18.12*/routes/*18.18*/.Application.index())),format.raw/*18.38*/("""">Back</a>
	
""")))})),format.raw/*20.2*/("""
"""))}
    }
    
    def render(farmerForm:Form[Farmer]): play.api.templates.Html = apply(farmerForm)
    
    def f:((Form[Farmer]) => play.api.templates.Html) = (farmerForm) => apply(farmerForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/register.scala.html
                    HASH: d29286a9f6217f8fb14d78f001f39970f59cbd50
                    MATRIX: 732->1|851->27|879->46|915->48|937->62|976->64|1050->104|1094->140|1133->142|1175->149|1277->229|1317->234|1421->316|1462->322|1572->410|1611->414|1709->490|1750->496|1854->578|1895->584|2012->678|2118->753|2166->765|2181->771|2223->791|2268->805
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|45->17|46->18|46->18|46->18|48->20
                    -- GENERATED --
                */
            
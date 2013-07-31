
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Farmer],Farmer,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(farmerForm: Form[Farmer], farmer: Farmer):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	<h1>Editing Farmer</h1>
	
	"""),_display_(Seq[Any](/*9.3*/form(routes.Application.update(farmer.id))/*9.45*/ {_display_(Seq[Any](format.raw/*9.47*/("""
	    """),_display_(Seq[Any](/*10.7*/inputText(farmerForm("username"), '_label -> "Name", '_showConstraints -> false))),format.raw/*10.87*/(""" 
		"""),_display_(Seq[Any](/*11.4*/inputText(farmerForm("useremail"), '_label -> "Email", '_showConstraints -> false))),format.raw/*11.86*/("""
	  	"""),_display_(Seq[Any](/*12.6*/inputPassword(farmerForm("password"), '_label -> "Password", '_showConstraints -> false))),format.raw/*12.94*/("""
		"""),_display_(Seq[Any](/*13.4*/inputText(farmerForm("farm"), '_label -> "Farm", '_showConstraints -> false))),format.raw/*13.80*/("""
	  	"""),_display_(Seq[Any](/*14.6*/inputText(farmerForm("produce"), '_label -> "Produce", '_showConstraints -> false))),format.raw/*14.88*/("""
	  	"""),_display_(Seq[Any](/*15.6*/inputText(farmerForm("produce_price"), '_label -> "Produce Price", '_showConstraints -> false))),format.raw/*15.100*/("""
	  	<input type="submit" class="btn btn-primary" value="Update Farmer">
	""")))})),format.raw/*17.3*/("""

""")))})),format.raw/*19.2*/("""
"""))}
    }
    
    def render(farmerForm:Form[Farmer],farmer:Farmer): play.api.templates.Html = apply(farmerForm,farmer)
    
    def f:((Form[Farmer],Farmer) => play.api.templates.Html) = (farmerForm,farmer) => apply(farmerForm,farmer)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/edit.scala.html
                    HASH: 606947de1986055b55f47bd98498359c2b8292cc
                    MATRIX: 735->1|870->43|898->62|934->64|956->78|995->80|1060->111|1110->153|1149->155|1191->162|1293->242|1333->247|1437->329|1478->335|1588->423|1627->427|1725->503|1766->509|1870->591|1911->597|2028->691|2134->766|2168->769
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|37->9|37->9|37->9|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|42->14|42->14|43->15|43->15|45->17|47->19
                    -- GENERATED --
                */
            
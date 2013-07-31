
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
object buy extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Farmer,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(farmer: Farmer, checkout_uri: String):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	<h1 class="floatLeft">Buy """),_display_(Seq[Any](/*7.29*/farmer/*7.35*/.produce)),format.raw/*7.43*/(""" from """),_display_(Seq[Any](/*7.50*/farmer/*7.56*/.farm)),format.raw/*7.61*/(""" for $"""),_display_(Seq[Any](/*7.68*/farmer/*7.74*/.produce_price)),format.raw/*7.88*/("""</h1>
	<p><a href=""""),_display_(Seq[Any](/*8.15*/routes/*8.21*/.Application.show(farmer.id))),format.raw/*8.49*/("""">Back to """),_display_(Seq[Any](/*8.60*/{farmer.username})),format.raw/*8.77*/("""'s """),_display_(Seq[Any](/*8.81*/farmer/*8.87*/.farm)),format.raw/*8.92*/(""" farm</a></p>
	
	<div id="wepay-iframe-div">
		<script type="text/javascript" src="https://www.wepay.com/js/iframe.wepay.js"></script>
		<script type="text/javascript">
			WePay.iframe_checkout("wepay-iframe-div", """"),_display_(Seq[Any](/*13.48*/checkout_uri)),format.raw/*13.60*/("""");
		</script>
	</div>
	
""")))})))}
    }
    
    def render(farmer:Farmer,checkout_uri:String): play.api.templates.Html = apply(farmer,checkout_uri)
    
    def f:((Farmer,String) => play.api.templates.Html) = (farmer,checkout_uri) => apply(farmer,checkout_uri)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/buy.scala.html
                    HASH: 1a8fc1f098f8845868c9496f9d137e1c055c282a
                    MATRIX: 728->1|859->39|887->58|923->60|945->74|984->76|1049->106|1063->112|1092->120|1134->127|1148->133|1174->138|1216->145|1230->151|1265->165|1320->185|1334->191|1383->219|1429->230|1467->247|1506->251|1520->257|1546->262|1798->478|1832->490
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|35->7|36->8|36->8|36->8|36->8|36->8|36->8|36->8|36->8|41->13|41->13
                    -- GENERATED --
                */
            
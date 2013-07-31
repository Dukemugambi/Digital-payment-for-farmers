
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Farmer],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(flash: String, farmers: List[Farmer]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("WeFarm")/*5.16*/ {_display_(Seq[Any](format.raw/*5.18*/("""

	"""),_display_(Seq[Any](/*7.3*/if(flash!=null)/*7.18*/ {_display_(Seq[Any](format.raw/*7.20*/("""
		<div class="alert alert-block alert-info">
			"""),_display_(Seq[Any](/*9.5*/flash)),format.raw/*9.10*/("""
		</div>
	""")))})),format.raw/*11.3*/("""
    
    <h1>Welcome to WeFarm</h1>
    <p>You can buy lots of fresh and local produce here. If you are a farmer and want to sell your produce, please register.</p>
    <br>

    <h3>Our farmers</h3>
    <table class="table table-striped table-bordered">
    	<tbody>
	    	<tr>
	    		<th>Farmer</th>
	    		<th>Farm</th>
	    		<th>Produce</th>
	    		<th>Produce Price</th>
	    	</tr>
	    	"""),_display_(Seq[Any](/*26.8*/for(farmer <- farmers) yield /*26.30*/ {_display_(Seq[Any](format.raw/*26.32*/("""
		    	<tr>
		    		<td><a href=""""),_display_(Seq[Any](/*28.23*/routes/*28.29*/.Application.show(farmer.id))),format.raw/*28.57*/("""">"""),_display_(Seq[Any](/*28.60*/farmer/*28.66*/.username)),format.raw/*28.75*/("""</a></td>
		    		<td><a href=""""),_display_(Seq[Any](/*29.23*/routes/*29.29*/.Application.show(farmer.id))),format.raw/*29.57*/("""">"""),_display_(Seq[Any](/*29.60*/farmer/*29.66*/.farm)),format.raw/*29.71*/("""</a></td>
		    		<td>"""),_display_(Seq[Any](/*30.14*/farmer/*30.20*/.produce)),format.raw/*30.28*/("""</td>
		    		<td>$"""),_display_(Seq[Any](/*31.15*/farmer/*31.21*/.produce_price)),format.raw/*31.35*/("""</td>
		    	</tr>
			""")))})),format.raw/*33.5*/("""
    	</tbody>
    </table>

""")))})),format.raw/*37.2*/("""
"""))}
    }
    
    def render(flash:String,farmers:List[Farmer]): play.api.templates.Html = apply(flash,farmers)
    
    def f:((String,List[Farmer]) => play.api.templates.Html) = (flash,farmers) => apply(flash,farmers)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/index.scala.html
                    HASH: 9bf2f75e987f6a029eb08a86bbb6363b636e19f6
                    MATRIX: 736->1|867->39|895->58|931->60|953->74|992->76|1030->80|1053->95|1092->97|1176->147|1202->152|1245->164|1677->561|1715->583|1755->585|1826->620|1841->626|1891->654|1930->657|1945->663|1976->672|2044->704|2059->710|2109->738|2148->741|2163->747|2190->752|2249->775|2264->781|2294->789|2350->809|2365->815|2401->829|2455->852|2516->882
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9|37->9|39->11|54->26|54->26|54->26|56->28|56->28|56->28|56->28|56->28|56->28|57->29|57->29|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|61->33|65->37
                    -- GENERATED --
                */
            
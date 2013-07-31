
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
						<span class="icon-bar">
						<span class="icon-bar">
						<span class="icon-bar">
					</button>
					<a href=""""),_display_(Seq[Any](/*21.16*/routes/*21.22*/.Application.index())),format.raw/*21.42*/("""" class="brand">WeFarm</a>
					<div class="nav-collapse collapse">					
						<ul class="nav pull-right">   
							"""),_display_(Seq[Any](/*24.9*/if(session().isEmpty())/*24.32*/ {_display_(Seq[Any](format.raw/*24.34*/("""         
								<li>
									<td><a href=""""),_display_(Seq[Any](/*26.24*/routes/*26.30*/.Application.register())),format.raw/*26.53*/("""">Register</a></td>
								</li>
								<li>
									<td><a href=""""),_display_(Seq[Any](/*29.24*/routes/*29.30*/.Session.login())),format.raw/*29.46*/("""">Login</a></td>
								</li>
							""")))}/*31.10*/else/*31.15*/{_display_(Seq[Any](format.raw/*31.16*/("""
								<li>
									<td><a href=""""),_display_(Seq[Any](/*33.24*/routes/*33.30*/.Session.logout())),format.raw/*33.47*/("""">Logout</a></td>
								</li>
							""")))})),format.raw/*35.9*/("""
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row-fluid">
				<div class="span8">
				</div>
			</div>
			
			"""),_display_(Seq[Any](/*47.5*/content)),format.raw/*47.12*/("""
			
        </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 31 13:47:52 PDT 2013
                    SOURCE: /Users/adamsommer/Documents/workspace/WeFarm/app/views/main.scala.html
                    HASH: 9ebb34a14d65f92a13e5d359c9b94a9e8c579bcc
                    MATRIX: 727->1|834->31|922->84|948->89|1045->151|1059->157|1114->191|1210->252|1224->258|1277->290|1338->315|1353->321|1420->366|1849->759|1864->765|1906->785|2059->903|2091->926|2131->928|2213->974|2228->980|2273->1003|2379->1073|2394->1079|2432->1095|2490->1135|2503->1140|2542->1141|2615->1178|2630->1184|2669->1201|2740->1241|2936->1402|2965->1409
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|49->21|49->21|49->21|52->24|52->24|52->24|54->26|54->26|54->26|57->29|57->29|57->29|59->31|59->31|59->31|61->33|61->33|61->33|63->35|75->47|75->47
                    -- GENERATED --
                */
            
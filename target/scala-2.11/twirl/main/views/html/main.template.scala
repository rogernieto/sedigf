
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,WebJarAssets,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*8.2*/(title: String)(webJarAssets: WebJarAssets)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.60*/("""

"""),format.raw/*10.1*/("""<!DOCTYPE html>
<html lang="en" ng-app="myApp">
    <head>
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*15.59*/routes/*15.65*/.Assets.versioned("images/favicon.png")),format.raw/*15.104*/("""">

        <!-- Bootstrap 3.3.6 -->
        <link rel='stylesheet' href='"""),_display_(/*18.39*/routes/*18.45*/.WebJarAssets.at(webJarAssets.locate("css/bootstrap.min.css"))),format.raw/*18.107*/("""'>

        <!-- Custom CSS Links -->
        <link rel="stylesheet" media="screen" href=""""),_display_(/*21.54*/routes/*21.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*21.101*/("""">

    </head>
    <body>

    <header>
         <ul class="nav nav-tabs">
          <li class="active"><a href=""""),_display_(/*28.40*/routes/*28.46*/.Application.index),format.raw/*28.64*/("""">Inicio</a></li>
          <li><a href=""""),_display_(/*29.25*/routes/*29.31*/.Edan.index),format.raw/*29.42*/("""">Ficha Edan</a></li>
          <li><a href=""""),_display_(/*30.25*/routes/*30.31*/.Usuario.index),format.raw/*30.45*/("""">Usuarios</a></li>
        </ul>
    </header>

        <div class="container-fluid body-content">
            """),_display_(/*35.14*/content),format.raw/*35.21*/("""
        """),format.raw/*36.9*/("""</div>

        <!-- Plugin Javascript -->
        <script type="text/javascript" src='"""),_display_(/*39.46*/routes/*39.52*/.WebJarAssets.at(webJarAssets.locate("jquery.min.js"))),format.raw/*39.106*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*40.46*/routes/*40.52*/.WebJarAssets.at(webJarAssets.locate("js/bootstrap.min.js"))),format.raw/*40.112*/("""'></script>
        <script type="text/javascript" src='"""),_display_(/*41.46*/routes/*41.52*/.WebJarAssets.at(webJarAssets.locate("angular.min.js"))),format.raw/*41.107*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*42.45*/routes/*42.51*/.WebJarAssets.at(webJarAssets.locate("ui-bootstrap-tpls.min.js"))),format.raw/*42.116*/("""'></script>
       <script type="text/javascript" src='"""),_display_(/*43.45*/routes/*43.51*/.WebJarAssets.at(webJarAssets.locate("angular-animate.min.js"))),format.raw/*43.114*/("""'></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,webJarAssets:WebJarAssets,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(webJarAssets)(content)

  def f:((String) => (WebJarAssets) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (webJarAssets) => (content) => apply(title)(webJarAssets)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 17:35:28 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/main.scala.html
                  HASH: 3c8b42e93ed22806a08e498288543b0c1626be32
                  MATRIX: 797->261|950->319|979->321|1081->396|1107->401|1202->469|1217->475|1278->514|1380->589|1395->595|1479->657|1597->748|1612->754|1675->795|1817->910|1832->916|1871->934|1940->976|1955->982|1987->993|2060->1039|2075->1045|2110->1059|2250->1172|2278->1179|2314->1188|2429->1276|2444->1282|2520->1336|2604->1393|2619->1399|2701->1459|2785->1516|2800->1522|2877->1577|2960->1633|2975->1639|3062->1704|3145->1760|3160->1766|3245->1829
                  LINES: 25->8|30->8|32->10|35->13|35->13|37->15|37->15|37->15|40->18|40->18|40->18|43->21|43->21|43->21|50->28|50->28|50->28|51->29|51->29|51->29|52->30|52->30|52->30|57->35|57->35|58->36|61->39|61->39|61->39|62->40|62->40|62->40|63->41|63->41|63->41|64->42|64->42|64->42|65->43|65->43|65->43
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexEdan_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class indexEdan extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("SED")/*3.13*/(webJarAssets)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""
"""),format.raw/*4.1*/("""<div ng-controller="edCtrl">

    <div>
        <div class="row app-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 100%;" type="text" ng-model="searchEdan" placeholder="Buscar ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>

        <div class="col-sm-4 col-md-4 col-lg-4">
          <botton class="btn btn-success btn-sm add-button" style="font-weight: 600;" data-toggle="modal" data-target="#nuevoEdanModal">Agregar Ficha Edan</botton>
        </div>
        </div>
     </div>
    <hr>

    """),_display_(/*26.6*/views/*26.11*/.html.edan.edanList()),format.raw/*26.32*/("""
    """),_display_(/*27.6*/views/*27.11*/.html.edan.nuevoEdanForm()),format.raw/*27.37*/("""
    """),_display_(/*28.6*/views/*28.11*/.html.edan.editarEdanForm()),format.raw/*28.38*/("""

"""),format.raw/*30.1*/("""</div>
""")))}),format.raw/*31.2*/("""

"""),format.raw/*33.1*/("""<script type="text/javascript" src=""""),_display_(/*33.38*/routes/*33.44*/.Assets.versioned("javascripts/cedan.js")),format.raw/*33.85*/(""""></script>"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)

  def f:((WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => apply(webJarAssets)

  def ref: this.type = this

}


}

/**/
object indexEdan extends indexEdan_Scope0.indexEdan
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 01:19:50 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/indexEdan.scala.html
                  HASH: cd4ffe221890bf3aa1144bd8e51304070818cf9c
                  MATRIX: 541->1|664->29|692->32|711->43|733->57|772->59|799->60|1640->875|1654->880|1696->901|1728->907|1742->912|1789->938|1821->944|1835->949|1883->976|1912->978|1950->986|1979->988|2043->1025|2058->1031|2120->1072
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|28->4|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|54->30|55->31|57->33|57->33|57->33|57->33
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object indexUsuario_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class indexUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("SED")/*3.13*/(webJarAssets)/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""

"""),format.raw/*5.1*/("""<div ng-controller="userCtrl">

    <div>
        <div class="row app-header">
            <!-- Employee search -->
        <div class="col-sm-4 col-md-4 col-lg-4">
            <input class="form-control" style="width: 70%;" type="text" ng-model="searchUser" placeholder="Buscar ..."/>
        </div>
            <!-- Alert messages -->
            <div class="col-sm-4 col-md-4 col-lg-4">
                <div ng-repeat="alert in alerts">
                <notification ng-model="alert"></notification>
                </div>
            </div>

        <div class="col-sm-4 col-md-4 col-lg-4">
          <botton class="btn btn-success btn-sm add-button" style="font-weight: 600;" data-toggle="modal" data-target="#nuevoUsuarioModal">Agregar Usuario</botton>
        </div>
        </div>
     </div>
    <hr>

    """),_display_(/*27.6*/views/*27.11*/.html.usuario.usuarioList()),format.raw/*27.38*/("""
    """),_display_(/*28.6*/views/*28.11*/.html.usuario.nuevoUsuarioForm()),format.raw/*28.43*/("""
    """),_display_(/*29.6*/views/*29.11*/.html.usuario.editarUsuarioForm()),format.raw/*29.44*/("""
"""),format.raw/*30.1*/("""</div>

""")))}),format.raw/*32.2*/("""

 """),format.raw/*34.2*/("""<script type="text/javascript" src=""""),_display_(/*34.39*/routes/*34.45*/.Assets.versioned("javascripts/cuser.js")),format.raw/*34.86*/(""""></script>
"""))
      }
    }
  }

  def render(webJarAssets:WebJarAssets): play.twirl.api.HtmlFormat.Appendable = apply(webJarAssets)

  def f:((WebJarAssets) => play.twirl.api.HtmlFormat.Appendable) = (webJarAssets) => apply(webJarAssets)

  def ref: this.type = this

}


}

/**/
object indexUsuario extends indexUsuario_Scope0.indexUsuario
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 00:14:07 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/indexUsuario.scala.html
                  HASH: 54ffd5a547a12bc0e221324670a27665e46d5481
                  MATRIX: 547->1|670->29|698->32|717->43|739->57|778->59|806->61|1648->877|1662->882|1710->909|1742->915|1756->920|1809->952|1841->958|1855->963|1909->996|1937->997|1976->1006|2006->1009|2070->1046|2085->1052|2147->1093
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|56->32|58->34|58->34|58->34|58->34
                  -- GENERATED --
              */
          

package views.html.edan

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edanList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class edanList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Entrevistador</th>
    <th>Cargo</th>
    <th>Insitucion</th>
    <th>Telefono</th>
    <th>Correo Electronico</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="eds in fichas | filter: searchEdan">
        <td>"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""eds.entrevistador"""),format.raw/*13.32*/("""}"""),format.raw/*13.33*/("""}"""),format.raw/*13.34*/("""</td>
        <td>"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""{"""),format.raw/*14.15*/("""eds.cargo"""),format.raw/*14.24*/("""}"""),format.raw/*14.25*/("""}"""),format.raw/*14.26*/("""</td>
        <td>"""),format.raw/*15.13*/("""{"""),format.raw/*15.14*/("""{"""),format.raw/*15.15*/("""eds.institucion"""),format.raw/*15.30*/("""}"""),format.raw/*15.31*/("""}"""),format.raw/*15.32*/("""</td>
        <td>"""),format.raw/*16.13*/("""{"""),format.raw/*16.14*/("""{"""),format.raw/*16.15*/("""eds.telefono"""),format.raw/*16.27*/("""}"""),format.raw/*16.28*/("""}"""),format.raw/*16.29*/("""</td>
        <td>"""),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""{"""),format.raw/*17.15*/("""eds.email"""),format.raw/*17.24*/("""}"""),format.raw/*17.25*/("""}"""),format.raw/*17.26*/("""</td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editarEdanModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editEdan(eds)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Seguro que desea borrar?" ng-confirm-click="deleteEdan(eds.id)">
            </i>
        </td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Mostrando <strong style="color: rgb(42, 41, 41);">"""),format.raw/*30.88*/("""{"""),format.raw/*30.89*/("""{"""),format.raw/*30.90*/(""" """),format.raw/*30.91*/("""(fichas | filter:searchEdan).length """),format.raw/*30.127*/("""}"""),format.raw/*30.128*/("""}"""),format.raw/*30.129*/("""</strong> de <strong style="color: rgb(16, 106, 135);">"""),format.raw/*30.184*/("""{"""),format.raw/*30.185*/("""{"""),format.raw/*30.186*/("""fichas.length"""),format.raw/*30.199*/("""}"""),format.raw/*30.200*/("""}"""),format.raw/*30.201*/("""</strong> Registros</p>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object edanList extends edanList_Scope0.edanList
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 00:45:13 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/edan/edanList.scala.html
                  HASH: f439e20f275c8c5f269d8abec76b2a3d1aa93daf
                  MATRIX: 620->0|939->291|968->292|997->293|1042->310|1071->311|1100->312|1146->330|1175->331|1204->332|1241->341|1270->342|1299->343|1345->361|1374->362|1403->363|1446->378|1475->379|1504->380|1550->398|1579->399|1608->400|1648->412|1677->413|1706->414|1752->432|1781->433|1810->434|1847->443|1876->444|1905->445|2510->1022|2539->1023|2568->1024|2597->1025|2662->1061|2692->1062|2722->1063|2806->1118|2836->1119|2866->1120|2908->1133|2938->1134|2968->1135
                  LINES: 25->1|37->13|37->13|37->13|37->13|37->13|37->13|38->14|38->14|38->14|38->14|38->14|38->14|39->15|39->15|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|41->17|41->17|41->17|41->17|41->17|41->17|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30|54->30
                  -- GENERATED --
              */
          
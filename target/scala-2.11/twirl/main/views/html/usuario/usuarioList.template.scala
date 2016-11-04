
package views.html.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarioList_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class usuarioList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<table class="table table-hover">
    <thead>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Email</th>
    <th></th>
    <th></th>
    </thead>
    <tbody>
    <tr ng-repeat="usu in usuarios | filter: searchUser">
        <td>"""),format.raw/*11.13*/("""{"""),format.raw/*11.14*/("""{"""),format.raw/*11.15*/("""usu.nombre"""),format.raw/*11.25*/("""}"""),format.raw/*11.26*/("""}"""),format.raw/*11.27*/("""</td>
        <td>"""),format.raw/*12.13*/("""{"""),format.raw/*12.14*/("""{"""),format.raw/*12.15*/("""usu.apellidos"""),format.raw/*12.28*/("""}"""),format.raw/*12.29*/("""}"""),format.raw/*12.30*/("""</td>
        <td>"""),format.raw/*13.13*/("""{"""),format.raw/*13.14*/("""{"""),format.raw/*13.15*/("""usu.email"""),format.raw/*13.24*/("""}"""),format.raw/*13.25*/("""}"""),format.raw/*13.26*/("""</td>
        <td>
            <i title="Edit" style="color: #128d36;" data-toggle="modal" data-target="#editarUsuarioModal" class="glyphicon glyphicon-edit cursorPointer" ng-click="editUsuario(usu)">
            </i>
        </td>
        <td>
            <i title="Delete" style="color: #d85010;" class="glyphicon glyphicon-trash cursorPointer" ng-confirm-message="Seguro que desea borrar?" ng-confirm-click="deleteUsuario(usu.id)">
            </i>
        </td>
    </tr>
    </tbody>
</table>

<p style="color: rgb(110, 114, 114)">Mostrando <strong style="color: rgb(42, 41, 41);">"""),format.raw/*26.88*/("""{"""),format.raw/*26.89*/("""{"""),format.raw/*26.90*/(""" """),format.raw/*26.91*/("""(usuarios | filter:searchUser).length """),format.raw/*26.129*/("""}"""),format.raw/*26.130*/("""}"""),format.raw/*26.131*/("""</strong> de <strong style="color: rgb(16, 106, 135);">"""),format.raw/*26.186*/("""{"""),format.raw/*26.187*/("""{"""),format.raw/*26.188*/("""usuarios.length"""),format.raw/*26.203*/("""}"""),format.raw/*26.204*/("""}"""),format.raw/*26.205*/("""</strong> Registros</p>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object usuarioList extends usuarioList_Scope0.usuarioList
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 15:29:28 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/usuario/usuarioList.scala.html
                  HASH: 82f27971696182cda4908aeb648725847bc574ae
                  MATRIX: 629->0|887->230|916->231|945->232|983->242|1012->243|1041->244|1087->262|1116->263|1145->264|1186->277|1215->278|1244->279|1290->297|1319->298|1348->299|1385->308|1414->309|1443->310|2057->896|2086->897|2115->898|2144->899|2211->937|2241->938|2271->939|2355->994|2385->995|2415->996|2459->1011|2489->1012|2519->1013
                  LINES: 25->1|35->11|35->11|35->11|35->11|35->11|35->11|36->12|36->12|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26|50->26
                  -- GENERATED --
              */
          
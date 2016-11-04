
package views.html.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object nuevoUsuarioForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class nuevoUsuarioForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<form id="nuevoUsuarioForm" role="form" ng-submit="addUsuario()">
    <div class="modal fade" id="nuevoUsuarioModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Crear Usuario</h4>
                </div>
                <div class="modal-body">

                    <div class="form-group">
                        <label for="userNombre">Nombre</label>
                        <input type="text" class="form-control" id="userNombre" name="nombre" ng-model="newUsuario.nombre" placeholder="Nombre" required>
                    </div>

                    <div class="form-group">
                        <label for="userApellidos">Apellidos</label>
                        <input type="text" class="form-control" id="userApellidos" name="apellidos" ng-model="newUsuario.apellidos" placeholder="Apellidos" required>
                    </div>

                    <div class="form-group">
                        <label for="userEmail">Email</label>
                        <input type="email" class="form-control" id="userEmail"  name="email" ng-model="newUsuario.email" placeholder="Correo Electronico" required>
                    </div>

                    <div class="form-group">
                        <label for="userPassword">Contrasena</label>
                        <input type="password" class="form-control" id="userPassword"  name="password" ng-model="newUsuario.password" placeholder="Contrasena" required>
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancel</button>
                    <input type="submit" ng-disabled="nuevoUsuarioForm.$invalid" class="btn btn-warning" id="submit" value="Agregar" />
                </div>
            </div>
        </div>
    </div>
</form>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object nuevoUsuarioForm extends nuevoUsuarioForm_Scope0.nuevoUsuarioForm
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 16:10:43 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/usuario/nuevoUsuarioForm.scala.html
                  HASH: 68e2ea436fff01d51414588a34a4c1e34b7156a0
                  MATRIX: 639->0
                  LINES: 25->1
                  -- GENERATED --
              */
          
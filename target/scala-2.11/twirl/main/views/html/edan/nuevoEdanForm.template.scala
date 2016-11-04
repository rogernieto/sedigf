
package views.html.edan

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object nuevoEdanForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class nuevoEdanForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<form id="nuevoEdanForm" role="form" ng-submit="addEdan()">
    <div class="modal fade" id="nuevoEdanModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Crear Ficha Edan</h4>
                </div>
                <div class="modal-body">


                    <div class="form-group">
                        <label for="edanTelefono">Telefono</label>
                        <input type="text" class="form-control" id="edanTelefono" name="telefono" ng-model="newEdan.telefono" placeholder="Telefono" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="edanEmail">Correo Electronico</label>
                        <input type="email" class="form-control" id="edanEmail" name="email" ng-model="newEdan.email" placeholder="Correo Electronico" required>
                    </div>
                    
                    			    			<div class="row">
			    				<div class="col-xs-4 col-sm-4 col-md-4">
			    					<div class="form-group">
			                          <input type="text" name="entrevistador" class="form-control input-sm" ng-model="newEdan.entrevistador"  placeholder="Nombre del Entrevistador">
			    					</div>
			    				</div>
			    				<div class="col-xs-4 col-sm-4 col-md-4">
			    					<div class="form-group">
			    						<input type="text" name="cargo" class="form-control input-sm" ng-model="newEdan.cargo" placeholder="Cargo">
			    					</div>
			    				</div>
			    				<div class="col-xs-4 col-sm-4 col-md-4">
			    					<div class="form-group">
			    						<input type="text" name="institucion"  class="form-control input-sm" ng-model="newEdan.institucion" placeholder="Institucion">
			    					</div>
			    				</div>
			    			</div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancel</button>
                    <input type="submit" ng-disabled="nuevoEdanForm.$invalid" class="btn btn-warning" id="submit" value="Agregar" />
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
object nuevoEdanForm extends nuevoEdanForm_Scope0.nuevoEdanForm
              /*
                  -- GENERATED --
                  DATE: Wed Nov 02 01:33:38 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/edan/nuevoEdanForm.scala.html
                  HASH: ecb74a99cf9f9b168ad98c466065e00488aef404
                  MATRIX: 630->0
                  LINES: 25->1
                  -- GENERATED --
              */
          
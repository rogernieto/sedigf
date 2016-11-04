
package views.html.usuario

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editarUsuarioForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editarUsuarioForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<form name="editarUsuarioForm" ng-submit="updateUsuario()">
    <div class="modal fade" id="editarUsuarioModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Editar Usuario</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" ng-model="selectedUsuario.nombre" id="nombre" value=""""),format.raw/*14.118*/("""{"""),format.raw/*14.119*/("""{"""),format.raw/*14.120*/("""selectedUsuario.nombre"""),format.raw/*14.142*/("""}"""),format.raw/*14.143*/("""}"""),format.raw/*14.144*/("""" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="apellidos">Apellidos</label>
                        <input type="text" class="form-control" ng-model="selectedUsuario.apellidos" value=""""),format.raw/*19.109*/("""{"""),format.raw/*19.110*/("""{"""),format.raw/*19.111*/("""selectedUsuario.apellidos"""),format.raw/*19.136*/("""}"""),format.raw/*19.137*/("""}"""),format.raw/*19.138*/("""" id="apellidos" required>
                    </div>

                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" ng-model="selectedUsuario.email" id="email" required value=""""),format.raw/*24.126*/("""{"""),format.raw/*24.127*/("""{"""),format.raw/*24.128*/("""selectedUsuario.email"""),format.raw/*24.149*/("""}"""),format.raw/*24.150*/("""}"""),format.raw/*24.151*/("""">
                    </div>



                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancelar</button>
                    <input type="submit" ng-disabled="editarUsuarioForm.$invalid" class="btn btn-warning" value="Actualizar" />
                </div>
            </div>
        </div>
    </div>
</form>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/**/
object editarUsuarioForm extends editarUsuarioForm_Scope0.editarUsuarioForm
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 16:12:56 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/usuario/editarUsuarioForm.scala.html
                  HASH: 7e8f2700b72a6e75c3147ddc97a2cb419f0dab0a
                  MATRIX: 556->1|663->13|691->15|1539->834|1569->835|1599->836|1650->858|1680->859|1710->860|2017->1138|2047->1139|2077->1140|2131->1165|2161->1166|2191->1167|2502->1449|2532->1450|2562->1451|2612->1472|2642->1473|2672->1474
                  LINES: 20->1|25->1|27->3|38->14|38->14|38->14|38->14|38->14|38->14|43->19|43->19|43->19|43->19|43->19|43->19|48->24|48->24|48->24|48->24|48->24|48->24
                  -- GENERATED --
              */
          
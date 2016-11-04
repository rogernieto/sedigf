
package views.html.edan

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editarEdanForm_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class editarEdanForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.14*/("""

"""),format.raw/*3.1*/("""<form name="editarEdanForm" ng-submit="updateEdan()">
    <div class="modal fade" id="editarEdanModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" >
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">Editar Ficha Edan</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="entrevistador">Entrevistador</label>
                        <input type="text" class="form-control" ng-model="selectedEdan.entrevistador" id="entrevistador" value=""""),format.raw/*14.129*/("""{"""),format.raw/*14.130*/("""{"""),format.raw/*14.131*/("""selectedEdan.entrevistador"""),format.raw/*14.157*/("""}"""),format.raw/*14.158*/("""}"""),format.raw/*14.159*/("""" required>
                    </div>
                    
                    <div class="form-group">
                        <label for="cargo">Cargo</label>
                        <input type="text" class="form-control" ng-model="selectedEdan.cargo" value=""""),format.raw/*19.102*/("""{"""),format.raw/*19.103*/("""{"""),format.raw/*19.104*/("""selectedEdan.cargo"""),format.raw/*19.122*/("""}"""),format.raw/*19.123*/("""}"""),format.raw/*19.124*/("""" id="cargo" required>
                    </div>

                    <div class="form-group">
                        <label for="institucion">Institucion</label>
                        <input type="text" class="form-control" ng-model="selectedEdan.institucion" id="institucion" required value=""""),format.raw/*24.134*/("""{"""),format.raw/*24.135*/("""{"""),format.raw/*24.136*/("""selectedEdan.institucionl"""),format.raw/*24.161*/("""}"""),format.raw/*24.162*/("""}"""),format.raw/*24.163*/("""">
                    </div>

                       <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="text" class="form-control" ng-model="selectedEdan.telefono" value=""""),format.raw/*29.105*/("""{"""),format.raw/*29.106*/("""{"""),format.raw/*29.107*/("""selectedEdan.telefono"""),format.raw/*29.128*/("""}"""),format.raw/*29.129*/("""}"""),format.raw/*29.130*/("""" id="telefono" required>
                    </div>

                    <div class="form-group">
                        <label for="email">Correo Electronico</label>
                        <input type="email" class="form-control" ng-model="selectedEdan.email" id="email" required value=""""),format.raw/*34.123*/("""{"""),format.raw/*34.124*/("""{"""),format.raw/*34.125*/("""selectedEdan.email"""),format.raw/*34.143*/("""}"""),format.raw/*34.144*/("""}"""),format.raw/*34.145*/("""">
                    </div>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal" >Cancelar</button>
                    <input type="submit" ng-disabled="editarEdanForm.$invalid" class="btn btn-warning" value="Actualizar" />
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
object editarEdanForm extends editarEdanForm_Scope0.editarEdanForm
              /*
                  -- GENERATED --
                  DATE: Tue Nov 01 22:01:26 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/edan/editarEdanForm.scala.html
                  HASH: a6b6db1e71b448a3f0b0be89369d355acfff2d38
                  MATRIX: 547->1|654->13|682->15|1549->853|1579->854|1609->855|1664->881|1694->882|1724->883|2016->1146|2046->1147|2076->1148|2123->1166|2153->1167|2183->1168|2510->1466|2540->1467|2570->1468|2624->1493|2654->1494|2684->1495|2959->1741|2989->1742|3019->1743|3069->1764|3099->1765|3129->1766|3449->2057|3479->2058|3509->2059|3556->2077|3586->2078|3616->2079
                  LINES: 20->1|25->1|27->3|38->14|38->14|38->14|38->14|38->14|38->14|43->19|43->19|43->19|43->19|43->19|43->19|48->24|48->24|48->24|48->24|48->24|48->24|53->29|53->29|53->29|53->29|53->29|53->29|58->34|58->34|58->34|58->34|58->34|58->34
                  -- GENERATED --
              */
          
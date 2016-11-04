
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[WebJarAssets,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(webJarAssets: WebJarAssets):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Play Angular App")/*3.26*/(webJarAssets)/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""

""")))}),format.raw/*5.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 03 17:35:28 CST 2016
                  SOURCE: /home/desconocido/Descargas/sed/app/views/index.scala.html
                  HASH: 17e05f570de2a8746e1b8275a086591b37e8481e
                  MATRIX: 533->1|656->29|684->32|716->56|738->70|777->72|809->75
                  LINES: 20->1|25->1|27->3|27->3|27->3|27->3|29->5
                  -- GENERATED --
              */
          
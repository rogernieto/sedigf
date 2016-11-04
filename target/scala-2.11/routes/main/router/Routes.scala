
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Descargas/sed/conf/routes
// @DATE:Thu Nov 03 17:35:27 CST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:8
  Usuario_0: controllers.Usuario,
  // @LINE:10
  Edan_1: controllers.Edan,
  // @LINE:14
  UsuarioController_3: controllers.UsuarioController,
  // @LINE:26
  EdanController_2: controllers.EdanController,
  // @LINE:37
  Assets_4: controllers.Assets,
  // @LINE:40
  WebJarAssets_5: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:8
    Usuario_0: controllers.Usuario,
    // @LINE:10
    Edan_1: controllers.Edan,
    // @LINE:14
    UsuarioController_3: controllers.UsuarioController,
    // @LINE:26
    EdanController_2: controllers.EdanController,
    // @LINE:37
    Assets_4: controllers.Assets,
    // @LINE:40
    WebJarAssets_5: controllers.WebJarAssets
  ) = this(errorHandler, Application_6, Usuario_0, Edan_1, UsuarioController_3, EdanController_2, Assets_4, WebJarAssets_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Usuario_0, Edan_1, UsuarioController_3, EdanController_2, Assets_4, WebJarAssets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuarios""", """controllers.Usuario.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fedan""", """controllers.Edan.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/list""", """controllers.UsuarioController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/create""", """controllers.UsuarioController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/edit""", """controllers.UsuarioController.edit(usuId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/update""", """controllers.UsuarioController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usu/delete""", """controllers.UsuarioController.delete(usuId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/list""", """controllers.EdanController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/create""", """controllers.EdanController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/edit""", """controllers.EdanController.edit(edId:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/update""", """controllers.EdanController.update"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """edan/delete""", """controllers.EdanController.delete(edId:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/""" + "$" + """file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Usuario_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuarios")))
  )
  private[this] lazy val controllers_Usuario_index1_invoker = createInvoker(
    Usuario_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Usuario",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """usuarios"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Edan_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fedan")))
  )
  private[this] lazy val controllers_Edan_index2_invoker = createInvoker(
    Edan_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Edan",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """fedan"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UsuarioController_list3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/list")))
  )
  private[this] lazy val controllers_UsuarioController_list3_invoker = createInvoker(
    UsuarioController_3.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "list",
      Nil,
      "GET",
      """ Rutas usuarios""",
      this.prefix + """usu/list"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UsuarioController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/create")))
  )
  private[this] lazy val controllers_UsuarioController_create4_invoker = createInvoker(
    UsuarioController_3.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """usu/create"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsuarioController_edit5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/edit")))
  )
  private[this] lazy val controllers_UsuarioController_edit5_invoker = createInvoker(
    UsuarioController_3.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """usu/edit"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_update6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/update")))
  )
  private[this] lazy val controllers_UsuarioController_update6_invoker = createInvoker(
    UsuarioController_3.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """usu/update"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UsuarioController_delete7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usu/delete")))
  )
  private[this] lazy val controllers_UsuarioController_delete7_invoker = createInvoker(
    UsuarioController_3.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """usu/delete"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_EdanController_list8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/list")))
  )
  private[this] lazy val controllers_EdanController_list8_invoker = createInvoker(
    EdanController_2.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """edan/list"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_EdanController_create9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/create")))
  )
  private[this] lazy val controllers_EdanController_create9_invoker = createInvoker(
    EdanController_2.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """edan/create"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_EdanController_edit10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/edit")))
  )
  private[this] lazy val controllers_EdanController_edit10_invoker = createInvoker(
    EdanController_2.edit(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "edit",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """edan/edit"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_EdanController_update11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/update")))
  )
  private[this] lazy val controllers_EdanController_update11_invoker = createInvoker(
    EdanController_2.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """edan/update"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_EdanController_delete12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("edan/delete")))
  )
  private[this] lazy val controllers_EdanController_delete12_invoker = createInvoker(
    EdanController_2.delete(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EdanController",
      "delete",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """edan/delete"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_WebJarAssets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at14_invoker = createInvoker(
    WebJarAssets_5.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """ WebJars""",
      this.prefix + """webjars/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index)
      }
  
    // @LINE:8
    case controllers_Usuario_index1_route(params) =>
      call { 
        controllers_Usuario_index1_invoker.call(Usuario_0.index)
      }
  
    // @LINE:10
    case controllers_Edan_index2_route(params) =>
      call { 
        controllers_Edan_index2_invoker.call(Edan_1.index)
      }
  
    // @LINE:14
    case controllers_UsuarioController_list3_route(params) =>
      call { 
        controllers_UsuarioController_list3_invoker.call(UsuarioController_3.list)
      }
  
    // @LINE:16
    case controllers_UsuarioController_create4_route(params) =>
      call { 
        controllers_UsuarioController_create4_invoker.call(UsuarioController_3.create)
      }
  
    // @LINE:18
    case controllers_UsuarioController_edit5_route(params) =>
      call(params.fromQuery[Int]("usuId", None)) { (usuId) =>
        controllers_UsuarioController_edit5_invoker.call(UsuarioController_3.edit(usuId))
      }
  
    // @LINE:20
    case controllers_UsuarioController_update6_route(params) =>
      call { 
        controllers_UsuarioController_update6_invoker.call(UsuarioController_3.update)
      }
  
    // @LINE:22
    case controllers_UsuarioController_delete7_route(params) =>
      call(params.fromQuery[Int]("usuId", None)) { (usuId) =>
        controllers_UsuarioController_delete7_invoker.call(UsuarioController_3.delete(usuId))
      }
  
    // @LINE:26
    case controllers_EdanController_list8_route(params) =>
      call { 
        controllers_EdanController_list8_invoker.call(EdanController_2.list)
      }
  
    // @LINE:28
    case controllers_EdanController_create9_route(params) =>
      call { 
        controllers_EdanController_create9_invoker.call(EdanController_2.create)
      }
  
    // @LINE:30
    case controllers_EdanController_edit10_route(params) =>
      call(params.fromQuery[Int]("edId", None)) { (edId) =>
        controllers_EdanController_edit10_invoker.call(EdanController_2.edit(edId))
      }
  
    // @LINE:32
    case controllers_EdanController_update11_route(params) =>
      call { 
        controllers_EdanController_update11_invoker.call(EdanController_2.update)
      }
  
    // @LINE:34
    case controllers_EdanController_delete12_route(params) =>
      call(params.fromQuery[Int]("edId", None)) { (edId) =>
        controllers_EdanController_delete12_invoker.call(EdanController_2.delete(edId))
      }
  
    // @LINE:37
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:40
    case controllers_WebJarAssets_at14_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at14_invoker.call(WebJarAssets_5.at(file))
      }
  }
}

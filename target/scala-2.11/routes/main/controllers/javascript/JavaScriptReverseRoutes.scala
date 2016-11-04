
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Descargas/sed/conf/routes
// @DATE:Thu Nov 03 17:35:27 CST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:37
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseWebJarAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WebJarAssets.at",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "webjars/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseUsuario(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Usuario.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseEdanController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/create"})
        }
      """
    )
  
    // @LINE:34
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.delete",
      """
        function(edId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("edId", edId0)])})
        }
      """
    )
  
    // @LINE:26
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/list"})
        }
      """
    )
  
    // @LINE:30
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.edit",
      """
        function(edId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("edId", edId0)])})
        }
      """
    )
  
    // @LINE:32
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EdanController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "edan/update"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseEdan(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Edan.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fedan"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/create"})
        }
      """
    )
  
    // @LINE:22
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.delete",
      """
        function(usuId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/delete" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("usuId", usuId0)])})
        }
      """
    )
  
    // @LINE:14
    def list: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.list",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/list"})
        }
      """
    )
  
    // @LINE:18
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.edit",
      """
        function(usuId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/edit" + _qS([(""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("usuId", usuId0)])})
        }
      """
    )
  
    // @LINE:20
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usu/update"})
        }
      """
    )
  
  }


}

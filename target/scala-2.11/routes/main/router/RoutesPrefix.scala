
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/desconocido/Descargas/sed/conf/routes
// @DATE:Thu Nov 03 17:35:27 CST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

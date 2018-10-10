// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bbesnard/formationPlay/test2/conf/routes
// @DATE:Wed Oct 10 08:49:31 CEST 2018


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

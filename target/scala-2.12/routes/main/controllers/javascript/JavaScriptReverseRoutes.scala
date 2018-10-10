// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bbesnard/formationPlay/test2/conf/routes
// @DATE:Wed Oct 10 14:21:29 CEST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseWSController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def post: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSController.post",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "send-persons"})
        }
      """
    )
  
    // @LINE:19
    def get: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSController.get",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clever-age"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseHelloworldController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def gotohome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.gotohome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gotohome"})
        }
      """
    )
  
    // @LINE:9
    def submit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.submit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "hello-world"})
        }
      """
    )
  
    // @LINE:15
    def gotohelloworld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.gotohelloworld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "gotohelloworld"})
        }
      """
    )
  
    // @LINE:10
    def pasTrouve: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.pasTrouve",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/pastrouve"})
        }
      """
    )
  
    // @LINE:12
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.hello",
      """
        function(name0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
          }
        
        }
      """
    )
  
    // @LINE:8
    def helloworld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.helloworld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello-world"})
        }
      """
    )
  
    // @LINE:16
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "get-persons"})
        }
      """
    )
  
    // @LINE:17
    def receivePerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.receivePerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "receive-persons"})
        }
      """
    )
  
    // @LINE:11
    def pasAutorise: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloworldController.pasAutorise",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/pasautorise"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def myChangeLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.myChangeLang",
      """
        function(code0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "change-lang" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("code", code0)])})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseEmployeeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def listAllActifByAge: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.listAllActifByAge",
      """
        function(order0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("order", order0)])})
        }
      """
    )
  
    // @LINE:25
    def formName: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.formName",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:22
    def listAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.listAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees"})
        }
      """
    )
  
    // @LINE:26
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EmployeeController.search",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
  }


}

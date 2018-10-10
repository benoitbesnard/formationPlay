// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bbesnard/formationPlay/test2/conf/routes
// @DATE:Wed Oct 10 08:49:31 CEST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def myChangeLang(code:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "change-lang" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("code", code)))))
    }
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseHelloworldController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def gotohome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gotohome")
    }
  
    // @LINE:9
    def submit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "hello-world")
    }
  
    // @LINE:15
    def gotohelloworld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "gotohelloworld")
    }
  
    // @LINE:10
    def pasTrouve(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/pastrouve")
    }
  
    // @LINE:12
    def hello(name:String): Call = {
    
      (name: @unchecked) match {
      
        // @LINE:12
        case (name)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "hello" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
      
      }
    
    }
  
    // @LINE:8
    def helloworld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello-world")
    }
  
    // @LINE:16
    def getPersons(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "get-persons")
    }
  
    // @LINE:17
    def receivePerson(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "receive-persons")
    }
  
    // @LINE:11
    def pasAutorise(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/pasautorise")
    }
  
  }


}

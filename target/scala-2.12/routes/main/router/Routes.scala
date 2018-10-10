// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bbesnard/formationPlay/test2/conf/routes
// @DATE:Wed Oct 10 08:49:31 CEST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:8
  HelloworldController_2: controllers.HelloworldController,
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:8
    HelloworldController_2: controllers.HelloworldController,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, HelloworldController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, HelloworldController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """change-lang""", """controllers.HomeController.myChangeLang(code:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello-world""", """controllers.HelloworldController.helloworld"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello-world""", """controllers.HelloworldController.submit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/pastrouve""", """controllers.HelloworldController.pasTrouve"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/pasautorise""", """controllers.HelloworldController.pasAutorise"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello""", """controllers.HelloworldController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/""" + "$" + """name<[^/]+>""", """controllers.HelloworldController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gotohome""", """controllers.HelloworldController.gotohome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """gotohelloworld""", """controllers.HelloworldController.gotohelloworld"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """get-persons""", """controllers.HelloworldController.getPersons"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """receive-persons""", """controllers.HelloworldController.receivePerson"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_myChangeLang1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("change-lang")))
  )
  private[this] lazy val controllers_HomeController_myChangeLang1_invoker = createInvoker(
    HomeController_0.myChangeLang(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "myChangeLang",
      Seq(classOf[String]),
      "GET",
      this.prefix + """change-lang""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HelloworldController_helloworld2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello-world")))
  )
  private[this] lazy val controllers_HelloworldController_helloworld2_invoker = createInvoker(
    HelloworldController_2.helloworld,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "helloworld",
      Nil,
      "GET",
      this.prefix + """hello-world""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HelloworldController_submit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello-world")))
  )
  private[this] lazy val controllers_HelloworldController_submit3_invoker = createInvoker(
    HelloworldController_2.submit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "submit",
      Nil,
      "POST",
      this.prefix + """hello-world""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HelloworldController_pasTrouve4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/pastrouve")))
  )
  private[this] lazy val controllers_HelloworldController_pasTrouve4_invoker = createInvoker(
    HelloworldController_2.pasTrouve,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "pasTrouve",
      Nil,
      "GET",
      this.prefix + """hello/pastrouve""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HelloworldController_pasAutorise5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/pasautorise")))
  )
  private[this] lazy val controllers_HelloworldController_pasAutorise5_invoker = createInvoker(
    HelloworldController_2.pasAutorise,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "pasAutorise",
      Nil,
      "GET",
      this.prefix + """hello/pasautorise""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HelloworldController_hello6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello")))
  )
  private[this] lazy val controllers_HelloworldController_hello6_invoker = createInvoker(
    HelloworldController_2.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HelloworldController_hello7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloworldController_hello7_invoker = createInvoker(
    HelloworldController_2.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HelloworldController_gotohome8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gotohome")))
  )
  private[this] lazy val controllers_HelloworldController_gotohome8_invoker = createInvoker(
    HelloworldController_2.gotohome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "gotohome",
      Nil,
      "GET",
      this.prefix + """gotohome""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HelloworldController_gotohelloworld9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("gotohelloworld")))
  )
  private[this] lazy val controllers_HelloworldController_gotohelloworld9_invoker = createInvoker(
    HelloworldController_2.gotohelloworld,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "gotohelloworld",
      Nil,
      "GET",
      this.prefix + """gotohelloworld""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HelloworldController_getPersons10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("get-persons")))
  )
  private[this] lazy val controllers_HelloworldController_getPersons10_invoker = createInvoker(
    HelloworldController_2.getPersons,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "getPersons",
      Nil,
      "GET",
      this.prefix + """get-persons""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HelloworldController_receivePerson11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("receive-persons")))
  )
  private[this] lazy val controllers_HelloworldController_receivePerson11_invoker = createInvoker(
    HelloworldController_2.receivePerson,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloworldController",
      "receivePerson",
      Nil,
      "POST",
      this.prefix + """receive-persons""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Assets_versioned12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned12_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_myChangeLang1_route(params@_) =>
      call(params.fromQuery[String]("code", None)) { (code) =>
        controllers_HomeController_myChangeLang1_invoker.call(HomeController_0.myChangeLang(code))
      }
  
    // @LINE:8
    case controllers_HelloworldController_helloworld2_route(params@_) =>
      call { 
        controllers_HelloworldController_helloworld2_invoker.call(HelloworldController_2.helloworld)
      }
  
    // @LINE:9
    case controllers_HelloworldController_submit3_route(params@_) =>
      call { 
        controllers_HelloworldController_submit3_invoker.call(HelloworldController_2.submit)
      }
  
    // @LINE:10
    case controllers_HelloworldController_pasTrouve4_route(params@_) =>
      call { 
        controllers_HelloworldController_pasTrouve4_invoker.call(HelloworldController_2.pasTrouve)
      }
  
    // @LINE:11
    case controllers_HelloworldController_pasAutorise5_route(params@_) =>
      call { 
        controllers_HelloworldController_pasAutorise5_invoker.call(HelloworldController_2.pasAutorise)
      }
  
    // @LINE:12
    case controllers_HelloworldController_hello6_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_HelloworldController_hello6_invoker.call(HelloworldController_2.hello(name))
      }
  
    // @LINE:13
    case controllers_HelloworldController_hello7_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HelloworldController_hello7_invoker.call(HelloworldController_2.hello(name))
      }
  
    // @LINE:14
    case controllers_HelloworldController_gotohome8_route(params@_) =>
      call { 
        controllers_HelloworldController_gotohome8_invoker.call(HelloworldController_2.gotohome)
      }
  
    // @LINE:15
    case controllers_HelloworldController_gotohelloworld9_route(params@_) =>
      call { 
        controllers_HelloworldController_gotohelloworld9_invoker.call(HelloworldController_2.gotohelloworld)
      }
  
    // @LINE:16
    case controllers_HelloworldController_getPersons10_route(params@_) =>
      call { 
        controllers_HelloworldController_getPersons10_invoker.call(HelloworldController_2.getPersons)
      }
  
    // @LINE:17
    case controllers_HelloworldController_receivePerson11_route(params@_) =>
      call { 
        controllers_HelloworldController_receivePerson11_invoker.call(HelloworldController_2.receivePerson)
      }
  
    // @LINE:20
    case controllers_Assets_versioned12_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned12_invoker.call(Assets_1.versioned(path, file))
      }
  }
}

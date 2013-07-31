// @SOURCE:/Users/adamsommer/Documents/workspace/WeFarm/conf/routes
// @HASH:2787f6000e5d67d2747bcaa2b462d99912ff13f6
// @DATE:Wed Jul 31 13:47:52 PDT 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_Application_index2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/"))))
        

// @LINE:14
private[this] lazy val controllers_Application_show3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Application_register4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register/"))))
        

// @LINE:17
private[this] lazy val controllers_Application_newFarmer5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("register/"))))
        

// @LINE:18
private[this] lazy val controllers_Application_oauth6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/oauth/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:20
private[this] lazy val controllers_Session_login7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"))))
        

// @LINE:21
private[this] lazy val controllers_Session_authenticate8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"))))
        

// @LINE:22
private[this] lazy val controllers_Session_logout9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout/"))))
        

// @LINE:24
private[this] lazy val controllers_Application_edit10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:25
private[this] lazy val controllers_Application_update11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/edit"))))
        

// @LINE:27
private[this] lazy val controllers_Application_buy12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/buy/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:28
private[this] lazy val controllers_Application_paymentSuccess13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("farmers/payment_success/"),DynamicPart("id", """[^/]+""",true))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/$id<[^/]+>""","""controllers.Application.show(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register/""","""controllers.Application.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """register/""","""controllers.Application.newFarmer()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/oauth/$id<[^/]+>""","""controllers.Application.oauth(id:Long, code:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/""","""controllers.Session.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/""","""controllers.Session.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout/""","""controllers.Session.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/$id<[^/]+>/edit""","""controllers.Application.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/$id<[^/]+>/edit""","""controllers.Application.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/buy/$id<[^/]+>""","""controllers.Application.buy(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """farmers/payment_success/$id<[^/]+>""","""controllers.Application.paymentSuccess(id:Long, checkout_id:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_Application_index2(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """farmers/"""))
   }
}
        

// @LINE:14
case controllers_Application_show3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.show(id), HandlerDef(this, "controllers.Application", "show", Seq(classOf[Long]),"GET", """""", Routes.prefix + """farmers/$id<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Application_register4(params) => {
   call { 
        invokeHandler(controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Nil,"GET", """""", Routes.prefix + """register/"""))
   }
}
        

// @LINE:17
case controllers_Application_newFarmer5(params) => {
   call { 
        invokeHandler(controllers.Application.newFarmer(), HandlerDef(this, "controllers.Application", "newFarmer", Nil,"POST", """""", Routes.prefix + """register/"""))
   }
}
        

// @LINE:18
case controllers_Application_oauth6(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("code", None)) { (id, code) =>
        invokeHandler(controllers.Application.oauth(id, code), HandlerDef(this, "controllers.Application", "oauth", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """farmers/oauth/$id<[^/]+>"""))
   }
}
        

// @LINE:20
case controllers_Session_login7(params) => {
   call { 
        invokeHandler(controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Nil,"GET", """""", Routes.prefix + """login/"""))
   }
}
        

// @LINE:21
case controllers_Session_authenticate8(params) => {
   call { 
        invokeHandler(controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Nil,"POST", """""", Routes.prefix + """login/"""))
   }
}
        

// @LINE:22
case controllers_Session_logout9(params) => {
   call { 
        invokeHandler(controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Nil,"GET", """""", Routes.prefix + """logout/"""))
   }
}
        

// @LINE:24
case controllers_Application_edit10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """farmers/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:25
case controllers_Application_update11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """farmers/$id<[^/]+>/edit"""))
   }
}
        

// @LINE:27
case controllers_Application_buy12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Application.buy(id), HandlerDef(this, "controllers.Application", "buy", Seq(classOf[Long]),"GET", """""", Routes.prefix + """farmers/buy/$id<[^/]+>"""))
   }
}
        

// @LINE:28
case controllers_Application_paymentSuccess13(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("checkout_id", None)) { (id, checkout_id) =>
        invokeHandler(controllers.Application.paymentSuccess(id, checkout_id), HandlerDef(this, "controllers.Application", "paymentSuccess", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """farmers/payment_success/$id<[^/]+>"""))
   }
}
        
}
    
}
        
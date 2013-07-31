// @SOURCE:/Users/adamsommer/Documents/workspace/WeFarm/conf/routes
// @HASH:2787f6000e5d67d2747bcaa2b462d99912ff13f6
// @DATE:Wed Jul 31 13:47:52 PDT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._
import java.net.URLEncoder

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers {

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSession {
    

// @LINE:21
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/")
}
                                                

// @LINE:22
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout/")
}
                                                

// @LINE:20
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login/")
}
                                                
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def register(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "register/")
}
                                                

// @LINE:18
def oauth(id:Long, code:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "farmers/oauth/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("code", code)))))
}
                                                

// @LINE:27
def buy(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "farmers/buy/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:25
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "farmers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                

// @LINE:28
def paymentSuccess(id:Long, checkout_id:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "farmers/payment_success/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("checkout_id", checkout_id)))))
}
                                                

// @LINE:14
def show(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "farmers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:13
// @LINE:6
def index(): Call = {
   () match {
// @LINE:6
case () if true => Call("GET", _prefix)
                                                        
// @LINE:13
case () if true => Call("GET", _prefix + { _defaultPrefix } + "farmers/")
                                                        
   }
}
                                                

// @LINE:24
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "farmers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                

// @LINE:17
def newFarmer(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "register/")
}
                                                
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSession {
    

// @LINE:21
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
      }
   """
)
                        

// @LINE:22
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout/"})
      }
   """
)
                        

// @LINE:20
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Session.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/"})
      }
   """
)
                        
    
}
              

// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.register",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register/"})
      }
   """
)
                        

// @LINE:18
def oauth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.oauth",
   """
      function(id,code) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/oauth/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("code", code)])})
      }
   """
)
                        

// @LINE:27
def buy : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.buy",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/buy/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:25
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:28
def paymentSuccess : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.paymentSuccess",
   """
      function(id,checkout_id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/payment_success/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("checkout_id", checkout_id)])})
      }
   """
)
                        

// @LINE:14
def show : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.show",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:13
// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/"})
      }
      }
   """
)
                        

// @LINE:24
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "farmers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                        

// @LINE:17
def newFarmer : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newFarmer",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "register/"})
      }
   """
)
                        
    
}
              

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:22
// @LINE:21
// @LINE:20
class ReverseSession {
    

// @LINE:21
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.authenticate(), HandlerDef(this, "controllers.Session", "authenticate", Seq(), "POST", """""", _prefix + """login/""")
)
                      

// @LINE:22
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.logout(), HandlerDef(this, "controllers.Session", "logout", Seq(), "GET", """""", _prefix + """logout/""")
)
                      

// @LINE:20
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Session.login(), HandlerDef(this, "controllers.Session", "login", Seq(), "GET", """""", _prefix + """login/""")
)
                      
    
}
                          

// @LINE:28
// @LINE:27
// @LINE:25
// @LINE:24
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:14
// @LINE:13
// @LINE:6
class ReverseApplication {
    

// @LINE:16
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.register(), HandlerDef(this, "controllers.Application", "register", Seq(), "GET", """""", _prefix + """register/""")
)
                      

// @LINE:18
def oauth(id:Long, code:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.oauth(id, code), HandlerDef(this, "controllers.Application", "oauth", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """farmers/oauth/$id<[^/]+>""")
)
                      

// @LINE:27
def buy(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.buy(id), HandlerDef(this, "controllers.Application", "buy", Seq(classOf[Long]), "GET", """""", _prefix + """farmers/buy/$id<[^/]+>""")
)
                      

// @LINE:25
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.update(id), HandlerDef(this, "controllers.Application", "update", Seq(classOf[Long]), "POST", """""", _prefix + """farmers/$id<[^/]+>/edit""")
)
                      

// @LINE:28
def paymentSuccess(id:Long, checkout_id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.paymentSuccess(id, checkout_id), HandlerDef(this, "controllers.Application", "paymentSuccess", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """farmers/payment_success/$id<[^/]+>""")
)
                      

// @LINE:14
def show(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.show(id), HandlerDef(this, "controllers.Application", "show", Seq(classOf[Long]), "GET", """""", _prefix + """farmers/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:24
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.edit(id), HandlerDef(this, "controllers.Application", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """farmers/$id<[^/]+>/edit""")
)
                      

// @LINE:17
def newFarmer(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newFarmer(), HandlerDef(this, "controllers.Application", "newFarmer", Seq(), "POST", """""", _prefix + """register/""")
)
                      
    
}
                          

// @LINE:9
class ReverseAssets {
    

// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      

package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

	"""),_display_(/*5.3*/if(flash().get("success") != null)/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""
		"""),format.raw/*6.3*/("""<div class="alert success">"""),_display_(/*6.31*/flash()/*6.38*/.get("success")),format.raw/*6.53*/("""</div>
	""")))}),format.raw/*7.3*/("""

  """),format.raw/*9.3*/("""<h1>"""),_display_(/*9.8*/Messages("welcome", "Besnard", name)),format.raw/*9.44*/("""</h1>
  <a href=""""),_display_(/*10.13*/controllers/*10.24*/.routes.HomeController.myChangeLang("fr")),format.raw/*10.65*/("""">Français</a> | 
  <a href=""""),_display_(/*11.13*/controllers/*11.24*/.routes.HomeController.myChangeLang("en")),format.raw/*11.65*/("""">English</a> | 
  <a href=""""),_display_(/*12.13*/controllers/*12.24*/.routes.HomeController.myChangeLang("es")),format.raw/*12.65*/("""">Español</a>
  <br/><img src=""""),_display_(/*13.19*/routes/*13.25*/.Assets.versioned("images/play.jpeg")),format.raw/*13.62*/("""" alt="Play Framework"/>
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 10 08:49:32 CEST 2018
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/index.scala.html
                  HASH: 753f345f477a6dfed91019dd1556d7107a219bb4
                  MATRIX: 948->1|1056->16|1083->18|1114->41|1153->43|1182->47|1224->81|1263->83|1292->86|1346->114|1361->121|1396->136|1434->145|1464->149|1494->154|1550->190|1595->208|1615->219|1677->260|1734->290|1754->301|1816->342|1872->371|1892->382|1954->423|2013->455|2028->461|2086->498|2142->524
                  LINES: 28->1|33->2|34->3|34->3|34->3|36->5|36->5|36->5|37->6|37->6|37->6|37->6|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14
                  -- GENERATED --
              */
          
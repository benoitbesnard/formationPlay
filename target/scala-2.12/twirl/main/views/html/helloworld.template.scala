
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

object helloworld extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[forms.UserData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[forms.UserData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Hello world")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
	"""),format.raw/*4.2*/("""<b>Hello World! """),_display_(/*4.19*/session()/*4.28*/.get("page")),format.raw/*4.40*/("""</b>
	
	"""),_display_(/*6.3*/helper/*6.9*/.form(routes.HelloworldController.submit())/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""
		"""),_display_(/*7.4*/helper/*7.10*/.CSRF.formField),format.raw/*7.25*/("""
	
		"""),_display_(/*9.4*/helper/*9.10*/.inputText(form("lastname"), '_id -> "nom", '_showConstraints -> false, 'size -> 10, 'id -> "nom2")),format.raw/*9.109*/("""
		"""),_display_(/*10.4*/helper/*10.10*/.inputText(form("firstname"), '_showConstraints -> false)),format.raw/*10.67*/("""
		"""),_display_(/*11.4*/helper/*11.10*/.inputText(form("email"), '_showConstraints -> false)),format.raw/*11.63*/("""
		"""),_display_(/*12.4*/helper/*12.10*/.inputText(form("content"), '_showConstraints -> false)),format.raw/*12.65*/("""
		"""),format.raw/*13.3*/("""<button type="submit">"""),_display_(/*13.26*/Messages("form.validate")),format.raw/*13.51*/("""</button>
	""")))}),format.raw/*14.3*/("""
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(form:Form[forms.UserData]): play.twirl.api.HtmlFormat.Appendable = apply(form)

  def f:((Form[forms.UserData]) => play.twirl.api.HtmlFormat.Appendable) = (form) => apply(form)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 10 14:13:11 CEST 2018
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/helloworld.scala.html
                  HASH: 211869a685c756e058323047fc825726d20e1237
                  MATRIX: 967->1|1089->30|1116->32|1143->51|1182->53|1210->55|1253->72|1270->81|1302->93|1336->102|1349->108|1400->151|1439->153|1468->157|1482->163|1517->178|1548->184|1562->190|1682->289|1712->293|1727->299|1805->356|1835->360|1850->366|1924->419|1954->423|1969->429|2045->484|2075->487|2125->510|2171->535|2213->547|2245->549
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|37->6|37->6|38->7|38->7|38->7|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15
                  -- GENERATED --
              */
          
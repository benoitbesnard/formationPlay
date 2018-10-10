
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

object searchEmployees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[forms.EmployeeName],play.twirl.api.HtmlFormat.Appendable] {

  /* searchEmployees Template File */
  def apply/*2.2*/(formData: Form[forms.EmployeeName]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Formulaire de recherche")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
	"""),_display_(/*5.3*/helper/*5.9*/.form(routes.EmployeeController.search)/*5.48*/ {_display_(Seq[Any](format.raw/*5.50*/("""
		"""),_display_(/*6.4*/helper/*6.10*/.CSRF.formField),format.raw/*6.25*/("""
		"""),_display_(/*7.4*/helper/*7.10*/.inputText(formData("name"))),format.raw/*7.38*/("""
		"""),format.raw/*8.3*/("""<button type="submit">"""),_display_(/*8.26*/Messages("search")),format.raw/*8.44*/("""</button>
	""")))}),format.raw/*9.3*/("""
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(formData:Form[forms.EmployeeName]): play.twirl.api.HtmlFormat.Appendable = apply(formData)

  def f:((Form[forms.EmployeeName]) => play.twirl.api.HtmlFormat.Appendable) = (formData) => apply(formData)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 10 14:13:11 CEST 2018
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/searchEmployees.scala.html
                  HASH: a7308fe65e6178eaf1dfbaf483c0e6fa7c8eb740
                  MATRIX: 1007->37|1137->74|1164->76|1203->107|1242->109|1270->112|1283->118|1330->157|1369->159|1398->163|1412->169|1447->184|1476->188|1490->194|1538->222|1567->225|1616->248|1654->266|1695->278|1727->280
                  LINES: 28->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|35->5|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|40->10
                  -- GENERATED --
              */
          
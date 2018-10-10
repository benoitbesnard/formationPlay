
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

object employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(Messages("title.page.employees"))/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
	"""),format.raw/*4.2*/("""<ul>
	"""),_display_(/*5.3*/for(employee <- employees) yield /*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
		"""),format.raw/*6.3*/("""<li>"""),_display_(/*6.8*/Messages("employee.age", employee.getLastname, employee.getFirstname, employee.getAge)),format.raw/*6.94*/("""</li>
	""")))}),format.raw/*7.3*/("""
	"""),format.raw/*8.2*/("""</ul>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(employees:List[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employees)

  def f:((List[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employees) => apply(employees)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 10 14:13:11 CEST 2018
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/employees.scala.html
                  HASH: 67617d6d031e5e50b749cc4b64c40355f45f360e
                  MATRIX: 960->1|1081->29|1108->31|1154->69|1193->71|1221->73|1253->80|1294->106|1333->108|1362->111|1392->116|1498->202|1535->210|1563->212|1599->219
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|37->6|37->6|38->7|39->8|40->9
                  -- GENERATED --
              */
          
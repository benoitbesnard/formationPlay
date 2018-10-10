
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

object employeesOrdered extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[Employee]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(Messages("title.page.employees"))/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
	"""),format.raw/*4.2*/("""<ul>
		<li>Besnard&nbsp;Benoît a 34 ans</li>
		<li>Dupont&nbsp;Martin a 32 ans</li>
		<li>Dupond&nbsp;Éric a 54 ans</li>
		<li>Doe&nbsp;John a 34 ans</li>
	</ul>
""")))}),format.raw/*10.2*/("""
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
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/employeesOrdered.scala.html
                  HASH: 1884cc544edc92e9a98afc090fa23d3c68340711
                  MATRIX: 967->1|1088->29|1115->31|1161->69|1200->71|1228->73|1421->236
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|41->10
                  -- GENERATED --
              */
          
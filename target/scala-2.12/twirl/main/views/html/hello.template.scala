
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

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* hello Template File */
  def apply/*2.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import org.apache.commons.lang3.StringUtils
/*5.2*/import scala.collection.immutable.List

def /*7.2*/capitalize/*7.12*/(name: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.30*/("""
	"""),_display_(/*8.3*/StringUtils/*8.14*/.capitalize(name)),format.raw/*8.31*/("""
""")))};
Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*6.1*/("""
"""),format.raw/*9.2*/("""

"""),_display_(/*11.2*/main("Hello")/*11.15*/ {_display_(Seq[Any](format.raw/*11.17*/("""
	"""),format.raw/*12.2*/("""<h1>Hello """),_display_(/*12.13*/capitalize(name)),format.raw/*12.29*/("""!</h1>
	<ul>
	"""),_display_(/*14.3*/for(int <- List.range(0,10,2)) yield /*14.33*/ {_display_(Seq[Any](format.raw/*14.35*/("""
		"""),format.raw/*15.3*/("""<li>"""),_display_(/*15.8*/int),format.raw/*15.11*/("""</li>
	""")))}),format.raw/*16.3*/("""
	"""),format.raw/*17.2*/("""</ul>
""")))}),format.raw/*18.2*/("""
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
                  DATE: Wed Oct 10 14:13:11 CEST 2018
                  SOURCE: /Users/bbesnard/formationPlay/test2/app/views/hello.scala.html
                  HASH: 84ae917286cfd107a22ebd1a543e11013404bb0e
                  MATRIX: 969->27|1056->44|1107->89|1158->130|1176->140|1270->158|1298->161|1317->172|1354->189|1394->42|1421->128|1448->191|1477->194|1499->207|1539->209|1568->211|1606->222|1643->238|1684->253|1730->283|1770->285|1800->288|1831->293|1855->296|1893->304|1922->306|1959->313
                  LINES: 28->2|31->4|32->5|34->7|34->7|36->7|37->8|37->8|37->8|39->3|40->6|41->9|43->11|43->11|43->11|44->12|44->12|44->12|46->14|46->14|46->14|47->15|47->15|47->15|48->16|49->17|50->18
                  -- GENERATED --
              */
          
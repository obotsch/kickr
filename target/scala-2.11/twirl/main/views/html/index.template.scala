
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>kickr</title>
    <link rel="stylesheet" href=""""),_display_(/*6.35*/routes/*6.41*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*6.91*/("""">
    <script src=""""),_display_(/*7.19*/routes/*7.25*/.Assets.versioned("lib/jquery/jquery.js")),format.raw/*7.66*/("""" type="text/javascript" ></script>
    <script src=""""),_display_(/*8.19*/routes/*8.25*/.Assets.versioned("lib/react/react.js")),format.raw/*8.64*/("""" type="text/javascript" ></script>
    <script src=""""),_display_(/*9.19*/routes/*9.25*/.Assets.versioned("lib/react/JSXTransformer.js")),format.raw/*9.73*/("""" type="text/javascript" ></script>
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("lib/react-bootstrap/react-bootstrap.js")),format.raw/*10.84*/("""" type="text/javascript" ></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("lib/react-router/React-Router.js")),format.raw/*11.78*/("""" type="text/javascript" ></script>
    <script src=""""),_display_(/*12.19*/routes/*12.25*/.Assets.versioned("javascripts/app.jsx.js")),format.raw/*12.68*/("""" type="text/jsx"></script>
</head>
<body>
    <div id="content"></div>
</body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Aug 26 21:37:55 CEST 2015
                  SOURCE: /Users/obotsch/dev/workspace/kickr/app/views/index.scala.html
                  HASH: f51650ef0a138403891282dd0516e1a4fa3cb818
                  MATRIX: 580->0|732->126|746->132|816->182|863->203|877->209|938->250|1018->304|1032->310|1091->349|1171->403|1185->409|1253->457|1334->511|1349->517|1429->576|1510->630|1525->636|1599->689|1680->743|1695->749|1759->792
                  LINES: 22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12
                  -- GENERATED --
              */
          
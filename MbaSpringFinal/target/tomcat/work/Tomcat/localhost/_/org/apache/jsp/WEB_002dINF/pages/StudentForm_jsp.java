/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-11-10 05:51:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Add Student</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("   .error {\r\n");
      out.write("   color: red;\r\n");
      out.write("   }\r\n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\r\n");
      out.write("    @media screen and (max-width: 767px) {\r\n");
      out.write("      .sidenav {\r\n");
      out.write("        height: auto;\r\n");
      out.write("        padding: 15px;\r\n");
      out.write("      }\r\n");
      out.write("      .page-header{\r\n");
      out.write("      \tmargin-top:-40px;\r\n");
      out.write("      }\r\n");
      out.write("      .row.content {height:auto;}\r\n");
      out.write("      \r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body ng-app=\"\">\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<div class=\"container-fluid text-center\">\r\n");
      out.write("  <div class=\"row content\">\r\n");
      out.write("    <div class=\"col-sm-2\">\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("    <div class=\"page-header text-center\" style=\"margin-top:00px; \">\r\n");
      out.write("\t\r\n");
      out.write("\t<img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"/>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t <div class=\"col-sm-3\" style=\"text-align:left; padding-left: 0px\">\r\n");
      out.write("      \r\n");
      out.write("  ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"col-sm-6\">\r\n");
      out.write("      <h2>Add Student</h2>\r\n");
      out.write("    <form class=\"form-horizontal\"  name=\"myform\" action=\"/saveStudent\" method=\"POST\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"fname\">First name:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"first_name\" class=\"form-control\" id=\"fname\" placeholder=\"first name\" ng-model=\"first_name\" required=\"required\">\r\n");
      out.write("    <span class=\"error\" ng-show=\"myform.first_name.$touched && myform.first_name.$invalid\">First name required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"lname\">Last name:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"last_name\" class=\"form-control\" id=\"lname\" placeholder=\"Last name\" ng-model=\"last_name\" required=\"required\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.last_name.$touched && myform.last_name.$invalid\">Last name required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"address\">Address:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"address\" class=\"form-control\" id=\"address\" placeholder=\"Address\" ng-model=\"address\" required=\"required\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.address.$touched && myform.address.$invalid\">Address required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"phone\">phone number:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"phone\" class=\"form-control\" id=\"phone\" placeholder=\"phone \" ng-model=\"phone\" required=\"required\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.phone.$touched && myform.phone.$invalid\">Phone number required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"aemail\">alternate email:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"alternate_email\" class=\"form-control\" id=\"aemail\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.alternate_email.$touched && myform.alternate_email.$invalid\">email required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"uemail\">Ucmo email:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"email\" name=\"ucmo_email\" class=\"form-control\" id=\"uemail\" placeholder=\"E@ucmo.edu\" ng-model=\"ucmo_email\" required=\"required\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.ucmo_email.$touched && myform.ucmo_email.$invalid\">Ucmo email required.</span>\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.ucmo_email.$error.email\">\r\n");
      out.write("    Not valid email!</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"concentration\">Concentration:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <select name=\"concentration\">\r\n");
      out.write("       <option >select Concentration</option>\r\n");
      out.write("       ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"gre_verbal\">gre_verbal:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"gre_verbal\" class=\"form-control\" id=\"gre_verbal\">\r\n");
      out.write("      \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"gre_quantitative\">gre_quantitative:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"gre_quantitative\" class=\"form-control\" id=\"gre_quantitative\" >\r\n");
      out.write("     \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <label class=\"control-label col-sm-4\" for=\"gpa\">gpa:</label>\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"text\" name=\"gpa\" class=\"form-control\" id=\"gpa\" ng-model=\"gpa\" required=\"required\">\r\n");
      out.write("      <span class=\"error\" ng-show=\"myform.gpa.$touched && myform.gpa.$invalid\">GPA required.</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\">\r\n");
      out.write("    <div class=\"col-sm-8\">\r\n");
      out.write("      <input type=\"hidden\" name=\"password\" class=\"form-control\" value=\"mba123\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"form-group\"> \r\n");
      out.write("    <div class=\"col-sm-offset-2 col-sm-8\">\r\n");
      out.write("      <input type=\"submit\" name=\"submit\" value=\"Add\" class=\"btn btn-default\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-3\">\r\n");
      out.write("      <span style=\"float:right;\">\r\n");
      out.write("    Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${adObject.first_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("||<label style=\"color:red;\"><a href=\"Logout\">Logout</a></label>\r\n");
      out.write("    </span>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-2\">\r\n");
      out.write("          </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/StudentForm.jsp(42,11) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("resources/images/header.jpg");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /WEB-INF/pages/StudentForm.jsp(46,2) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("/resources/images/QuickLinks.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/pages/StudentForm.jsp(102,7) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/pages/StudentForm.jsp(102,7) '${concentrationList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${concentrationList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/pages/StudentForm.jsp(102,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("conc");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${conc.concentration_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${conc.concentration_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

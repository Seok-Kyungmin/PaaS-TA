/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-11-16 18:15:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("	<title>Login</title>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->	\n");
      out.write("	<link rel=\"icon\" type=\"image/png\" href=\"/login/images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->	\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->	\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/css/util.css\">\n");
      out.write("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/login/css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	\n");
      out.write("	<div class=\"limiter\">\n");
      out.write("		<div class=\"container-login100\">\n");
      out.write("			<div class=\"wrap-login100\" style=\"padding-top: 50px;\">\n");
      out.write("				<div class=\"login100-form-title\" style=\"background-image: url(/login/images/desk20.jpg);\">\n");
      out.write("					<span class=\"login100-form-title-1\">\n");
      out.write("						Spoilbroth\n");
      out.write("					</span>\n");
      out.write("				</div>\n");
      out.write("\n");
      out.write("				<form class=\"login100-form validate-form\" action=\"/user/loginProc.do\" method=\"post\">\n");
      out.write("					<div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Username is required\">\n");
      out.write("						<span class=\"label-input100\">ID</span>\n");
      out.write("						<input class=\"input100\" type=\"text\" name=\"user_id\" placeholder=\"Enter userid\">\n");
      out.write("						<span class=\"focus-input100\"></span>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div class=\"wrap-input100 validate-input m-b-18\" data-validate = \"Password is required\">\n");
      out.write("						<span class=\"label-input100\">Password</span>\n");
      out.write("						<input class=\"input100\" type=\"password\" name=\"user_pwd\" placeholder=\"Enter password\">\n");
      out.write("						<span class=\"focus-input100\"></span>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div class=\"flex-sb-m w-full p-b-30\">\n");
      out.write("						<div class=\"contact100-form-checkbox\">\n");
      out.write("							<input class=\"input-checkbox100\" id=\"ckb1\" type=\"checkbox\" name=\"remember-me\">\n");
      out.write("							<label class=\"label-checkbox100\" for=\"ckb1\">\n");
      out.write("								ID기억하기\n");
      out.write("							</label>\n");
      out.write("						</div>\n");
      out.write("\n");
      out.write("						<div>\n");
      out.write("							<a href=\"findId\" class=\"txt1\">아이디</a> / <a href=\"findPw\" class=\"txt2\">비밀번호 찾기</a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("					\n");
      out.write("					<div class=\"container-login100-form-btn\" style=\"display: block; padding-top: 30px; margin-right: 25%;\">\n");
      out.write("						<button class=\"login100-form-btn\" style=\"margin: auto;\">\n");
      out.write("							Login\n");
      out.write("						</button>\n");
      out.write("					</div>\n");
      out.write("					\n");
      out.write("					<div class=\"container-login100-form-btn\" style=\"display: block; padding-top: 10px; margin-right: 25%;\">\n");
      out.write("						<button onclick=\"location.href='/user/signup.do'\" class=\"login100-form-btn\" style=\"margin: auto; background-color: #565c568c;\">\n");
      out.write("							Sign up\n");
      out.write("						</button>\n");
      out.write("					</div>\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("	<script src=\"/login/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("	<script src=\"/login/vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("	<script src=\"/login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

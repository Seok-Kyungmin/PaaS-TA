/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-11-08 09:06:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.study;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import poly.dto.ContestDTO;
import static poly.util.CmmUtil.nvl;

public final class contestdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/sidebar.jsp", Long.valueOf(1635062968000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("static poly.util.CmmUtil.nvl");
    _jspx_imports_classes.add("poly.dto.ContestDTO");
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

      out.write('\n');
      out.write('\n');
      out.write('\n');

	ContestDTO rDTO = (ContestDTO)request.getAttribute("rDTO");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Spoilbroth_StudyGroup</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Abril+Fatface&display=swap\"	rel=\"stylesheet\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/open-iconic-bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/animate.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/owl.theme.default.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/magnific-popup.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/aos.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/ionicons.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/bootstrap-datepicker.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/jquery.timepicker.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/flaticon.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/icomoon.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/style.css\">\n");
      out.write("\n");
      out.write("<!-- profile -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/profile.css\">\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- profile -->\n");
      out.write("\n");
      out.write("<!-- owl -->\n");
      out.write("<script src=\"/andrea-master/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.theme.default.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/owlowl.css\">\n");
      out.write("<!-- owl -->\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	.fontstyle{\n");
      out.write("		font-family: 'Nanum Gothic', sans-serif; font-weight: 500; font-size: 15px;\n");
      out.write("		margin-bottom: 0px;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body data-aos-easing=\"slide\" data-aos-duration=\"800\" data-aos-delay=\"0\">\n");
      out.write("	\n");
      out.write("	<!-- 전체 페이지 START-->\n");
      out.write("	<div id=\"colorlib-page\">\n");
      out.write("		<!-- START 왼쪽 NANI -->\n");
      out.write("		");
      out.write('\n');
      out.write('\n');


	String id = nvl((String)session.getAttribute("user_id"));
	String date = nvl((String)session.getAttribute("join_dt")); 

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<!-- 구글폰트 -->\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Do+Hyeon&family=Nanum+Pen+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<a href=\"#\" class=\"js-colorlib-nav-toggle colorlib-nav-toggle\"><i></i></a>\n");
      out.write("		<aside id=\"colorlib-aside\" role=\"complementary\" class=\"js-fullheight\"\n");
      out.write("			style=\"height: 812px;\">\n");
      out.write("			\n");
      out.write("			<nav id=\"colorlib-main-menu\" role=\"navigation\">\n");
      out.write("			<a href=\"single.html\" class=\"img img-2\" style=\"background-image: url(/andrea-master/images/image_1.jpg);\"></a>\n");
      out.write("			<div class=\"colorlib-active\">\n");
      out.write("			<ul>\n");
      out.write("				<li>\n");
      out.write("					");
if(date.isEmpty()) { 
      out.write("\n");
      out.write("						<a href=\"/user/login.do\" style=\"font-family: 'Do Hyeon', sans-serif; font-family: 'Nanum Pen Script', cursive; font-size: 32px;\">가입 하시겠습니까?</a>\n");
      out.write("					");
 } else { 
      out.write("\n");
      out.write("						<a href=\"#\" style=\"font-family: 'Do Hyeon', sans-serif; font-family: 'Nanum Pen Script', cursive; font-size: 24px;\" method=post>첫방문  : ");
      out.print(date );
      out.write("</a>\n");
      out.write("					");
} 
      out.write("\n");
      out.write("				\n");
      out.write("				</li>\n");
      out.write("				<li>\n");
      out.write("					");
if(id.isEmpty()) { 
      out.write("\n");
      out.write("						<a href=\"/user/login.do\" style= \"font-family: 'Nanum Pen Script', cursive; font-size: 20px; padding-left: 70px;\">Sign in</a>\n");
      out.write("					");
 } else { 
      out.write("\n");
      out.write("						<a href=\"/user/logOut.do\" style=\" font-family: 'Nanum Pen Script', cursive; font-size: 24px; padding-left: 40px;\">");
      out.print(id );
      out.write(" 님 Log out</a>\n");
      out.write("					");
} 
      out.write("\n");
      out.write("				</li>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("		<hr style=\" width: 90%; height: 1.5px; border: none; background-color: #666666;\"/>\n");
      out.write("				<ul class=\"nav2\">\n");
      out.write("					<li class=\"colorlib-active\"><a href=\"/spoilbroth/mystudy.do\">Home</a></li>\n");
      out.write("					<li class=\"nana\"><a href=\"/mbti/mbtimain.do\">MBTI Analysis</a></li>\n");
      out.write("					<li class=\"nana2\"><a href=\"/study/match.do\">Study Matching</a></li>\n");
      out.write("					<li class=\"nana3\"><a href=\"/study/contest.do\">Study Imformation</a></li>\n");
      out.write("					<li class=\"nana4\"><a href=\"/mypage/setting.do\">Setting</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</nav>\n");
      out.write("\n");
      out.write("			<div class=\"colorlib-footer\" style=\"padding-bottom: 20px;\">\n");
      out.write("				<h1 id=\"colorlib-logo\" class=\"mb-4\">\n");
      out.write("					<a href=\"/spoilbroth/main.do\" style=\"background-image: url(/andrea-master/images/bg_1.jpg); font-size: 57px;\">Spoilbroth</a>\n");
      out.write("				</h1>\n");
      out.write("				<span style=\"font-family: 'Do Hyeon', sans-serif; font-family: 'Nanum Pen Script', cursive; font-size: 28px;\">요리사가 너무 많으면 수프를 망친다.</span>\n");
      out.write("				<div class=\"mb-4\">\n");
      out.write("					<h3>Subscribe for Spoilbroth</h3>\n");
      out.write("					<form action=\"#\" class=\"colorlib-subscribe-form\">\n");
      out.write("						<div class=\"form-group d-flex\">\n");
      out.write("							<div class=\"icon\">\n");
      out.write("								<span class=\"icon-paper-plane\"></span>\n");
      out.write("							</div>\n");
      out.write("							<input type=\"text\" class=\"form-control\"\n");
      out.write("								placeholder=\"Enter Email Address\">\n");
      out.write("						</div>\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("				\n");
      out.write("			</div>\n");
      out.write("		</aside>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"/andrea-master/js/jquery.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("<script>\n");
      out.write("$(function(){\n");
      out.write("    var url = window.location.pathname;  \n");
      out.write("    var activePage = url.substring(url.lastIndexOf('/')+1);\n");
      out.write("    console.log(\"activePage: \" + activePage);\n");
      out.write("    \n");
      out.write("    $('.nav2 li a').each(function(){  \n");
      out.write("        var currentPage = this.href.substring(this.href.lastIndexOf('/')+1);\n");
      out.write("		console.log(\"currentPage : \"+currentPage)\n");
      out.write("		\n");
      out.write("        if (activePage == currentPage) {\n");
      out.write("        	$(\".nav2\").find(\".colorlib-active\").removeClass(\"colorlib-active\");\n");
      out.write("            $(this).parent().addClass('colorlib-active');\n");
      out.write("            $(this).addClass('colorlib-active');\n");
      out.write("            \n");
      out.write("        }else if(activePage == \"mbtianalysis.do\"){\n");
      out.write("        	$(\".nav2\").find(\".colorlib-active\").removeClass(\"colorlib-active\");\n");
      out.write("        	$('.nana').addClass('colorlib-active');\n");
      out.write("        }else if(activePage == \"match2.do\"){\n");
      out.write("        	$(\".nav2\").find(\".colorlib-active\").removeClass(\"colorlib-active\");\n");
      out.write("        	$('.nana2').addClass('colorlib-active');\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("})\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</html>");
      out.write("\n");
      out.write("		<!-- END 왼쪽 NANI -->\n");
      out.write("\n");
      out.write("		<!-- START 상단 NANI -->\n");
      out.write("		<!-- <div class=\"padding\" style=\"padding-bottom: 20px;\"></div>\n");
      out.write("		<div class=\"sidebar-heading\" style=\"text-align: center; position: fixed; top: 0; width: 100%; height:130px; background-color: #fff; z-index: 5; padding-top: 20px;font-weight: 500; color: black;\">\n");
      out.write("		<img alt=\"\" src=\"/img/DanimgilLogo.png\" style=\"width:100px; display: block; margin: 15px auto;  margin-top: 0px\">\n");
      out.write("			<hr style=\"width: 100%; height: 1.5px; border: none; background-color: #666666; margin:4px;\">\n");
      out.write("			<h4 class=\"title\" style=\"font-family: 'Poppins', sans-serif; text-align: right; padding-right:25px; font-size: 15px; font-weight: 500;\">STUDY INFOMATION</h4>\n");
      out.write("		 -->\n");
      out.write("		<div class=\"padding\" style=\"padding-bottom: 100px;\"></div>\n");
      out.write("		<div class=\"sidebar-heading\" style=\"text-align: center; position: fixed; top: 0; width: 100%; height:130px; background-color: #fff; z-index: 5; padding-top: 20px;font-weight: 500; color: black;\">\n");
      out.write("			<div class=\"hh\" style=\"font-size: 23px;height: 32px;\">\n");
      out.write("			<span>S</span><span>T</span><span>U</span><span>D</span><span>Y</span><span>&nbsp;</span><span>I</span><span>M</span><span>F</span><span>O</span><span>R</span><span>M</span><span>A</span><span>T</span><span>I</span><span>O</span><span>N</span>\n");
      out.write("			</div>\n");
      out.write("			<hr style=\" width: 90%; height: 1.5px; border: none; background-color: #666666;\">\n");
      out.write("			 <ul class=\"tagcloud\" style=\"font-size: 25px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("				<a href=\"/study/contest.do\" class=\"tag-cloud-link\" style=\"font-size: 17px; border-width: 1.5px; border-color: #ff0050; float: left; margin-left: 20px;\">이전</a>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("		<!-- END 상단 NANI -->\n");
      out.write("		\n");
      out.write("		<!-- 메인 페이지 START-->\n");
      out.write("		<div id=\"colorlib-main\">\n");
      out.write("			<section class=\"ftco-section ftco-no-pt ftco-no-pb\">\n");
      out.write("				<div class=\"container\">\n");
      out.write("				\n");
      out.write("					<!-- 왼쪽 오른쪽 2분할 -->\n");
      out.write("					<div class=\"row d-flex\">\n");
      out.write("					\n");
      out.write("						<!-- 왼쪽 스크립트 -->\n");
      out.write("						<div class=\"col-xl-8 px-md-5\" style=\"background-color: #f7fbff;\">\n");
      out.write("							<!-- 스터디 개설  START -->\n");
      out.write("							<div class=\"emp-profile\">\n");
      out.write("								<label style=\"font-size: 25px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600;\">\n");
      out.write("								공모전명 :");
      out.print(rDTO.getContest_name() );
      out.write("\n");
      out.write("								</label>\n");
      out.write("								<!-- 사진 프로필 START -->\n");
      out.write("								<div class=\"d-flex card m-2 p-3\">\n");
      out.write("									\n");
      out.write("									<div class=\"d-flex align-items-center\">\n");
      out.write("										<div class=\"image\">\n");
      out.write("											<img src=\"");
      out.print(rDTO.getContest_img() );
      out.write("\" class=\"rounded\"width=\"100%\">\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("											\n");
      out.write("									<div>\n");
      out.write("           								<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										분야</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					");
      out.print(rDTO.getContest_area() );
      out.write("\n");
      out.write("		              					</div>\n");
      out.write("		              					\n");
      out.write("		              					<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										주최/주관</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					");
      out.print(rDTO.getContest_host() );
      out.write("\n");
      out.write("		              					</div>\n");
      out.write("		              					\n");
      out.write("		              					<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										접수기간</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					");
      out.print(rDTO.getContest_day() );
      out.write("\n");
      out.write("		              					</div>\n");
      out.write("		              					\n");
      out.write("		              					<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										총 상금</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					");
      out.print(rDTO.getContest_prize() );
      out.write("\n");
      out.write("		              					</div>\n");
      out.write("		              					\n");
      out.write("		              					<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										홈페이지</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					<a href=\"");
      out.print(rDTO.getContest_addr());
      out.write("\">이동</a>\n");
      out.write("		              					</div>\n");
      out.write("		              					\n");
      out.write("		              					<label style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; margin-bottom: 0px;\">\n");
      out.write("										상세내용</label>\n");
      out.write("              							<div class=\"card fontstyle\">\n");
      out.write("		              					");
      out.print(rDTO.getContest_contents() );
      out.write("\n");
      out.write("		              					</div>\n");
      out.write("		              							\n");
      out.write("	              						\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<!-- 스터디 개설  END -->\n");
      out.write("\n");
      out.write("								<hr style=\"margin-top: 10px; margin-bottom: 0px;\" />\n");
      out.write("								\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<!-- 왼쪽 스크립트 끝 -->\n");
      out.write("						\n");
      out.write("						\n");
      out.write("\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</section>\n");
      out.write("		</div>\n");
      out.write("		<!-- 메인 페이지 END-->\n");
      out.write("	</div>\n");
      out.write("	<!-- 전체 페이지 END-->\n");
      out.write("\n");
      out.write("	<!-- loader -->\n");
      out.write("	<div id=\"ftco-loader\" class=\"fullscreen\">\n");
      out.write("		<svg class=\"circular\" width=\"48px\" height=\"48px\">\n");
      out.write("			<circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" troke-width=\"4\" stroke=\"#eeeeee\"></circle>\n");
      out.write("			<circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"></circle></svg>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<script src=\"/andrea-master/js/jquery.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/popper.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/bootstrap.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery.easing.1.3.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery.waypoints.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery.stellar.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/owl.carousel.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/aos.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/jquery.animateNumber.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/scrollax.min.js\"></script>\n");
      out.write("	<script src=\"/andrea-master/js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$('.slider-1 > .owl-carousel')\n");
      out.write("			.owlCarousel(\n");
      out.write("					{\n");
      out.write("						autoplay : true, // 오토 플레이\n");
      out.write("						autoplayTimeout : 6000, // 오토 플레이 시에 다음 슬라이드로 넘어가는 주기, 2초\n");
      out.write("						loop : true,\n");
      out.write("						margin : 0,\n");
      out.write("						nav : true,\n");
      out.write("						navText : [],\n");
      out.write("						responsive : {\n");
      out.write("							0 : {\n");
      out.write("								items : 1\n");
      out.write("							}\n");
      out.write("						}\n");
      out.write("					});\n");
      out.write("\n");
      out.write("	var $firstDot = $('.slider-1 > .owl-carousel > .owl-dots > .owl-dot.active');\n");
      out.write("\n");
      out.write("	$firstDot.removeClass('active');\n");
      out.write("\n");
      out.write("	setTimeout(function() {\n");
      out.write("		$firstDot.addClass('active');\n");
      out.write("	}, 100);\n");
      out.write("</script>\n");
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

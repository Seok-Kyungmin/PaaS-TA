/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.66
 * Generated at: 2021-11-11 16:36:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.spoilbroth;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import poly.dto.StudyListDTO;
import java.util.List;
import static poly.util.CmmUtil.nvl;

public final class mystudy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/view/sidebar.jsp", Long.valueOf(1636648577735L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("static poly.util.CmmUtil.nvl");
    _jspx_imports_classes.add("poly.dto.StudyListDTO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\n");
      out.write("\n");

	String user_id = (String) request.getAttribute("user_id");
	String user_email = (String) request.getAttribute("user_email");
	String user_name = (String) request.getAttribute("user_name");
	String user_mbti = (String) request.getAttribute("user_mbti");
	String user_dept = (String) request.getAttribute("user_dept");
	String studys = (String) request.getAttribute("user_study");
	System.out.print("studys : " + studys);
	int study_count = 0;
	String[] user_study = studys.split(",");
	if (studys.equals("")) {
		study_count = user_study.length - 1;
	} else {
		study_count = user_study.length;
	}
	List<StudyListDTO> pList = (List<StudyListDTO>) request.getAttribute("pList");
	if(pList == null){
		pList = new ArrayList<StudyListDTO>();
	}
	int count = pList.size();
	
	List<String> mbti_scores = (List<String>)request.getAttribute("mbti_scores");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>Spoilbroth_StudyGroup</title>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("<link href=\"https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<link\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Abril+Fatface&display=swap\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"/andrea-master/css/open-iconic-bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/animate.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"/andrea-master/css/owl.theme.default.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/aos.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"/andrea-master/css/bootstrap-datepicker.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/flaticon.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/icomoon.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"/andrea-master/css/style.css\">\n");
      out.write("\n");
      out.write("<!-- profile -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/profile.css\">\n");
      out.write("<link\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<!-- profile -->\n");
      out.write("\n");
      out.write("<!-- owl -->\n");
      out.write("<script src=\"/andrea-master/js/jquery.min.js\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/owl.carousel.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.carousel.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.2.1/assets/owl.theme.default.min.css\">\n");
      out.write("\n");
      out.write("<!-- owl -->\n");
      out.write("\n");
      out.write("<!-- card -->\n");
      out.write("<style>\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body data-aos-easing=\"slide\" data-aos-duration=\"800\" data-aos-delay=\"0\">\n");
      out.write("\n");
      out.write("	<!-- 전체 페이지 START-->\n");
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
      out.write("					<a href=\"/spoilbroth/mystudy.do\" style=\"background-image: url(/andrea-master/images/bg_1.jpg); font-size: 57px;\">Spoilbroth</a>\n");
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
      out.write("		\n");
      out.write("		<div class=\"padding\" style=\"padding-bottom: 20px;\"></div>\n");
      out.write("		<!-- <img alt=\"\" src=\"/img/DanimgilLogo.png\" style=\"width:100px; display: block; margin: 15px auto;  margin-top: 0px\"> -->\n");
      out.write("		<div class=\"sidebar-heading\"\n");
      out.write("			style=\"text-align: center; position: fixed; top: 0; width: 100%; height: 70px; background-color: #fff; z-index: 5; padding-top: 20px; font-weight: 500; color: black;\">\n");
      out.write("			<div class=\"hh\" style=\"font-size: 23px; height: 32px;\">\n");
      out.write("				<span>M</span><span>Y</span><span>&nbsp;</span><span>S</span><span>T</span><span>U</span><span>D</span><span>Y</span>\n");
      out.write("			</div>\n");
      out.write("			<hr style=\"width: 90%; height: 1.5px; border: none; background-color: #666666; margin:4px;\" >\n");
      out.write("		</div>\n");
      out.write("			<!-- <h4 class=\"title\" style=\"text-align: right; padding-right:25px; font-size: 15px; font-weight: 300px;\">MY STUDY</h4> -->\n");
      out.write("		<!-- END 상단 NANI -->\n");
      out.write("	\n");
      out.write("		<!-- 메인 페이지 START-->\n");
      out.write("		<div id=\"colorlib-main\" style=\"margin-top: 70px\">\n");
      out.write("			<section class=\"ftco-section ftco-no-pt ftco-no-pb\">\n");
      out.write("				<div class=\"container\">\n");
      out.write("					<!-- 왼쪽 오른쪽 2분할 -->\n");
      out.write("					<div class=\"row d-flex\">\n");
      out.write("\n");
      out.write("						<!-- 왼쪽 스크립트 -->\n");
      out.write("						<div class=\"col-xl-8 px-md-5\" style=\"background-color: #f7fbff;\">\n");
      out.write("							<!-- My 프로필 메인화면 -->\n");
      out.write("							<div class=\"emp-profile\">\n");
      out.write("\n");
      out.write("								<!-- 사진 프로필 START -->\n");
      out.write("								<div class=\"d-flex\">\n");
      out.write("\n");
      out.write("\n");
      out.write("									<div class=\"profile-card\">\n");
      out.write("										<form id=\"uploadForm\" enctype=\"multipart/form-data\">\n");
      out.write("											<div class=\"d-flex align-items-center\">\n");
      out.write("												<div class=\"image\">\n");
      out.write("													<img id=\"preview-image\" src=\"/getImage.do?user_id=");
      out.print(user_id );
      out.write("\" class=\"rounded\" width=\"100%\" alt=\"My Image\">\n");
      out.write("												</div>\n");
      out.write("											</div>\n");
      out.write("											<div id=\"input-image\" class=\"button mt-2 d-flex flex-row align-items-center\">\n");
      out.write("												<input type=\"file\" id=\"file\" name=\"fileUplod\" onchange=\"changeValue(this)\" style=\"display:none\"/>\n");
      out.write("												<button class=\"btn btn-sm btn-primary w-100\" id=\"btn-upload\" style=\"margin-right: 2px;\">Select File</button>\n");
      out.write("												<button id=\"btnUpload\" class=\"btn btn-sm btn-primary w-100\" style=\"margin-left: 2px;\">Register</button>\n");
      out.write("											</div>\n");
      out.write("										</form>\n");
      out.write("									</div>\n");
      out.write("\n");
      out.write("									<div class=\"profile-card\"\n");
      out.write("										style=\"padding-left: 20px; padding-top: 20px;\">\n");
      out.write("										<h5\n");
      out.write("											style=\"font-size: 30px; font-weight: 700; font-family: 'Nanum Gothic', sans-serif; letter-spacing: 8px;\">\n");
      out.write("											");
      out.print(user_name);
      out.write("</h5>\n");
      out.write("										<h6\n");
      out.write("											style=\"    font-size: 20px; font-weight: 600;font-family: 'Nanum Gothic', sans-serif;\">\n");
      out.write("											");
      out.print(user_dept);
      out.write("</h6>\n");
      out.write("										<p class=\"mb-2\"\n");
      out.write("											style=\"font-size: 19px; font-weight: 600; font-family: 'Nanum Gothic', sans-serif; color: #6c757d;\">\n");
      out.write("											Join Study : <span>");
      out.print(study_count);
      out.write("</span>\n");
      out.write("										</p>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<!-- 사진프로필  END -->\n");
      out.write("\n");
      out.write("\n");
      out.write("								<hr style=\"margin-top: 10px; margin-bottom: 0px;\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("								<!-- 사용자 정보 START-->\n");
      out.write("								<div class=\"row\"\n");
      out.write("									style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; cursive;\">\n");
      out.write("									<div class=\"col-md-6\">\n");
      out.write("										<div class=\"profile-head\">\n");
      out.write("											<ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("												<li class=\"nav-item\"><a class=\"nav-link active\"\n");
      out.write("													id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\"\n");
      out.write("													aria-controls=\"home\" aria-selected=\"true\">About</a></li>\n");
      out.write("												<li class=\"nav-item\"><a class=\"nav-link\"\n");
      out.write("													id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\"\n");
      out.write("													role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Timeline</a>\n");
      out.write("												</li>\n");
      out.write("											</ul>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("\n");
      out.write("								</div>\n");
      out.write("								<div class=\"row\"\n");
      out.write("									style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif;font-weight: 600; \">\n");
      out.write("									<div class=\"col-md-8\">\n");
      out.write("										<div class=\"tab-content profile-tab\" id=\"myTabContent\">\n");
      out.write("											<div class=\"tab-pane fade show active\" id=\"home\"\n");
      out.write("												role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("												<div class=\"row\">\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<label>User Id</label>\n");
      out.write("													</div>\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<div style=\"margin-left: 20px; color: #0062cc;\">");
      out.print(user_id);
      out.write("</div>\n");
      out.write("													</div>\n");
      out.write("												</div>\n");
      out.write("\n");
      out.write("												<div class=\"row\">\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<label>Email</label>\n");
      out.write("													</div>\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<div style=\"margin-left: 20px; color: #0062cc;\">");
      out.print(user_email);
      out.write("</div>\n");
      out.write("													</div>\n");
      out.write("												</div>\n");
      out.write("												<div class=\"row\">\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<label>MBTI</label>\n");
      out.write("													</div>\n");
      out.write("													<div class=\"col-6\">\n");
      out.write("														<div style=\"margin-left: 20px; color: #0062cc;\">");
      out.print(user_mbti);
      out.write("</div>\n");
      out.write("													</div>\n");
      out.write("												</div>\n");
      out.write("\n");
      out.write("											</div>\n");
      out.write("\n");
      out.write("											<div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\"\n");
      out.write("												aria-labelledby=\"profile-tab\">\n");
      out.write("												<div class=\"row\">\n");
      out.write("													<div class=\"col-md-12\">\n");
      out.write("														<label>Join Study Group List</label>\n");
      out.write("													</div>\n");
      out.write("												</div>\n");
      out.write("\n");
      out.write("												");

													for (int i = 0; i < study_count; i++) {
												
      out.write("\n");
      out.write("												<div class=\"row\">\n");
      out.write("													<div style=\"margin-left: 20px; color: #0062cc;\">");
      out.print(user_study[i]);
      out.write("</div>\n");
      out.write("												</div>\n");
      out.write("												");

													}
												
      out.write("\n");
      out.write("\n");
      out.write("											</div>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("							<!-- 사용자 정보 END-->\n");
      out.write("\n");
      out.write("\n");
      out.write("							<!-- Join Study Group -->\n");
      out.write("							<!-- 슬라이드 -->\n");
      out.write("							\n");
      out.write("							<!-- 슬라이드 END-->\n");
      out.write("\n");
      out.write("							<!-- Join Study Group -->\n");
      out.write("							<!-- 그룹목록 START -->\n");
      out.write("							<hr style=\"margin-top: 5px; margin-bottom: 0px;\" />\n");
      out.write("							<!-- My 프로필 메인화면 -->\n");
      out.write("							<label\n");
      out.write("								style=\"font-size: 25px; font-weight: bold; 'Nanum Gothic', sans-serif; margin-bottom: 0px;\">\n");
      out.write("								가입한 스터디 목록 </label>\n");
      out.write("							<hr style=\"margin-top: 5px; margin-bottom: 0px;\" />\n");
      out.write("\n");
      out.write("							<!-- 스터디 목록 정보 START-->\n");
      out.write("							");

								int j = 0 ;
								for (StudyListDTO pDTO : pList) {
							
      out.write("\n");
      out.write("							");

								String[] arr = pDTO.getStudy_member().split(",");
									int membercount = arr.length;
							
      out.write("\n");
      out.write("							<div class=\"emp-profile\">\n");
      out.write("								<div class=\"d-flex\">\n");
      out.write("									<div class=\"profile-card\">\n");
      out.write("										<div class=\"d-flex align-items-center\">\n");
      out.write("											<div class=\"image\">\n");
      out.write("												<img\n");
      out.write("													src=\"/getStudyImage.do?study_name=");
      out.print(pDTO.getStudy_name());
      out.write("\"\n");
      out.write("													class=\"rounded\" width=\"100%\">\n");
      out.write("											</div>\n");
      out.write("										</div>\n");
      out.write("										<div class=\"button mt-2 d-flex flex-row align-items-center\">\n");
      out.write("											\n");
      out.write("											<button class=\"btn btn-sm btn-primary w-100\"\n");
      out.write("												onclick=\"location.href='/study/studyboard.do?study_name=");
      out.print(pDTO.getStudy_name());
      out.write("'\">\n");
      out.write("												Study Join</button>\n");
      out.write("											\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("\n");
      out.write("									<div class=\"profile-card\"\n");
      out.write("										style=\"padding-left: 20px; padding-top: 20px;\">\n");
      out.write("										<h5\n");
      out.write("											style=\"font-size: 26px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; letter-spacing: 8px;\">\n");
      out.write("											");
      out.print(pDTO.getStudy_name());
      out.write("</h5>\n");
      out.write("										<h6\n");
      out.write("											style=\"font-size: 22px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600;\">\n");
      out.write("											");
      out.print(pDTO.getStudy_title());
      out.write("</h6>\n");
      out.write("										<p class=\"mb-2\"\n");
      out.write("											style=\"font-size: 20px;  font-family: 'Nanum Gothic', sans-serif; font-weight: 600; color: #6c757d;\">\n");
      out.write("											Join Study : <span>");
      out.print(membercount);
      out.write("/5</span>\n");
      out.write("										</p>\n");
      out.write("										");
      out.write("\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("							<!-- asd -->\n");
      out.write("							<div class=\"emp-profile\">\n");
      out.write("								<div class=\"d-flex\">\n");
      out.write("									<div class=\"profile-card col-5\" style=\"padding-right:3px; padding-left:3px;\">\n");
      out.write("									");
 for(int k=0; k<Integer.parseInt(mbti_scores.get(j)); k++) {
      out.write("\n");
      out.write("									<svg version=\"1.1\" id=\"Capa_1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0px\" y=\"0px\" width=\"22\" height=\"22\"\n");
      out.write("										 viewBox=\"0 0 422.448 422.448\" style=\"enable-background:new 0 0 422.448 422.448;\" xml:space=\"preserve\">\n");
      out.write("									<path style=\"fill:#FF4979;\" d=\"M387.15,59.153c-47.066-47.065-123.374-47.065-170.44,0l-4,4l-4-4\n");
      out.write("										C163.342,10.448,87.081,7.742,38.376,53.109s-51.412,121.628-6.044,170.334c1.885,2.023,3.839,3.981,5.858,5.871l170.8,170.8\n");
      out.write("										c2.018,1.981,5.217,2.085,7.36,0.24l170.8-170.8c47.065-47.066,47.065-123.374,0-170.44L387.15,59.153z\"/>\n");
      out.write("									</svg>\n");
      out.write("									\n");
      out.write("									");
} 
      out.write("\n");
      out.write("									</div>\n");
      out.write("									\n");
      out.write("									<div class=\"profile-card col-7\">\n");
      out.write("										");
 if(Integer.parseInt(mbti_scores.get(j)) >= 0 && Integer.parseInt(mbti_scores.get(j)) <= 2) {
      out.write("\n");
      out.write("											<span class=\"mb-2\" style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; color: #ff4500;\">\n");
      out.write("											서로 양보하고 노력 해야해요.\n");
      out.write("											</span>\n");
      out.write("										");
}else if(Integer.parseInt(mbti_scores.get(j)) >= 3 && Integer.parseInt(mbti_scores.get(j)) <= 4 ){
      out.write("\n");
      out.write("											<span class=\"mb-2\" style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; color: royalblue;\">\n");
      out.write("											이번 기회에 친해져 볼까요?\n");
      out.write("											</span>\n");
      out.write("										");
}else{
      out.write("\n");
      out.write("											<span class=\"mb-2\" style=\"font-size: 18px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600; color: blueviolet;\">\n");
      out.write("											더 없이 좋을수는 없어요. \n");
      out.write("											</span>\n");
      out.write("										");
} 
      out.write("\n");
      out.write("									</div>\n");
      out.write("								</div>\n");
      out.write("								<hr style=\"margin: 5px;\">\n");
      out.write("								<p class=\"\" style=\"font-size: 18px; font-weight: 600; font-family: 'Nanum Gothic', sans-serif; color: red; margin-bottom:0px\">\n");
      out.write("								※ 스터디그룹에 가입된 팀원의 MBTI를 분석한 결과입니다.\n");
      out.write("								</p>\n");
      out.write("							</div>\n");
      out.write("							<!-- asd -->\n");
      out.write("							<div class=\"meta-wrap\"\n");
      out.write("								style=\"font-size: 22px; font-family: 'Nanum Gothic', sans-serif; font-weight: 600;\">\n");
      out.write("								<p class=\"meta\">\n");
      out.write("									<span style=\"color: cornflowerblue;\"><i\n");
      out.write("										class=\"icon-folder-o mr-2\"></i>");
      out.print(pDTO.getStudy_field());
      out.write("</span> <span><i\n");
      out.write("										class=\"icon-calendar mr-2\"></i>");
      out.print(pDTO.getStudy_dt());
      out.write("</span>\n");
      out.write("								</p>\n");
      out.write("								<p class=\"mb-4\" style=\"font-size: 18px; font-weight: 600;\">");
      out.print(pDTO.getStudy_contents() );
      out.write("</p>\n");
      out.write("							</div>\n");
      out.write("\n");
      out.write("							<!-- 스터디 목록 정보 END-->\n");
      out.write("							<hr style=\"margin-top: 5px; margin-bottom: 0px;\" />\n");
      out.write("							");
 
								j++;							
							} 
      out.write("\n");
      out.write("							<!-- 그룹목록 END -->\n");
      out.write("\n");
      out.write("						</div>\n");
      out.write("\n");
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
      out.write("			<circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\"\n");
      out.write("				troke-width=\"4\" stroke=\"#eeeeee\"></circle>\n");
      out.write("			<circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\"\n");
      out.write("				stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"></circle></svg>\n");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("		$(function () {\n");
      out.write("			$('#btn-upload').click(function (e) {\n");
      out.write("				e.preventDefault();\n");
      out.write("				$('#file').click();\n");
      out.write("			});\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		\n");
      out.write("		function readImage(input) {\n");
      out.write("		    // 인풋 태그에 파일이 있는 경우\n");
      out.write("		    if(input.files && input.files[0]) {\n");
      out.write("		       \n");
      out.write("		        // FileReader 인스턴스 생성\n");
      out.write("		        const reader = new FileReader()\n");
      out.write("		        // 이미지가 로드가 된 경우\n");
      out.write("		        reader.onload = e => {\n");
      out.write("		            const previewImage = document.getElementById(\"preview-image\")\n");
      out.write("		            console.log(\"previewImage : \" + previewImage)\n");
      out.write("		            previewImage.src = e.target.result\n");
      out.write("		        }\n");
      out.write("		        // reader가 이미지 읽도록 하기\n");
      out.write("		        reader.readAsDataURL(input.files[0])\n");
      out.write("		    }\n");
      out.write("		}\n");
      out.write("		// input file에 change 이벤트 부여\n");
      out.write("		const inputImage = document.getElementById(\"input-image\")\n");
      out.write("		inputImage.addEventListener(\"change\", e => {\n");
      out.write("		    readImage(e.target)\n");
      out.write("		})\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$('.slider-1 > .owl-carousel')\n");
      out.write("			.owlCarousel(\n");
      out.write("					{\n");
      out.write("						autoplay : true, // 오토 플레이\n");
      out.write("						autoplayTimeout : 3000, // 오토 플레이 시에 다음 슬라이드로 넘어가는 주기, 2초\n");
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
      out.write("	var $firstDot = $('.slider-1 > .owl-carousel > .owl-dots > .owl-dot.active');\n");
      out.write("	$firstDot.removeClass('active');\n");
      out.write("	setTimeout(function() {\n");
      out.write("		$firstDot.addClass('active');\n");
      out.write("	}, 100);\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$('#btnUpload').on('click', function(event) {\n");
      out.write("	    event.preventDefault();\n");
      out.write("	    \n");
      out.write("	    var form = $('#uploadForm')[0]\n");
      out.write("	    var data = new FormData(form);\n");
      out.write("	    $('#btnUpload').prop('disabled', true);\n");
      out.write("		\n");
      out.write("	    $.ajax({\n");
      out.write("	        type: \"POST\",\n");
      out.write("	        enctype: 'multipart/form-data',\n");
      out.write("	        url: \"/FileUplod.do\",\n");
      out.write("	        data: data,\n");
      out.write("	        processData: false,\n");
      out.write("	        contentType: false,\n");
      out.write("	        cache: false,\n");
      out.write("	        timeout: 600000,\n");
      out.write("	        success: function (data) {\n");
      out.write("	        	$('#btnUpload').prop('disabled', false);\n");
      out.write("	        	alert('등록이 성공하였습니다.')\n");
      out.write("	        },\n");
      out.write("	        error: function (e) {\n");
      out.write("	            $('#btnUpload').prop('disabled', false);\n");
      out.write("	            alert('등록이 실패하였습니다.');\n");
      out.write("	        }\n");
      out.write("	    });\n");
      out.write("	})\n");
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

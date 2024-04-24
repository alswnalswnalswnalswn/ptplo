/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-24 10:15:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>메인페이지</title>\r\n");
      out.write("<!-- CSS -->\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.css\" />\r\n");
      out.write("<!-- JS -->\r\n");
      out.write(" <script src=\"https://cdn.jsdelivr.net/npm/swiper@11/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("	div{\r\n");
      out.write("		box-sizing: border-box;\r\n");
      out.write("	}\r\n");
      out.write("	#wrap{\r\n");
      out.write("		width: 1200px;\r\n");
      out.write("		height: 1000px;\r\n");
      out.write("		margin: auto;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.swiper {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      height: 350px;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    .swiper-slide {\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      font-size: 18px;\r\n");
      out.write("      background: #fff;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("    }\r\n");
      out.write("    .swiper-slide img {\r\n");
      out.write("      display: block;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      height: 100%;\r\n");
      out.write("      object-fit: cover;\r\n");
      out.write("    }\r\n");
      out.write("    .card-imgDiv, .card-info{\r\n");
      out.write("		display: inline-block;\r\n");
      out.write("		width: 50%;\r\n");
      out.write("		height: 100%;\r\n");
      out.write("	}\r\n");
      out.write("    .card-img{\r\n");
      out.write("		width: 275px;\r\n");
      out.write("		height: 180px;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("		cursor: pointer;\r\n");
      out.write("	}\r\n");
      out.write("	.card-info {\r\n");
      out.write("		float:right;\r\n");
      out.write("		display:flex;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("	}\r\n");
      out.write("	.card-info > h4 {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	.card-info > p{\r\n");
      out.write("		margin: 0px;\r\n");
      out.write("		margin-bottom: 10px;\r\n");
      out.write("		font-size: 14px;\r\n");
      out.write("	}\r\n");
      out.write("	.cards{\r\n");
      out.write("		width:	100%;\r\n");
      out.write("		height: 250px;\r\n");
      out.write("		margin: 10px;	\r\n");
      out.write("	}\r\n");
      out.write("	.mainPage-title-div {\r\n");
      out.write("		margin: 25px auto;\r\n");
      out.write("		border-bottom: 1px solid gray;\r\n");
      out.write("	}\r\n");
      out.write("	.mainPage-title-div > h3 {\r\n");
      out.write("		margin: 3px;\r\n");
      out.write("	}\r\n");
      out.write("	.swiper-button-prev{\r\n");
      out.write("		display: block;\r\n");
      out.write("		left: 1px;\r\n");
      out.write("	}\r\n");
      out.write("	.swiper-button-next{\r\n");
      out.write("		display: block;\r\n");
      out.write("		right: 1px;\r\n");
      out.write("	}\r\n");
      out.write("	#banner{\r\n");
      out.write("		background-image : url('resources/img/mainbanner03.png');\r\n");
      out.write("		background-size:cover;\r\n");
      out.write("		width : 1000px;\r\n");
      out.write("		height : 400px;\r\n");
      out.write("		margin : 20px auto;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("		object-fit: cover;\r\n");
      out.write("		background-repeat: no-repeat;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/views/common/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div id=\"wrap\">\r\n");
      out.write("		<div id=\"banner\">\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mainPage-title-div\">\r\n");
      out.write("			<h3>요즘 인기있는 숙소</h3>\r\n");
      out.write("			<a href=\"select.hotel?hotelNo=30\">\r\n");
      out.write("			<button>호텔</button>\r\n");
      out.write("			</a>\r\n");
      out.write("		</div>\r\n");
      out.write("		 <div class=\"swiper mySwiper\">\r\n");
      out.write("		    <div class=\"swiper-wrapper populars\">\r\n");
      out.write("		    </div>\r\n");
      out.write("		    \r\n");
      out.write("	    	<div class=\"swiper-pagination\"></div>\r\n");
      out.write("		    <div class=\"swiper-button-next\"></div>\r\n");
      out.write("		    <div class=\"swiper-button-prev\"></div>\r\n");
      out.write("		    <div class=\"swiper-pagination\"></div>\r\n");
      out.write("	  	</div>\r\n");
      out.write("  	\r\n");
      out.write("		<div class=\"mainPage-title-div\">\r\n");
      out.write("			<h3>지역별 추천숙소</h3>\r\n");
      out.write("		</div>	\r\n");
      out.write("		 <div class=\"swiper mySwiper-2\">\r\n");
      out.write("		    <div class=\"swiper-wrapper recommands\">\r\n");
      out.write("		    </div>\r\n");
      out.write("	  	</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</body>\r\n");
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

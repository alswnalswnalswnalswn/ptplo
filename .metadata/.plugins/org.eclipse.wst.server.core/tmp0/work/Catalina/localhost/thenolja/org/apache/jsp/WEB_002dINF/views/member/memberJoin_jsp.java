/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-23 11:53:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.thenolja.member.model.vo.Member;

public final class memberJoin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("com.kh.thenolja.member.model.vo.Member");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	#changeBtn, #reset{\r\n");
      out.write("			border: none;\r\n");
      out.write("			background-color: rgb(70, 149, 151);\r\n");
      out.write("			width: 120px;\r\n");
      out.write("			height: 50px;\r\n");
      out.write("			color: white;\r\n");
      out.write("			margin-top: 30px;\r\n");
      out.write("			margin-left: 70px;\r\n");
      out.write("			border-radius: 10px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#changeBtn:hover, #reset:hover, #pwdCheck1:hover{\r\n");
      out.write("		color: black;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#pwdCheck1{\r\n");
      out.write("		border: none;\r\n");
      out.write("		background-color: rgb(202, 202, 161);\r\n");
      out.write("		width: 100px;\r\n");
      out.write("		height: 40px;\r\n");
      out.write("		color: white;\r\n");
      out.write("		font-size: 13px;\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#word{\r\n");
      out.write("		text-align: center; \r\n");
      out.write("		height: 100px;\r\n");
      out.write("		font-size: 40px;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		margin-top: 10px; \r\n");
      out.write("		color: rgb(70, 149, 151);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	input{\r\n");
      out.write("		width: 300px;\r\n");
      out.write("		height: 40px;\r\n");
      out.write("		border-color: rgb(230, 230, 230);\r\n");
      out.write("		border-radius: 10px;\r\n");
      out.write("		background-repeat: no-repeat;\r\n");
      out.write("		background-size: 30px;\r\n");
      out.write("		background-position: right;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#pwdCheck2{\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            height: 20px;\r\n");
      out.write("			display: none;\r\n");
      out.write("			border-radius: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("	.input:focus{\r\n");
      out.write("		border-color: rgb(70, 149, 151);\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	td{\r\n");
      out.write("		border-bottom: 1px solid lightgray;\r\n");
      out.write("		margin-bottom: 10px;\r\n");
      out.write("		font-size: 16px;\r\n");
      out.write("		padding-left: 10px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#title{\r\n");
      out.write("		margin-top: 20px; \r\n");
      out.write("		color: rgb(70, 149, 151);\r\n");
      out.write("		height: 100px;\r\n");
      out.write("		border-bottom: 1px solid lightgray;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	#title > span{\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		font-size: 45px;\r\n");
      out.write("	}\r\n");
      out.write("		\r\n");
      out.write("	#table{\r\n");
      out.write("		margin-top: 20px;\r\n");
      out.write("		border-collapse: separate;\r\n");
      out.write("		border-spacing : 15px;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write(" \r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/menubar.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"outer\">\r\n");
      out.write("		<br>\r\n");
      out.write("		<div id=\"title\" align=\"center\">\r\n");
      out.write("			<span>회원가입</span>\r\n");
      out.write("		</div>\r\n");
      out.write("		<form id=\"enroll-form\" method=\"post\" action=\"insert.member\">\r\n");
      out.write("			<table align=\"center\" id=\"table\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td id=\"idWord\">아이디</td>\r\n");
      out.write("					<td><input type=\"text\" maxlength=\"12\" required name=\"memId\" placeholder=\"4~12 영숫자\" autofocus></td>\r\n");
      out.write("					<td><button class=\"btn btn-sm btn-primary\" type=\"button\" onclick=\"idCheck();\">중복확인</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<script>\r\n");
      out.write("					function idCheck(){\r\n");
      out.write("						\r\n");
      out.write("						const $memId = $('#enroll-form input[name=memId]');\r\n");
      out.write("						$.ajax({ // 보낼 값이 많으므로 객체 만들기 {}\r\n");
      out.write("							url : 'idCheck.do',\r\n");
      out.write("							data : {checkId : $memId.val()},\r\n");
      out.write("							success : function(result){\r\n");
      out.write("								\r\n");
      out.write("								if(result =='NNNNN'){ // 중복된 아이디\r\n");
      out.write("									alert('이미 존재하거나 탈퇴한 회원의 아이디입니다.');\r\n");
      out.write("								\r\n");
      out.write("									$memId.val('').focus();\r\n");
      out.write("								\r\n");
      out.write("								} else { // 중복 X == 사용 가능\r\n");
      out.write("									\r\n");
      out.write("									if(confirm('사용 가능한 아이디입니다. 사용하시겠습니까?')){\r\n");
      out.write("										$memId.attr('readonly', true);\r\n");
      out.write("										\r\n");
      out.write("									}\r\n");
      out.write("									else{\r\n");
      out.write("										$memId.focus();\r\n");
      out.write("									}\r\n");
      out.write("								}\r\n");
      out.write("							},\r\n");
      out.write("							error : function(){\r\n");
      out.write("								console.log('AJAX통신실패');\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				</script>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>비밀번호</td>\r\n");
      out.write("					<td><input type=\"password\" maxlength=\"15\" required name=\"memPwd\" class=\"pwdCheck\" placeholder=\"4~15 영숫자\"></td>\r\n");
      out.write("					<td></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>비밀번호 확인</td>\r\n");
      out.write("					<td><input type=\"password\" maxlength=\"15\" required id=\"memPwd2\" class=\"pwdCheck\"></td>\r\n");
      out.write("					\r\n");
      out.write("					<td><button onclick=\"pwdCheck()\" class=\"btn btn-sm btn-primary\">일치확인</button></td>\r\n");
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("						function pwdCheck(){\r\n");
      out.write("							const p1 = document.getElementsByClassName('pwdCheck')[0].value;\r\n");
      out.write("							const p2 = document.getElementsByClassName('pwdCheck')[1].value;\r\n");
      out.write("							const memJoin = document.getElementById('memJoin');\r\n");
      out.write("							const name = document.getElementById('name');\r\n");
      out.write("							if(p1 != p2){\r\n");
      out.write("								alert(\"비밀번호가 일치하지 않습니다!\");\r\n");
      out.write("									p1 = null;\r\n");
      out.write("									p2 = null;\r\n");
      out.write("								return false;\r\n");
      out.write("							}\r\n");
      out.write("							else{\r\n");
      out.write("								alert(\"비밀번호가 일치합니다.\");\r\n");
      out.write("								memJoin.disabled = false;\r\n");
      out.write("								return true;\r\n");
      out.write("							}\r\n");
      out.write("						}\r\n");
      out.write("					</script>\r\n");
      out.write("					\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>이름</td>\r\n");
      out.write("					<td><input type=\"text\" maxlength=\"5\" required name=\"memName\" id=\"name\"></td>\r\n");
      out.write("					<td></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>닉네임</td>\r\n");
      out.write("					<td><input type=\"text\" maxlength=\"10\" required name=\"nickname\" placeholder=\"한글 또는 영숫자\"></td>\r\n");
      out.write("					<td><button class=\"btn btn-sm btn-primary\" type=\"button\" onclick=\"nickNameCheck();\">중복확인</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				<script>\r\n");
      out.write("					function nickNameCheck(){\r\n");
      out.write("						\r\n");
      out.write("						const $nickname = $('#enroll-form input[name=nickname]');\r\n");
      out.write("						// console.log($nickname);\r\n");
      out.write("						$.ajax({ \r\n");
      out.write("							url : 'nickNameCheck.do',\r\n");
      out.write("							data : {checkNickname : $nickname.val()},\r\n");
      out.write("							success : function(result){\r\n");
      out.write("								\r\n");
      out.write("								if(result =='NNNNN'){ // 중복된 닉네임\r\n");
      out.write("									alert('중복되는 닉네임입니다.');\r\n");
      out.write("								\r\n");
      out.write("									$nickname.val('').focus();\r\n");
      out.write("								\r\n");
      out.write("								} else { // 중복 X == 사용 가능\r\n");
      out.write("									\r\n");
      out.write("									if(confirm('사용 가능한 닉네임입니다. 사용하시겠습니까?')){\r\n");
      out.write("										$nickname.attr('readonly', true);\r\n");
      out.write("									}\r\n");
      out.write("									else{\r\n");
      out.write("										$nickname.focus();\r\n");
      out.write("									}\r\n");
      out.write("								}\r\n");
      out.write("							},\r\n");
      out.write("							error : function(){\r\n");
      out.write("								console.log('AJAX통신실패');\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				</script>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>전화번호</td>\r\n");
      out.write("					<td><input type=\"text\" placeholder=\"-제외하고 입력해주세요.\" maxlength=\"11\" name=\"memPhone\" required></td>\r\n");
      out.write("					<td id=\"phoneMent\"></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>이메일</td>\r\n");
      out.write("					<td><input type=\"email\" name=\"email\" placeholder=\"@포함하여 입력해주세요.\" required></td>\r\n");
      out.write("					<td><button class=\"btn btn-sm btn-primary\" type=\"button\" onclick=\"emailCheck();\">중복확인</button></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("				<script>\r\n");
      out.write("					function emailCheck(){\r\n");
      out.write("						\r\n");
      out.write("						const $email = $('#enroll-form input[name=email]');\r\n");
      out.write("						// console.log($nickname);\r\n");
      out.write("						$.ajax({ \r\n");
      out.write("							url : 'emailCheck.do',\r\n");
      out.write("							data : {checkEmail : $email.val()},\r\n");
      out.write("							success : function(result){\r\n");
      out.write("								\r\n");
      out.write("								if(result =='NNNNN'){ // 중복된 닉네임\r\n");
      out.write("									alert('중복되는 이메일입니다.');\r\n");
      out.write("								\r\n");
      out.write("									$email.val('').focus();\r\n");
      out.write("								\r\n");
      out.write("								} else { // 중복 X == 사용 가능\r\n");
      out.write("									\r\n");
      out.write("									if(confirm('사용 가능한 이메일입니다. 사용하시겠습니까?')){\r\n");
      out.write("										$email.attr('readonly', true);\r\n");
      out.write("										\r\n");
      out.write("										// 중복확인 전 막아두었던 submit버튼 활성화\r\n");
      out.write("										$('#enroll-form button[type=submit]').removeAttr('disabled');\r\n");
      out.write("									}\r\n");
      out.write("									else{\r\n");
      out.write("										$email.focus();\r\n");
      out.write("									}\r\n");
      out.write("								}\r\n");
      out.write("							},\r\n");
      out.write("							error : function(){\r\n");
      out.write("								console.log('AJAX통신실패');\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("					}\r\n");
      out.write("				\r\n");
      out.write("				</script>\r\n");
      out.write("				\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td>생년월일</td>\r\n");
      out.write("					<td><input type=\"text\" name=\"bornDate\" placeholder=\"생년월일 8자리를 입력해주세요.\" maxlength=\"8\" required></td>\r\n");
      out.write("					<td></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("			<br><br>\r\n");
      out.write("\r\n");
      out.write("			<div align=\"center\">\r\n");
      out.write("				<button type=\"reset\" class=\"btn btn-sm btn-secondary\">취소</button>\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-sm btn-primary\" id=\"memJoin\">회원가입</button>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<br><br>\r\n");
      out.write("		\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("		<!-- 정규표현식 -->\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 아이디 */\r\n");
      out.write("			$('input[name=memId]').blur(function(){\r\n");
      out.write("				const idReg =  /^[A-Za-z0-9]{4,12}$/;\r\n");
      out.write("				const idVal = $('input[name=memId]').val();\r\n");
      out.write("\r\n");
      out.write("				if(!idReg.test(idVal)){\r\n");
      out.write("					$('input[name=memId]').val('');\r\n");
      out.write("					$('input[name=memId]').css('border-color','orangered');\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					$('input[name=memId]').css('border-color', 'rgb(230, 230, 230)');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 비밀번호 */\r\n");
      out.write("			$('input[name=memPwd]').blur(function(){\r\n");
      out.write("				const pwdReg =  /^[A-Za-z0-9]{4,15}$/;\r\n");
      out.write("				const pwdVal = $('input[name=memPwd]').val();\r\n");
      out.write("\r\n");
      out.write("				if(!pwdReg.test(pwdVal)){\r\n");
      out.write("					$('input[name=memPwd]').val('');\r\n");
      out.write("					$('input[name=memPwd]').css('border-color','orangered');\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					$('input[name=memPwd]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 비밀번호 확인 */\r\n");
      out.write("				$('#memPwd2').blur(function(){\r\n");
      out.write("					const pwdReg2 = /^[A-Za-z0-9]{4,15}$/;\r\n");
      out.write("					const pwdVal2 = $('#memPwd2').val();\r\n");
      out.write("\r\n");
      out.write("					if(!pwdReg2.test(pwdVal2)){\r\n");
      out.write("						$('#memPwd2').val('');\r\n");
      out.write("						$('#memPwd2').css('border-color','orangered');\r\n");
      out.write("					}\r\n");
      out.write("					else{\r\n");
      out.write("						$('#memPwd2').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 이름 */\r\n");
      out.write("			$('input[name=memName]').blur(function(){\r\n");
      out.write("					const memNameReg = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|]{2,15}$/;\r\n");
      out.write("					const memNameVal = $('input[name=memName]').val();\r\n");
      out.write("\r\n");
      out.write("					if(!memNameReg.test(memNameVal)){\r\n");
      out.write("						$('input[name=memName]').val('');\r\n");
      out.write("						$('input[name=memName]').css('border-color','orangered');\r\n");
      out.write("					}\r\n");
      out.write("					else{\r\n");
      out.write("						$('input[name=memName]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 닉네임 */\r\n");
      out.write("			$('input[name=nickname]').blur(function(){\r\n");
      out.write("					const nicknameReg = /^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]{2,15}$/;\r\n");
      out.write("					const nicknameVal = $('input[name=nickname]').val();\r\n");
      out.write("\r\n");
      out.write("					if(!nicknameReg.test(nicknameVal)){\r\n");
      out.write("						$('input[name=nickname]').val('');\r\n");
      out.write("						$('input[name=nickname]').css('border-color','orangered');\r\n");
      out.write("					}\r\n");
      out.write("					else{\r\n");
      out.write("						$('input[name=nickname]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 전화번호 */\r\n");
      out.write("			$('input[name=memPhone]').blur(function(){\r\n");
      out.write("				const phoneReg = /^01([0|1|])-?([0-9]{4})-?([0-9]{4})$/;\r\n");
      out.write("				const phoneVal = $('input[name=memPhone]').val();\r\n");
      out.write("\r\n");
      out.write("				if(!phoneReg.test(phoneVal)){\r\n");
      out.write("					$('input[name=memPhone]').val('');\r\n");
      out.write("					$('input[name=memPhone]').css('border-color','orangered');\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					$('input[name=memPhone]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 이메일 */\r\n");
      out.write("			$('input[name=email]').blur(function(){\r\n");
      out.write("				const emailReg = /^[a-zA-Z0-9+-\\_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$/\r\n");
      out.write("				const emailVal = $('input[name=email]').val();\r\n");
      out.write("\r\n");
      out.write("				if(!emailReg.test(emailVal)){\r\n");
      out.write("					$('input[name=email]').val('');\r\n");
      out.write("					$('input[name=email]').css('border-color','orangered');\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					$('input[name=email]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("\r\n");
      out.write("		<script>\r\n");
      out.write("			/* 생년월일 */\r\n");
      out.write("			$('input[name=bornDate]').blur(function(){\r\n");
      out.write("				const bornDateReg = /^(19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])$/\r\n");
      out.write("				const bornDateVal = $('input[name=bornDate]').val();\r\n");
      out.write("\r\n");
      out.write("				if(!bornDateReg.test(bornDateVal)){\r\n");
      out.write("					$('input[name=bornDate]').val('');\r\n");
      out.write("					$('input[name=bornDate]').css('border-color','orangered');\r\n");
      out.write("				}\r\n");
      out.write("				else{\r\n");
      out.write("					$('input[name=bornDate]').css('border-color','rgb(230, 230, 230)');\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		</script>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
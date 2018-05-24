<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="seung.member.*" %>
<jsp:useBean id="mdto" class="seung.member.MemberDTO"/>
<jsp:setProperty property="*" name="mdto"/>
<jsp:useBean id="mdao" class="seung.member.MemberDAO"/>


<%
	int result = mdao.join(mdto);
	String msg=result>0?"회원가입을 죽하드립니다":"회원가입 실패..";
%>

<script><!--아래 얼럿에 ' ' 안썻었다 빼먹지말자ㅜㅠ-->
window.alert('<%=msg%>');
location.href='/mywebprc/Index.jsp';//페이지이동
</script>
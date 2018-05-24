<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="seung.member.*" %>
<jsp:useBean id="mdao" class="seung.member.MemberDAO"/>

<%
	String id=request.getParameter("idcheck");
	int result=mdao.idCheck(id);//값있으면 count 없으면 0
	if(result>0){
		%>
			<script>
			window.alert('이미 존재하는ID입니다.');
			location.href='idCheck.jsp';/*여기까지먹임*/
			</script>
		<%//아이디있으니 사용불가능
	}else{
		%>
			<script>
			window.alert('<%=id%> 사용가능합니다.');
			
			window.opener.document.fm.id.value=('<%=id%>');
			//윈도우.오프너.도큐먼트.폼태그이름.텍스트박스이름.넘겨줄값
			window.self.close();
			</script>
		<%
		//없으니 사용가능
		///////아직 수정중
	}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../css/mainlayout.css">
<style>
h2{
	text-align: center;
}


#join{
	margin:0px auto;
	background-color: orange;
}
</style>
<script>
function show(){
	window.open('idCheck.jsp','Checkpage','width=500,height=200');
}

</script>
</head>
<body>
<%@include file="/header.jsp" %>
<h2>회원가입</h2>
<section>
	<form name="fm" action="join_ok.jsp">
		<fieldset>
			<table id="join">
				<tr>
				<th>ID</th>
				<td><input type ="text" name="id" placeholder="중복검사를누르시오." readonly>
				<input type="button" value="중복검사" onclick="show()"></td>
				</tr>
				<tr>
				<th>비밀번호</th>
				<td><input type ="password" name="pwd" placeholder="비밀번호를입력하세요"></td>
				</tr>
				<tr>
				<th>이름</th>
				<td><input type ="text" name="name" placeholder="이름를입력하세요"></td>
				</tr>
				<tr>
				<th>E-Mail</th>
				<td><input type ="text" name="email" placeholder="이메일을입력하세요"></td>
				</tr>
				<tr>
				<th>주소</th>
				<td><input type ="text" name="addr" placeholder="주소를입력하세요"></td>
				</tr>
				<tr>
				<th>전화번호</th>
				<td><input type ="text" name="tel" placeholder="전화번호를입력하세요"></td>
				</tr>
				<tr>
				<th colspan="2" align="center">
				<input type="submit" value="회원가입">
				<input type="button" value="취소">
				</th>
				</tr>
			</table>
		</fieldset>
	</form>
<%@include file="/footer.jsp" %>
</section>
</body>
</html>
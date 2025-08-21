<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>계산결과</h1>
<form method="post" action="">

<strong>

<%
	int num3 = (int)request.getAttribute("number3");
	out.println(num3);
%>

</strong>

</form>
</body>
</html>
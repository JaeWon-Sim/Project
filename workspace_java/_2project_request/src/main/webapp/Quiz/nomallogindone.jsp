<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="">

<h1>�α��� ����</h1>
<% 
	String id = (String)request.getAttribute("id");
	String pw = (String)request.getAttribute("pw");
	out.println(id);
%>
�� ȯ���մϴ�!
</form>
</body>
</html>
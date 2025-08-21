<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>
<%-- 	<jsp:include page="jsp.jsp?name=ab"></jsp:include> --%>
	<jsp:include page="1_jsp.jsp">
		<jsp:param name="name" value="nilla" />
	</jsp:include>
<%-- 		<jsp:param name="name" value="nilla"></jsp:param> --%>
	<!-- 포워드로 가도 주소가 안바뀜 !!자택근무!! 일하는 모습 안보여줌 -->
	<jsp:forward page="header.jsp" />
</body>
</html>
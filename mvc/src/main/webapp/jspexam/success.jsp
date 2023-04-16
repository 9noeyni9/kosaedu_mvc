<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.domain.TimeVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
*{
text-align: center;
}
</style>
</head>
<body>
<h1>Lotto 당첨~~~</h1>
<hr>
<%
  TimeVO vo = (TimeVO)request.getAttribute("time");
%>
<h2><%= vo.getHour() %>시 <%=vo.getMinute() %>분에 당첨~!~!~!~!~!! 축하합니다!!!!!!!!! </h2>
<img src="../../edu/images/success.PNG">
</body>
</html>
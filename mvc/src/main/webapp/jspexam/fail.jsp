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
<h1>lotto 꽝~~~~ㅠ0ㅠ</h1>
<hr>
<%
  TimeVO vo = (TimeVO)request.getAttribute("time");
%>
<h2><%= vo.getHour() %>시 <%= vo.getMinute() %>분에 당첨실패....ㅠ 다음 기회에... </h2>
<img src="../../edu/images/fail.PNG"><br>
<a href='<%= request.getHeader("referer") %>'>로또 응모하러</a>
</body>
</html>
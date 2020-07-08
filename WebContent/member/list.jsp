<%@page import="com.study.model.member.Dept"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	List<Dept> list =(List)request.getAttribute("list");
out.print("게시물 수는 : "+list.size());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
</script>
</head>
<body>
<table>
	<tr>
		<td>부서번호</td>
		<td>부서명</td>
		<td>부서위치</td>
	</tr>
	<%for(int i=0; i<list.size(); i++){ %>
	<%Dept dept = list.get(i); %>
	<tr>
		<td><%=dept.getDeptno() %></td>
		<td><%=dept.getDname() %></td>
		<td><%=dept.getLoc() %></td>
	</tr>
	<%} %>
</table>
</body>
</html>
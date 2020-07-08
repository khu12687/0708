<%@page import="com.study.model.member.Emp"%>
<%@page import="com.study.model.member.Dept"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
	List<Emp> list =(List)request.getAttribute("list");
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
<table border="1px">
	<tr>
		<td>사원번호</td>
		<td>사원명</td>
		<td>업무</td>
		<td>메니져</td>
		<td>입사일</td>
		<td>급여</td>
		<td>커미션</td>
		<td>부서번호</td>
		<td>부서명</td>
		<td>위치</td>
	</tr>
	<%for(int i=0; i<list.size(); i++){ %>
	<%Emp emp = list.get(i); %>
	<tr>
		<td><%=emp.getEmpno()%></td>
		<td><%=emp.getEname()%></td>
		<td><%=emp.getJob()%></td>
		<td><%=emp.getMgr()%></td>
		<td><%=emp.getHiredate()%></td>
		<td><%=emp.getSal()%></td>
		<td><%=emp.getComm()%></td>
		<td><%=emp.getDept().getDeptno()%></td>
		<td><%=emp.getDept().getDname()%></td>
		<td><%=emp.getDept().getLoc()%></td>
	</tr>
	<%} %>
</table>
</body>
</html>
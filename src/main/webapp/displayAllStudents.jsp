<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.jsp.springmvc.studentdb.entity.Student" %> <!-- Adjust the package name as needed -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Student> sList = (List) request.getAttribute("studentList");
	%>

	<table border="">

		<tr>
			<td>Student Id</td>
			<td>Student Name</td>
			<td>Email</td>
			<td>Age</td>
			<td>Marks</td>
			<td>Update</td>
			<td>Delete</td>
		</tr>

		<%
		
			for (Student student : sList){
		%>

		<tr>
			<td><%=student.getStudentId() %></td>
			<td><%=student.getStudentName() %></td>
			<td><%=student.getStudentEmail() %></td>
			<td><%=student.getStudentAge() %></td>
			<td><%=student.getStudentMarks() %></td>
		</tr>

		<%
			}
		
		%>
		
		

	</table>

	<a href="index.jsp">Go to DashBoard</a>

</body> 
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Student Details</h1>
	<form action="add-student" method="post">
		<input type="number" placeholder="Enter Student Id" name="studentId"> <br>
		<input type="text" placeholder="Enter Student Name" name="studentName"> <br>
		<input type="text" placeholder="Enter Student Email" name="studentEmail"> <br>
		<input type="number" placeholder="Enter Student Age" name="studentAge"> <br>
		<input type="number" placeholder="Enter Student Marks" name="studentMarks"> <br>
		<input type="submit" value="ADD">
		
	</form>
</body>
</html>
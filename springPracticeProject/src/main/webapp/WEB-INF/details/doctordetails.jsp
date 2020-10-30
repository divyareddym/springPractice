<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<h1>Please enter Doctor details</h1>
<body>
	<form action="/springPracticeProject/save" method="post">
		Doctor ID <input type="text" name="DOCTORID"><br>
		Doctor NAME <input type="text" name="DOCTORNAME"><br>
		Doctor SALARY: <input type="text" name="DOCTORSALARY"><br>
		<input type="submit" name="SUBMIT">
	</form>
	 <a href="/springPracticeProject/search">click here to doctor search</a> <br>
	 	 <a href="/springPracticeProject/getAllDoctors">click here to get all doctors</a> 
</body>
</html>
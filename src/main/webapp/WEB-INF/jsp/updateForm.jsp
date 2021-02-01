<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
	<h2>User Update Information Form</h2>
	<br>
	<form action='update' method='POST'>
	<h4>Enter any updates below.</h4>
	<label> Enter your Firstname:  <input type='text' name='firstname'></input></label>
	<br>
	<br>
	<label> Enter your Lastname :  <input type='text' name='lastname'></input></label>
	<br>
	<br>
	<label> Enter your Username: <input type='text' name='username'></input></label>
	<br>
	<br>
	<label> Enter your Password: <input type='text' name='password'></input></label>
	<br>
	<br>
	<input type='submit' value = 'Update'>
	</form>
</body>
</html>
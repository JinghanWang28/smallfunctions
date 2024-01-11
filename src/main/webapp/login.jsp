<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <link rel="stylesheet" type="text/css" href="style.css">
 <link href="https://fonts.googleapis.com/css?family=Lobster" rel="stylesheet">
<title>Registration page</title>
</head>
<body>
<div align="center">
<h1>User Signup Login</h1> 
<!-- Login form -->
<form action="login" method="post" class="auth-form">
<table>
<tr><td>User Name: </td><td><input type="text" name="username"></td></tr>
<tr><td>Password:  </td><td><input type="password" name="password"></td></tr>
<tr><td></td><td><input type="submit" value="Login" class="login-button"></td></tr>
</table>
</form>
</div>
</body>
</html>
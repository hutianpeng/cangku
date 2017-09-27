<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="UpdateServlet">
<input name="id" value="${liu.id }" type="hidden"><br>
姓名<input name="name" value="${liu.name }"/><br/>
年龄<input name="age" value="${liu.age }"/><br/>
学校<input name="school" value="${liu.school }"/><br/>
<input type="submit"/>
</form>
</body>
</html>
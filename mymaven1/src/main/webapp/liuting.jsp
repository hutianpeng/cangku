<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="tianji.jsp">添加信息</a>
 <table border="1">
 <tr>
 <td>id</td>
 <td>姓名</td>
 <td>年龄</td>
 <td>学校</td>
 <td>操作</td>
 <td>操作</td>
 <td>操作</td>
 </tr>
 <c:forEach items="${list }" var="i">
 <tr>
 <td>${i.id}</td>
 <td>${i.name}</td>
 <td>${i.age}</td>
 <td>${i.school}</td>
  <td><a href="IdServlet?id=${i.id }">查询</a></td>
 <td><a href="ShanChuServlet?id=${i.id }">删除</a></td>
 <td><a href="Update?id=${i.id }">更改</a></td>
 </tr>
 
 </c:forEach>
 
 </table>
</body>
</html>
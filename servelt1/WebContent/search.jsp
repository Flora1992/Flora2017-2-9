<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.domain.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户后台</title>
</head>
<body>
欢迎${user.account}来到用户后台管理系统<br>
昵称${user.nickName}<br>
年龄${user.age}<br>
性别${user.sex}<br>
头像<img src="/images/${user.headImag}">



</body>
</html>
<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>坤坤学生成绩管理系统</title>
	</head>
	<body>
		<h1>用户登录</h1>
		<html:form action="/register?method=login">
			用户名 : <html:text property="userName"/><html:errors property="userName"/><br/>			
			<html:submit value="登录"/><html:reset value="重置"/>
			<a href="register.jsp">注册</a>
		</html:form>
	</body>
</html>


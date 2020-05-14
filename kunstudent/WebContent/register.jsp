<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>坤坤学生成绩管理系统</title>
	</head>
	<body>
		<h1>用户注册</h1>
		<html:form action="/register?method=register">
			用户名 : <html:text property="userName"/><html:errors property="userName"/><br/>
			年龄 : <html:text property="age"/><html:errors property="age"/><br/>
			<html:submit value="注册"/><html:reset value="重置"/>
		</html:form>
	</body>
</html>


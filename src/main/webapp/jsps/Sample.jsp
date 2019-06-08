<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="sample!excute.action" method="post">
		<label for="name">Please enter your name</label><br /> <input
			type="text" name="name" /> <input type="submit" value="提出する" /> 
			类属性message（el表达式）: ${message}<br> 
			类属性 用户 （el表达式）:${ru.age}<br>
		    struts类属性 用户:
		    <s:property value="#attr.ru.age" />
		    <br> struts 类属性 message：
		    <s:property value="#attr.message" />
		    <br>
		    
		    111111111111111

	</form>
</body>
</html>
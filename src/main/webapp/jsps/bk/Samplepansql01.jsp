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
			<br> 
			类属性message（el表达式）: ${message}<br> 
			类属性 用户 （el表达式）:${ru.age}<br>
		    struts类属性 用户:
		    <s:property value="#attr.ru.age" />
		    <br> struts 类属性 message：
		    <s:property value="#attr.message" />
		    <br>
		    
		    PAN01

	</form>
	<br>
	<form action="samplepansql01!excutepan.action" method="post">
		<label for="name">Please enter your name</label><br /> 
			userid &nbsp;&nbsp;&nbsp;:<input type="text" name="userid" /> <br/>
			username:<input type="text" name="username" /> <br/>
			userpwd &nbsp;:<input type="text" name="userpwd" /> <br/>
		<input type="submit" value="提出する" />
			<br>
		类属性userid（el表达式）: ${userid}<br>
		类属性 username （el表达式）:${username}<br>
		类属性userpwd（el表达式）: ${userpwd}<br>
		<br>
		类属性userid（el表达式）: ...${pan.userID}<br>
		类属性 username （el表达式）: ...${pan.userName}<br>
		类属性userpwd（el表达式）: ...${pan.userPWD}<br>
		<br>struts类属性 selectuserpan.userid:
		<s:property value="#attr.pan.userID" />
		<br> struts 类属性 selectuserpan.username：
		<s:property value="#attr.pan.userName" />
		<br> Pan

	</form>
	
		<br>
	<form action="samplepansql01!excuteDelete.action" method="post">
		<label for="name">Delete</label><br /> 
			userid &nbsp;&nbsp;&nbsp;:<input type="text" name="userid" /> <br/>
			username:<input type="text" name="username" /> <br/>
			userpwd &nbsp;:<input type="text" name="userpwd" /> <br/>
		<input type="submit" value="提出する" />
			<br>
		类属性message（el表达式）: ${message}<br>
		类属性 用户 （el表达式）:${ru.age}<br>
		<br>struts类属性 用户:
		<s:property value="#attr.pan.age" />
		<br> struts 类属性 message：
		<s:property value="#attr.message" />
		<br> Pan

	</form>
</body>
</html>
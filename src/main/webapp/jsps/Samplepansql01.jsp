<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL TEST PAGE</title>
</head>
<body>
	<div>
		SQL TEST PAG
		title &nbsp; ： &nbsp;  ${title} <br/>
	</div>
	<form action="samplepansql01!end.action" method="post">
		<label for="name">END</label><br /> 
		<input type="submit" value="END" />
		<br> Pan
	</form>
	<br>
	<form action="samplepansql01!excutepan.action" method="post">
		<label for="name">Insert title here</label><br /> 
			userid &nbsp;&nbsp;&nbsp;:<input type="text" name="userid" /> <br/>
			username:<input type="text" name="username" /> <br/>
			userpwd &nbsp;:<input type="text" name="userpwd" /> <br/>
		<input type="submit" value="提出する" /><br>
			
		<br>
			类属性userid（el表达式）: ${userid}<br>
			类属性 username （el表达式）:${username}<br>
			类属性userpwd（el表达式）: ${userpwd}<br>
		
		<br>
			类属性userid（el表达式）: ...${pan.userID}<br>
			类属性 username （el表达式）: ...${pan.userName}<br>
			类属性userpwd（el表达式）: ...${pan.userPWD}<br>
		
		<br>
			struts类属性 selectuserpan.userid:
			<s:property value="#attr.pan.userID" />
		<br>
			struts 类属性 selectuserpan.username：
			<s:property value="#attr.pan.userName" />
		<br> 
	</form>
	<br> 
	<form action="samplepansql01!excuteUpdate.action" method="post">
		<label for="name">UPDATE</label><br /> 
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
		
		<br>
			struts类属性 selectuserpan.userid:
			<s:property value="#attr.pan.userID" />
		<br>
			struts 类属性 selectuserpan.username：
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
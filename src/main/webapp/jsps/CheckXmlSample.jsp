<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("a").click(function() {
			$.ajax({
				type : 'post',
				url : 'result!excute.action',
				data : $("#myform").serialize(),
				cache : false,
				dataType : 'json',
				success : function(data) {
					alert("请求成功");
				}
			});
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>


	<div style="text-align: center;">ユーザー情報入力</div>
	<br>



	<s:form  id="myform" action="result!excute.action" method="post"
		validate="true">
		<s:textfield name="userName" label="userName111" />
		<s:textfield name="userPWD" label="userPWD111" />

		<s:submit />
	</s:form>
	<a href="#" style="text-decoration: none;">使用ajax提交表单数据</a>
	
	
	<!--  
	<form action="" id="myform" method="POST">
		用户名<input type="text" name="userName" /> 密码<input type="password"
			name="userPWD" /> 
	</form>
	-->
	


	<br>


</body>
</html>
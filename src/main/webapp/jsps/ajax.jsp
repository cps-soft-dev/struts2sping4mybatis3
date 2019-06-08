<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="../js/jquery-3.3.1.min.js">
function login() {
    $.ajax({
        type: "POST",
        dataType: "json",
        url: "ajax.jsp" ,
        data: $('#form').serialize(),
        success: function (result) {
            console.log(result);
            if (result.resultCode == 200) {
                alert("成功しました");
            }
            ;
        },
        error : function() {
            alert("異常になりました。");
        }
    });
}

</script>
<title>ajax</title>

</head>
<body>
	<form  id="form"  action="../ajax!excute.action">
		<label for="name">Please enter your name</label><br /> 
		<input type="text" name="name" /> 
			<button  onclick="login()" >提出する</button> 
			类属性message（el表达式）: ${message}<br> 
			类属性 用户 （el表达式）:${ru.age}<br>
		    struts类属性 用户:
		    <s:property value="#attr.ru.age" />
		    <br> struts 类属性 message：
		    <s:property value="#attr.message" />
		    <br>
	

	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user add</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/UserService.js"></script>
<script type="text/javascript">
	
	UserService.add({
		id:22,
		name:"顾四"		
	},callBack);
	
	function callBack(result){
		alert(result);
	}
</script>
</head>
<body>

</body>
</html>
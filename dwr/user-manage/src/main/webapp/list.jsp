<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user update</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/UserService.js"></script>
<script type="text/javascript">
	
	UserService.list(callBack);
	
	function callBack(list){
		for(var i=0;i<list.length;i++){
			var user=list[i];
			alert(user.id+" "+user.name);
		}
	}
</script>
</head>
<body>

</body>
</html>
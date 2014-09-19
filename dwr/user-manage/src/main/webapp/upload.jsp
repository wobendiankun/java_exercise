<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>文件上传</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/FileService.js"></script>
<script type="text/javascript">
	function upload(){
		var file=dwr.util.getValue("file");
		FileService.upload(file,file.value,function(result){
			alert(result);
		});
	}
</script>
</head>
<body>
附件:<input type="file" id="file" name="file"><br/>
<button onclick="upload();">上传</button>
</body>
</html>
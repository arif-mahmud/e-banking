<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
  <div id="global"> 
  <h1>Single File Upload</h1>
   <s:fielderror /> 
   <s:form action="SingleFileUpload" enctype="multipart/form-data" method="post" >
   <s:textfield name="description" label="Description"/>
   <s:file name="attachment" label="Attachment"/>
   <s:submit />
   </s:form>
   </div>
</body>
</html>
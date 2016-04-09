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
  <h1>Uploaded Data</h1>
   <s:fielderror /> 
   <s:property value="description"/>
   </div>
   	User Image: <s:property value="attachment"/>
	<br/>
	Content Type: <s:property value="attachmentContentType"/>
	<br/>
	File Name: <s:property value="attachmentFileName"/>
	<br/>
	Uploaded Image:
	<br/>
	<img height="100px"  width="100px" src="<s:url value="/uploadedImages/%{attachmentFileName}"/>"/>
</body>
</html>
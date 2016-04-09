<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Customer Form - Struts2 Demo | ViralPatel.net</title>
</head>
 
<body>
<h2>Customer Form</h2>
 
<s:form action="loginFrm.action" method="post">
    <s:textfield name="LoginId" key="LoginId" size="20" />
    <s:textfield name="Password" key="Password" size="20" />
    <s:submit value="login" key="label.add.customer" align="center" />
</s:form>
</body>
</html>
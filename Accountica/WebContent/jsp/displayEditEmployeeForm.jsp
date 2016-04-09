<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Edit Employee Form</title>
</head>
<body>
	<a href="<s:url action="welcomepage"/>">Home Page</a>
	<h3>Edit Employee</h3>
	<s:form action="updateEmployee" method="post">
		<s:hidden name="employee.employeeId"/>
		<s:textfield key="firstName" name="employee.firstName" />
		<s:textfield key="lastName" name="employee.lastName" />
		<s:select label="Category" listKey="departmentId"
			listValue="departmentName" list="deptList" key="employee.department.departmentId"
			value="" />
		<s:textfield key="age" name="employee.age" />
		<s:submit value="Continue" key="submit" />
	</s:form>
</body>
</html>
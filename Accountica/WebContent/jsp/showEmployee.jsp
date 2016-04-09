<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<b>Employee has been found.</b>
<br />
<br />
<b>Details :</b>
<br />
Employee Id:
<s:property value="employee.employeeId" />
<br>
First Name:
<s:property value="employee.firstName" />
<br>
Last Name:
<s:property value="employee.lastName" />
<br>
Dept :
<s:property value="employee.department.departmentName" />
<br> Age: <s:property value="employee.age" />
	<br>
<a href="<s:url action="displayEmployeeList"/>">Display All Employees</a>


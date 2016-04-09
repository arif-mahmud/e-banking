<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
	<table>
		<thead>
			<tr>
				<th>Employee Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Department</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<s:iterator id="employee" value="employeeList">
			<tr>
				<td><s:property value="%{#employee.employeeId}" />
				</td>
				<td><s:property value="%{#employee.firstName}" />
				</td>
				<td><s:property value="%{#employee.lastName}" />
				</td>
				<td><s:property value="%{#employee.age}" />
				</td>
				<td><s:property value="%{#employee.department.departmentName}" />
				</td>
				<td><s:url id="editurl" namespace="/" action="EmployeeEdit">
						<s:param name="employeeId">
							<s:property value="%{#employee.employeeId}" />
						</s:param>
					</s:url> <s:a href="%{editurl}">Edit</s:a></td>
				<td><s:url id="deleteUrl" namespace="/" action="EmployeeDelete">
						<s:param name="employeeId">
							<s:property value="%{#employee.employeeId}" />
						</s:param>
					</s:url> <s:a href="%{deleteUrl}">Delete</s:a></td>
			</tr>
		</s:iterator>
	</table>
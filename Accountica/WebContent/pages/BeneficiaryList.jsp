<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="panel panel-default" style="overflow: scroll; padding-left: 0px;">
	<div class="panel-body">
		<h1>Account List</h1>
	</div>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Alias Name</th>
				<th>Bank Account Number</th>
				<th>Account Holder Name</th>
				<th>MobileNumber</th>
				<th>Email</th>
				<th>Amount</th>
			</tr>
		</thead>
		<s:iterator id="ben" value="benList">
			<tr>
				<td><s:property value="%{#ben.aliasName}"/></td>
				<td><s:property value="%{#ben.bankAccNumber}"/></td>
				<td><s:property value="%{#ben.bankaccount.AccountHolderName}"/></td>
				<td><s:property value="%{#ben.bankaccount.ContactNumber}"/></td>
				<td><s:property value="%{#ben.bankaccount.EmailAddress}"/></td>
				<td><s:property value="%{#ben.amount}"/></td>				
			</tr>
		</s:iterator>
	</table>
</div>


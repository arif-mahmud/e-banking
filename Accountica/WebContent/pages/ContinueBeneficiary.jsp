<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="col-lg-10">
	<div class="form-horizontal well">
		<s:form action="ConfBeneficiary" method="post">
			<p class="f_legend">Deposit Amount</p>
			<table>
				<tr>
					<td width="20%">Alis Name:</td>
					<td><s:property value="beneficiary.aliasName" /></td>
				</tr>
				<tr>
					<td width="20%">A/c No:</td>
					<td><s:property value="beneficiary.bankAccNumber" /></td>
				</tr>
				<tr>
					<td width="20%">A/C Name:</td>
					<td><s:property value="beneficiary.accountHolderName" /></td>
				</tr>
				<tr>
					<td width="20%">Mobile:</td>
					<td><s:property value="beneficiary.mobile" /></td>
				</tr>
				<tr>
					<td width="20%">Email:</td>
					<td><s:property value="beneficiary.email" /></td>
				</tr>
				<tr>
					<td width="20%">Amount:</td>
					<td><s:property value="beneficiary.amount" /></td>
				</tr>
			</table>
			
			<s:hidden key="beneficiary.aliasName" />
			<s:hidden key="beneficiary.bankAccNumber" />
			<s:hidden key="beneficiary.accountHolderName" />
			<s:hidden key="beneficiary.mobile" />
			<s:hidden key="beneficiary.email" />
			<s:hidden key="beneficiary.amount" />
			<s:submit type="button" class="btn btn-primary" value="Submit" />
		</s:form>
	</div>
</div>
<div class="col-lg-2">&nbsp;</div>

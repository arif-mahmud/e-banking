<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="col-lg-10">
	<div class="form-horizontal well">
		<s:form action="SaveDeposit" method="post">
			<p class="f_legend">Deposit Amount</p>
			<table>
				<tr>
					<td width="20%">Account Number:</td>
					<td><s:property value="ledgeraccount.bankAccNumber" /></td>
				</tr>
				<tr>
					<td width="20%">Deposit Amount:</td>
					<td><s:property value="ledgeraccount.depositAmount" /></td>
				</tr>
				<tr>
					<td width="20%">Ref/Check Number:</td>
					<td><s:property value="ledgeraccount.refInfo" /></td>
				</tr>
				<tr>
					<td width="20%">Description:</td>
					<td><s:property value="ledgeraccount.description" /></td>
				</tr>
				</tr>
			</table>

			<s:hidden key="ledgeraccount.bankAccNumber" />
			<s:hidden key="ledgeraccount.depositAmount" />
			<s:hidden key="ledgeraccount.refInfo" />
			<s:hidden key="ledgeraccount.description" />
			<s:submit type="button" class="btn btn-primary" value="Submit" />
		</s:form>
	</div>
</div>
<div class="col-lg-2">&nbsp;</div>

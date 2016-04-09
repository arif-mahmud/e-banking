
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<div class="col-lg-10">
	<div class="form-horizontal well">
		<div class="alert alert-success">
			Withdraw balance has been done successfully
		</div>
		<table>
			<tr>
				<td width="20%">Account Number:</td>
				<td><s:property value="ledgeraccount.bankAccNumber" /></td>
			</tr>
			<tr>
				<td width="20%">Withdraw Amount:</td>
				<td><s:property value="ledgeraccount.withdrawAmount" /></td>
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

	</div>
</div>
<div class="col-lg-2">&nbsp;</div>

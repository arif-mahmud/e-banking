
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<div class="col-lg-10">
	<div class="form-horizontal well">
		<s:form action="continueWithdraw" method="post">
			<p class="f_legend">Withdraw Amount</p>
			<s:textfield label="Account Number" name="ledgeraccount.bankAccNumber"
				class="form-control" />
			<s:textfield label="Withdraw Amount" name="ledgeraccount.withdrawAmount"
				class="form-control" />
			<s:textfield label="Ref/Check Number" name="ledgeraccount.refInfo"
				class="form-control" />
			<s:textarea label="Description" name="ledgeraccount.description"
				class="form-control" />
			<s:submit type="button" class="btn btn-primary" value="Continue" />
		</s:form>
	</div>
</div>
<div class="col-lg-2">&nbsp;</div>

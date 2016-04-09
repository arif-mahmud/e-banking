<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="form-horizontal well">
		
		<s:form action="ContinueBeneficiary" method="post">
			<p class="f_legend">Create Beneficiary</p>
		    <s:textfield name="beneficiary.aliasName" key="global.AliasName" class="form-control" placeholder="AliasName" />
		    <s:textfield name="beneficiary.bankAccNumber" key="global.BankAccNumber" class="form-control" placeholder="BankAccNumber" />
		    <s:textfield name="beneficiary.accountHolderName" key="global.AccountHolderName" class="form-control" placeholder="Account Name" />
		    <s:textfield name="beneficiary.mobile" key="global.Mobile" class="form-control" placeholder="Mobile no" />
		    <s:textfield name="beneficiary.email" key="global.EmailAddress" class="form-control" placeholder="Email" />
		    <s:textfield name="beneficiary.amount" key="global.Amount" class="form-control" placeholder="Amount" />
		    <s:submit key="global.submit" align="center" />
		</s:form>
		</div>
	
</div>
<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>


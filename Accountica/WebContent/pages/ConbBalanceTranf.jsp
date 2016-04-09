<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page contentType="text/html; charset=UTF-8"%>


<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="form-horizontal well">		
		<s:form action="BalanceTranfConf" method="post">
			<p class="f_legend">Balance Transfer info</p>
		    <s:textfield name="acctrnshis.fromAccount" key="global.fromac" class="form-control" placeholder="Account Number" />
		    <s:select name="acctrnshis.aliasName" label="Beneciciary" list="alies" headerKey="" headerValue="Select" class="form-control"/>
		    <s:textfield name="acctrnshis.accountHolderName" key="global.AccountHolderName" class="form-control" placeholder="Account Name" />
		    <s:textfield name="acctrnshis.mobile" key="global.Mobile" class="form-control" placeholder="Mobile no" />
		    <s:textfield name="acctrnshis.email" key="global.EmailAddress" class="form-control" placeholder="Email" />
		    <s:textfield name="acctrnshis.amount" key="global.Amount" class="form-control" placeholder="Amount" />
		    <s:submit key="global.submit" align="center" />
		</s:form>
		</div>
	
</div>
<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>


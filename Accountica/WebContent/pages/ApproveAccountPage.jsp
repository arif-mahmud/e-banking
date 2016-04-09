
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<div class="row">
	<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
	<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="col-sm-4 col-md-4 col-lg-2"></div>
		<div class="col-sm-4 col-md-4 col-lg-8">
			<div class="form-horizontal well">
				<s:form action="ApproveAccount" method="post">
					<p class="f_legend">Approval of New Account</p>
					<s:hidden name="bankaccount.BankAccNumber"/>
					<s:select name="bankaccount.BankAccountType" label="BankAccountType" list="accountTypes"  listKey="id" listValue="name" headerKey="" headerValue="Select AccountType" class="form-control"/>
					<s:textfield name="bankaccount.AccountHolderName" key="global.AccountHolderName" class="form-control" placeholder="Account Name" />
					<s:textfield name="bankaccount.FatherName" key="global.FatherName" class="form-control" placeholder="Father Name" />
					<s:textfield name="bankaccount.MotherName" key="global.MotherName" class="form-control" placeholder="Mother Name" />
					<s:textarea name="bankaccount.PermanentAddress" key="global.PermanentAddress" class="form-control" placeholder="Permanent Address"/>
					<s:textarea  name="bankaccount.CurrentAddress" key="global.CurrentAddress" class="form-control" placeholder="Current Address"/>
					<s:textfield name="bankaccount.ContactNumber" key="global.ContactNumber" class="form-control" placeholder="Contact Number"/>
					<s:textfield name="bankaccount.NID_PN" key="global.NID_PN" class="form-control" placeholder="National Id"/>
					<s:textfield name="bankaccount.EmailAddress" key="global.EmailAddress" class="form-control" placeholder="Email Address"/>
					<s:textfield name="bankaccount.Occupation" key="global.Occupation" class="form-control" placeholder="Occupation"/>
					<s:textfield name="bankaccount.YearlyIncome" key="global.YearlyIncome" class="form-control" placeholder="Yearly Income"/>
					<s:select list="currencies" name="bankaccount.Currency" listKey="currency_code" listValue="currency_name" key="global.Currency" class="form-control"/>	
					<s:select name="bankaccount.activeStatus"
						label="BankAccountType" list="status" listKey="id"
						listValue="name" headerKey="" headerValue="Select Active Status"
						class="form-control" />
					<s:submit type="button" class="btn btn-primary" value="Approve" />
				</s:form>				
			</div>
		</div>
		<div class="col-sm-4 col-md-4 col-lg-2"></div>
	</div>
	<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
</div>



<script type="text/javascript">
	$(document).ready(function() {
		//$( ".errorMessage" ).each(function() {
		//	$(this).addClass("alert alert-danger");
		//	});
	});

	
</script>
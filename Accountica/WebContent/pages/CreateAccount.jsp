
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<div class="row">
	<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
	<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="col-sm-4 col-md-4 col-lg-2"></div>
		<div class="col-sm-4 col-md-4 col-lg-8">
			<div class="form-horizontal well">
				<s:form action="ContinueAccountCreation"
					enctype="multipart/form-data" method="post">
					<p class="f_legend">Customer Account Information</p>
					<s:select name="bankaccount.bankAccountType"
						label="BankAccountType" list="accountTypes" listKey="id"
						listValue="name" headerKey="" headerValue="Select AccountType"
						class="form-control" />
					<s:textfield name="bankaccount.accountHolderName"
						key="global.AccountHolderName" class="form-control"
						placeholder="Account Name" />
					<s:textfield name="bankaccount.fatherName" key="global.FatherName"
						class="form-control" placeholder="Father Name" />
					<s:textfield name="bankaccount.motherName" key="global.MotherName"
						class="form-control" placeholder="Mother Name" />
					<s:textarea name="bankaccount.permanentAddress"
						key="global.PermanentAddress" class="form-control"
						placeholder="Permanent Address" />
					<s:textarea name="bankaccount.currentAddress"
						key="global.CurrentAddress" class="form-control"
						placeholder="Current Address" />
					<s:textfield name="bankaccount.contactNumber"
						key="global.ContactNumber" class="form-control"
						placeholder="Contact Number" />
					<s:textfield name="bankaccount.nid_pn" key="global.NID_PN"
						class="form-control" placeholder="National Id" />
					<s:textfield name="bankaccount.emailAddress"
						key="global.EmailAddress" class="form-control"
						placeholder="Email Address" />
					<s:textfield name="bankaccount.occupation" key="global.Occupation"
						class="form-control" placeholder="Occupation" />
					<s:file name="accountUserImage" label="Upload Image" />
					<s:textfield name="bankaccount.yearlyIncome"
						key="global.YearlyIncome" class="form-control"
						placeholder="Yearly Income" />
					<s:select list="currencies" name="bankaccount.Currency"
						listKey="currency_code" listValue="currency_name"
						key="global.Currency" class="form-control" />
					
					<p class="f_legend">Nominee Information</p>
					<s:textfield name="bankaccount.motherName" key="global.MotherName"
						class="form-control" placeholder="Mother Name" />
					
					<s:textfield name="bankaccount.NomeneeName"
						key="global.NameofNominee" class="form-control"
						placeholder="Name of Nominee" />
					<s:textfield name="bankaccount.nomineeAddress"
						key="nomineeAddress" class="form-control"
						placeholder="Permanent Add. with Phone number" />
					<s:textfield name="bankaccount.nomineeProfession"
						key="nomineeProfession" class="form-control"
						placeholder="Profession" />
					<s:textfield name="bankaccount.nomineeRelation"
						key="nomineeRelation" class="form-control"
						placeholder="Relation with account holder" />
					<s:textfield name="bankaccount.nomineenid_pn"
						key="nomineenid_pn" class="form-control"
						placeholder="NID/Passport No" />
					<s:textfield name="bankaccount.loginId" key="global.LoginId"
						class="form-control" placeholder="Login Id" />
					<s:password name="bankaccount.password" key="global.Password"
						class="form-control" placeholder="Password" />

					<s:submit type="button" class="btn btn-primary" value="Continue" />
				</s:form>
				<div class="">
					Already register? <a href="login">Please Login</a>
				</div>
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

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<div class="row">
	<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
	<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="col-sm-4 col-md-4 col-lg-2"></div>
		<div class="col-sm-4 col-md-4 col-lg-8">
			<div class="form-horizontal well">
				<s:form action="continueRegistration" method="post">
					<p class="f_legend">Customer Account Information</p>
					<s:select label="AccountType" list="{'Saving','Current'}" headerKey="" headerValue="Select AccountType" name="accountType" class="form-control"/>
					<s:textfield label="Account Name" name="accountName" class="form-control" placeholder="Account Name" />
					<s:textfield label="Father Name" name="fatherName" class="form-control" placeholder="Father Name" />
					<s:textfield label="Mother Name" name="motherName" class="form-control" placeholder="Mother Name" />
					<s:textarea label="Permanent Address" name="permanentAddress" class="form-control" placeholder="Permanent Address"/>
					<s:textarea label="Current Address" name="currentAddress" class="form-control" placeholder="Current Address"/>
					<s:textfield label="Contact Nubmer" name="contactNumber" class="form-control" placeholder="Contact Number"/>
					<s:textfield label="National Id" name="nid" class="form-control" placeholder="National Id"/>
					<s:textfield label="Passport Number" name="passportNumber" class="form-control" placeholder="Passport Number"/>
					<s:textfield label="Occupation" name="occupation" class="form-control" placeholder="Occupation"/>
					<s:textfield label="Yearly Income" name="yearlyIncome" class="form-control" placeholder="Yearly Income"/>
					<s:textfield label="Currency" name="currency" class="form-control" placeholder="Currency"/>
					
					<s:textfield label="Name of Nominee" name="nomineeName" class="form-control" placeholder="Name of Nominee" />
					<s:textfield label="Permanent Add. with Phone number" name="nomineeAddress" class="form-control" placeholder="Permanent Add. with Phone number" />
					<s:textfield label="Profession" name="nomineeProfession" class="form-control" placeholder="Profession" />
					<s:textfield label="Relation with account holder" name="nomineeRelation" class="form-control" placeholder="Relation with account holder" />
					<s:textfield label="NID/Passport No" name="nomineenid_pn" class="form-control" placeholder="NID/Passport No" />
					<s:textfield label="Login Id" name="loginId" class="form-control" placeholder="Login Id"/>
					<s:password label="Password" name="password" class="form-control" placeholder="Password"/>
					
					<s:submit type="button" class="btn btn-primary" value="Continue" />
				</s:form>
				<div class="">
					Already register?  <a href="login">Please Login</a>
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
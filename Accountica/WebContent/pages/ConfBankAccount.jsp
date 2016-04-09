
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>


<div class="row">
	<div class="col-sm-12 col-md-12 col-lg-12">&nbsp;</div>
	<div class="col-sm-12 col-md-12 col-lg-12">
		<div class="col-sm-4 col-md-4 col-lg-2"></div>
		<div class="col-sm-4 col-md-4 col-lg-8">
			<div class="form-horizontal well">
				<s:form action="SaveBankAccount" method="post">
					<p class="f_legend">Please check customer account information</p>
					<s:div>
						<br> Account Type: <s:property
							value="bankaccount.bankAccountType" />
						<br> Account Holder Name: <s:property
							value="bankaccount.accountHolderName" />
						<br> Father Name: <s:property value="bankaccount.fatherName" />
						<br> Mother Name: <s:property value="bankaccount.motherName" />
						<br> Permanent Address: <s:property
							value="bankaccount.permanentAddress" />
						<br> Current Address: <s:property
							value="bankaccount.currentAddress" />
						<br> Contact Number: <s:property
							value="bankaccount.contactNumber" />
						<br> Email:<s:property value="bankaccount.emailAddress" />
						<br> Occupation : <s:property value="bankaccount.occupation" />
						<br>Uploaded Image:<img height="100px" width="100px"
							src="<s:url value="/uploadedImages/%{accountUserImageFileName}"/>" />
						<br> National Id/ Passport Number:<s:property
							value="bankaccount.nid_pn" />
						<br> Currency: <s:property value="bankaccount.currency" />
						<br> Yearly Income:<s:property
							value="bankaccount.yearlyIncome" />

						<br> Name of Nominee:<s:property
							value="bankaccount.nomineeName" />
						<br> Permanent Add. with Phone number:<s:property
							value="bankaccount.nomineeAddress" />
						<br>Profession :<s:property
							value="bankaccount.nomineeProfession" />
						<br>Relation:<s:property value="bankaccount.nomineeRelation" />
						<br>NID/Passport NO:<s:property
							value="bankaccount.nomineenid_pn" />

						<br> Login Id :<s:property value="bankaccount.loginId" />
						<br> Password: <input type="password" disabled="disabled"
							value="%{bankaccount.Password}" />
					</s:div>
					<s:hidden key="bankaccount.bankAccountType" />
					<s:hidden key="bankaccount.accountHolderName" />
					<s:hidden key="bankaccount.fatherName" />
					<s:hidden key="bankaccount.motherName" />
					<s:hidden key="bankaccount.permanentAddress" />
					<s:hidden key="bankaccount.currentAddress" />
					<s:hidden key="bankaccount.contactNumber" />
					<s:hidden key="bankaccount.nid_pn" />
					<s:hidden key="bankaccount.emailAddress" />
					<s:hidden key="bankaccount.occupation" />
					<s:hidden key="bankaccount.yearlyIncome" />
					<s:hidden key="bankaccount.currency" />
					<s:hidden key="bankaccount.loginId" />
					<s:hidden key="bankaccount.password" />
					<s:hidden key="bankaccount.nomineeName" />
					<s:hidden key="bankaccount.nomineeAddress" />
					<s:hidden key="bankaccount.nomineeRelation" />
					<s:hidden key="bankaccount.nomineeProfession" />
					<s:hidden key="bankaccount.nomineenid_pn" />
					<s:hidden key="bankaccount.accountUserImageFileName" />
					<s:submit type="button" class="btn btn-primary" value="Continue" />
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
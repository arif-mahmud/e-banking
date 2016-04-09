<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="panel panel-default"
	style="overflow: scroll; padding-left: 0px;">
	<div class="col-sm-12 col-md-12 col-lg-12">
		<s:form action="SearchAccount" method="get">
			<div class="col-lg-3 col-md-6 col-sm-12">

				Account No: <input type="text" class="form-control" id=""
					value="<s:property value="bankac" />" name="bankac">
			</div>
			<div class="col-lg-3 col-md-6 col-sm-12">
				Account Name: <input type="text" class="form-control" id=""
					value="<s:property value="accname" />" name="accname">
			</div>
			<div class="col-lg-3 col-md-6 col-sm-12">
				Phone: <input type="text" class="form-control" id=""
					value="<s:property value="contact" />" name="contact">
			</div>
			<div class="col-lg-3 col-md-6 col-sm-12">
				<button class="btn btn-primary" value="Search" id="" type="submit">Search</button>
			</div>
		</s:form>
	</div>
	<s:if test="%{Accountlist.size>0}">

		<div class="panel-body">
			<h1>Account List</h1>
		</div>

		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Account Number</th>
					<th>Account Name</th>
					<th>Account Type</th>
					<th>Occupation</th>
					<th>Father Name</th>
					<th>Mother Name</th>
					<th>Permanent Address</th>
					<th>Present Address</th>
					<th>Contact Number</th>
					<th>Email</th>
					<th>Yearly Income</th>
					<th>Currency</th>
					<th>Balance</th>
					<th>Active Status</th>
					<th>Action</th>
				</tr>
			</thead>
			<s:iterator id="account" value="Accountlist">
				<tr>
					<td><s:property value="%{#account.BankAccNumber}" /></td>
					<td><s:property value="%{#account.AccountHolderName}" /></td>
					<td><s:property value="%{#account.BankAccountType}" /></td>
					<td><s:property value="%{#account.Occupation}" /></td>
					<td><s:property value="%{#account.FatherName}" /></td>
					<td><s:property value="%{#account.MotherName}" /></td>
					<td><s:property value="%{#account.PermanentAddress}" /></td>
					<td><s:property value="%{#account.CurrentAddress}" /></td>
					<td><s:property value="%{#account.ContactNumber}" /></td>
					<td><s:property value="%{#account.EmailAddress}" /></td>
					<td><s:property value="%{#account.YearlyIncome}" /></td>
					<td><s:property value="%{#account.Currency}" /></td>
					<td><s:property value="%{#account.balance}" /></td>
					<td><s:property value="%{#account.activeStatus}" /></td>
					<td><s:url id="editurl" namespace="/admin"
							action="ModifyAccount">
							<s:param name="accountId">
								<s:property value="%{#account.BankAccNumber}" />
							</s:param>
						</s:url> <s:a href="%{editurl}">Edit</s:a> <s:url id="deleteUrl"
							namespace="/admin" action="DeleteAccount">
							<s:param name="accountId">
								<s:property value="%{#account.BankAccNumber}" />
							</s:param>
						</s:url> <s:a href="%{deleteUrl}">Delete</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	<s:else>
      <div> No data found</div>
    </s:else>
</div>
<script type="text/javascript">
	$(document).ready(function() {

	});
</script>


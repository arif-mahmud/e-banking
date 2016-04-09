<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="panel panel-default"
	style="overflow: scroll; padding-left: 0px;">	
	<div class="panel-body">
		<h1>Account Summary</h1>
	</div>

	<table class="table table-bordered">
		<thead>
			<tr>
				<th>Account Number</th>
				<th>Account Type</th>
				<th>AvailableBalance</th>
				<th>Ledger Balance</th>
				<th>Currency</th>
				<th>Account Type</th>
			</tr>
		</thead>
		
			<tr>
				<td>
				<s:url id="editurl" namespace="/AccountHolder" action="LedgerAccount">
						<s:param name="bankaccount">
							<s:property value="bankaccount.bankAccNumber"/>
						</s:param>
					</s:url> 
					<s:a href="%{editurl}">
						<s:property value="bankaccount.bankAccNumber"/>
					</s:a>	
					</td>					
				<td><s:property value="bankaccount.bankAccountType"/></td>
				<td><s:property value="bankaccount.balance"/></td>
				<td><s:property value="bankaccount.ledgerAmount"/></td>
				<td><s:property value="bankaccount.currency"/></td>
				<td><s:property value="bankaccount.activeStatus"/></td>
			</tr>
		
	</table>
</div>

<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="panel panel-default"
	style="overflow: scroll; padding-left: 0px;">
	<div class="panel-body">
		<h1>Account Summary</h1>
	</div>

	<table class="table table-bordered">
		<tr>
			<td>Account Number:<s:property value="bankacc.bankAccNumber" />
			</td>
			<td>Currency:<s:property value="bankacc.Currency" /></td>

			<td>Status:<s:property value="bankacc.activeStatus" /></td>
		</tr>
		<tr>
			<td>Available Balance:<s:property value="bankacc.Balance" /></td>

			<td>Ledger Balance:<s:property value="bankacc.ledgerAmount" /></td>
			<td>Total Balance:<s:property value="" /></td>
		</tr>
		<tr>
			<td colspan="3">
				<table class="table table-bordered">
					<thead>
						<tr>
							<th>Date</th>
							<th>Ref/Chcek No</th>
							<th>Description</th>
							<th>Deposit</th>
							<th>Withdraw</th>
						</tr>
					</thead>
					<s:iterator id="ledger" value="ledgerlist">
						<tr>
							<td><s:property value="%{#ledger.ledgerDate}" /></td>
							<td><s:property value="%{#ledger.refInfo}" /></td>
							<td><s:property value="%{#ledger.description}" /></td>
							<td><s:property value="%{#ledger.depositAmount}" /></td>
							<td><s:property value="%{#ledger.withdrawAmount}" /></td>
						</tr>
					</s:iterator>
				</table>
			</td>
		</tr>
	</table>
</div>

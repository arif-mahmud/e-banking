package my.project.ebanking.domains;

import java.math.BigDecimal;
import java.util.Date;

public class AccountTransferHistory {
	private int transferId;
	private Date actionDate;
	private int fromAccount;
	private int toAccount;
	private String transferType;
	private String Reason;
	private BigDecimal amount;
	private String aliasName;
	private String accountHolderName;
	private String mobile;
	private String email;
	public int getTransferId() {
		return transferId;
	}
	public void setTransferId(int transferId) {
		this.transferId = transferId;
	}
	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "AccountTransferHistory [transferId=" + transferId
				+ ", actionDate=" + actionDate + ", fromAccount=" + fromAccount
				+ ", toAccount=" + toAccount + ", transferType=" + transferType
				+ ", Reason=" + Reason + ", amount=" + amount + ", aliasName="
				+ aliasName + ", accountHolderName=" + accountHolderName
				+ ", mobile=" + mobile + ", email=" + email + "]";
	}
	
}

package my.project.ebanking.domains;

import java.math.BigDecimal;
import java.util.Date;

public class LedgerAccount {
	private Integer ledgerId;
	private Integer bankAccNumber;
	private Date ledgerDate;
	private String refInfo;
	private String description;
	private BigDecimal depositAmount;
	private BigDecimal withdrawAmount;
	private BankAccount bankaccount;
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public Integer getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(Integer ledgerId) {
		this.ledgerId = ledgerId;
	}
	public Integer getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	public Date getLedgerDate() {
		return ledgerDate;
	}
	public void setLedgerDate(Date ledgerDate) {
		this.ledgerDate = ledgerDate;
	}
	public String getRefInfo() {
		return refInfo;
	}
	public void setRefInfo(String refInfo) {
		this.refInfo = refInfo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	public BigDecimal getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(BigDecimal withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	@Override
	public String toString() {
		return "LedgerAccount [ledgerId=" + ledgerId + ", bankAccNumber="
				+ bankAccNumber + ", ledgerDate=" + ledgerDate + ", refInfo="
				+ refInfo + ", description=" + description + ", depositAmount="
				+ depositAmount + ", withdrawAmount=" + withdrawAmount + "]";
	}
	
	
}

package my.project.ebanking.domains;

import java.math.BigDecimal;

public class Beneficiary {
	private String aliasName;
	private int bankAccNumber;
	private BigDecimal amount;
	private BankAccount bankaccount;

	
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public int getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(int bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}
	@Override
	public String toString() {
		return "Beneficiary [aliasName=" + aliasName + ", bankAccNumber="
				+ bankAccNumber + ", amount=" + amount + ", bankaccount="
				+ bankaccount + "]";
	}
	
	
}

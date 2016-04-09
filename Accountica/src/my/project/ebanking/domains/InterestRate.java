package my.project.ebanking.domains;

import java.util.List;

public class InterestRate {
	private Integer accountType;
	private Integer annualInterestRate;
	private BankAccount bankAccount;
	private List<BankAccount> banklist;
	public Integer getAccountType() {
		return accountType;
	}
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	public Integer getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(Integer annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public BankAccount getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	public List<BankAccount> getBanklist() {
		return banklist;
	}
	public void setBanklist(List<BankAccount> banklist) {
		this.banklist = banklist;
	}
}

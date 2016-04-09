package my.project.ebanking.domains;

import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;

import my.project.ebanking.util.InsufficientFundsException;

public class BankAccount implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer bankAccNumber;
	private Integer bankAccountType;
	private String accountHolderName;
	private String fatherName;
	private String motherName;
	private String permanentAddress;
	private String currentAddress;
	private String contactNumber;
	private String nid_pn;
	private String emailAddress;
	private String occupation;
	private Integer yearlyIncome;
	private String currency;
	private BigDecimal balance=new BigDecimal(0);
	private String activeStatus;
	private String loginId;
	private String password;
	private BigDecimal ledgerAmount;
	private UserAccount userAccount;
	private String nomineeName;
	private String nomineeAddress;
	private String nomineeProfession;
	private String nomineeRelation;
	private String nomineenid_pn;

	public String getNomineenid_pn() {
		return nomineenid_pn;
	}

	public void setNomineenid_pn(String nomineenid_pn) {
		this.nomineenid_pn = nomineenid_pn;
	}

	public String getNomineeName() {
		return nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineeAddress() {
		return nomineeAddress;
	}

	public void setNomineeAddress(String nomineeAddress) {
		this.nomineeAddress = nomineeAddress;
	}

	

	public String getNomineeProfession() {
		return nomineeProfession;
	}

	public void setNomineeProfession(String nomineeProfession) {
		this.nomineeProfession = nomineeProfession;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private String accountUserImageFileName;

	public String getAccountUserImageFileName() {
		return accountUserImageFileName;
	}

	public void setAccountUserImageFileName(String accountUserImageFileName) {
		this.accountUserImageFileName = accountUserImageFileName;
	}

	public Integer getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(Integer bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public Integer getBankAccountType() {
		return bankAccountType;
	}

	public void setBankAccountType(Integer bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getNid_pn() {
		return nid_pn;
	}

	public void setNid_pn(String nid_pn) {
		this.nid_pn = nid_pn;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Integer getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Integer yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getLedgerAmount() {
		return ledgerAmount;
	}

	public void setLedgerAmount(BigDecimal ledgerAmount) {
		this.ledgerAmount = ledgerAmount;
	}

	public UserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "BankAccount [bankAccNumber=" + bankAccNumber + ", bankAccountType=" + bankAccountType
				+ ", accountHolderName=" + accountHolderName + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", permanentAddress=" + permanentAddress + ", currentAddress=" + currentAddress
				+ ", contactNumber=" + contactNumber + ", nid_pn=" + nid_pn + ", emailAddress=" + emailAddress
				+ ", occupation=" + occupation + ", yearlyIncome=" + yearlyIncome + ", currency=" + currency
				+ ", balance=" + balance + ", activeStatus=" + activeStatus + ", loginId=" + loginId + ", password="
				+ password + ", ledgerAmount=" + ledgerAmount + ",nomineeName=" + nomineeName + ",nomineeAddress="
				+ nomineeAddress + ",nomineeProfession=" + nomineeProfession + ",nomineenomineeRelation="
				+ nomineeRelation + ", userAccount=" + userAccount + ",nomineenid_pn=" + nomineenid_pn + ", accountUserImageFileName="
				+ accountUserImageFileName + "]";
	}
	
	public void creditBalance(BigDecimal balance2) {
		balance = balance.add(balance2);

	}

	public void debitBalance(BigDecimal balance2) {
		balance = balance.subtract(balance2);

	}

}

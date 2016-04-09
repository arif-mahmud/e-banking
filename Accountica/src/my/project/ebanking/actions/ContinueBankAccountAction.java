package my.project.ebanking.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.model.AccountType;
import my.project.ebanking.model.Country;
import my.project.ebanking.model.StatusType;

public class ContinueBankAccountAction extends ActionSupport{
	private BankAccount bankaccount=new BankAccount();
	
	private String bankAccNumber;
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
	private String yearlyIncome;
	private String currency;
	private File accountUserImage;
	private String accountUserImageFileName;
	private String accountUserImageContentType;
	
	private String nomineeName;
	private String  nomineeAddress;
	private String nomineeProfession;
	
	private String  nomineeRelation;
	private String  nomineenid_pn;
	
	
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
	public String getNomineenid_pn() {
		return nomineenid_pn;
	}
	public void setNomineenid_pn(String nomineenid_pn) {
		this.nomineenid_pn = nomineenid_pn;
	}

	private String loginId;
	private String password;

	public File getAccountUserImage() {
		return accountUserImage;
	}
	public void setAccountUserImage(File accountUserImage) {
		this.accountUserImage = accountUserImage;
	}
	public String getAccountUserImageFileName() {
		return accountUserImageFileName;
	}
	public void setAccountUserImageFileName(String accountUserImageFileName) {
		this.accountUserImageFileName = accountUserImageFileName;
	}
	public String getAccountUserImageContentType() {
		return accountUserImageContentType;
	}
	public void setAccountUserImageContentType(String accountUserImageContentType) {
		this.accountUserImageContentType = accountUserImageContentType;
	}
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}
	public String getBankAccNumber() {
		return bankAccNumber;
	}
	public void setBankAccNumber(String bankAccNumber) {
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
	public String getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(String yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
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
	public List<AccountType> getAccountTypes(){
		List<AccountType> accountTypes = new ArrayList<AccountType>();
		accountTypes.add(new AccountType(1, "Savings"));	
		accountTypes.add(new AccountType(2, "Current"));
		accountTypes.add(new AccountType(3, "Super Saver"));
		return accountTypes;
	}
	public List<StatusType> getStatus(){
		List<StatusType> statusTypes = new ArrayList<StatusType>();
		statusTypes.add(new StatusType(1, "Active"));
		statusTypes.add(new StatusType(2, "Inactive"));		
		return statusTypes;
	}

	public List<Country> getCurrencies(){
		List<Country> currencyList = new ArrayList<Country>();
		currencyList.add(new Country("BDT","Bangladeshi Taka"));
		currencyList.add(new Country("USD","USD Dollar"));
		return currencyList;
	}
	
	public String execute() throws Exception{
		ServletContext servletContext = ServletActionContext.getServletContext();
		if (accountUserImage != null) {
			String dataDir = servletContext.getRealPath("/uploadedImages");
			File savedFile = new File(dataDir, accountUserImageFileName);
			accountUserImage.renameTo(savedFile);
		}
		bankaccount.setAccountUserImageFileName(accountUserImageFileName);
		return SUCCESS;
	}
}

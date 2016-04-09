package my.project.ebanking.actions;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.Beneficiary;
import my.project.ebanking.services.BeneficiaryService;

public class CreateBeneficiaryAction extends ActionSupport{
	private String alias;
	private String accountNumber;
	private String accountHolderName;
	private String contactNumber;
	private String emailAddress;
	private String amount;
	
	
	BeneficiaryService service;
	Beneficiary ben;
	
	public String execute() throws Exception{
		service.AddBeneficiary(ben);
		return SUCCESS;
	}
	
	public Beneficiary getBen() {
		return ben;
	}
	public void setBen(Beneficiary ben) {
		this.ben = ben;
	}
	public BeneficiaryService getService() {
		return service;
	}
	public void setService(BeneficiaryService service) {
		this.service = service;
	}
	
	
	
	
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}

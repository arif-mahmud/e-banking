package my.project.ebanking.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.model.AccountType;
import my.project.ebanking.model.Country;
import my.project.ebanking.model.StatusType;
import my.project.ebanking.services.BankAccountService;

public class BankAccountListAction extends ActionSupport{
    BankAccountService service;
    List<BankAccount> accountlist;
	private BankAccount bankaccount ;
	
	private int bankac;
	private String accname;
	private String contact;    
    
	public BankAccountService getService() {
		return service;
	}


	public void setService(BankAccountService service) {
		this.service = service;
	}


	public List<BankAccount> getAccountlist() {
		return accountlist;
	}


	public void setAccountlist(List<BankAccount> accountlist) {
		this.accountlist = accountlist;
	}


	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	
	public int getBankac() {
		return bankac;
	}


	public void setBankac(int bankac) {
		this.bankac = bankac;
	}


	public String getAccname() {
		return accname;
	}


	public void setAccname(String accname) {
		this.accname = accname;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}

	public String searchActiveAccountlistPage() {
		return SUCCESS;
	}
	
	public String getActiveAccountlistlist() throws Exception{
		accountlist = service.getAccountList(bankac,accname,contact);
		
		return SUCCESS;
	}
	
	public String searchInactiveAccountlistPage() {
		return SUCCESS;
	}
	public String getInactiveAccountlist() throws Exception{
		accountlist = service.getInactiveAccountList(accname,contact);
		
		return SUCCESS;
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
}

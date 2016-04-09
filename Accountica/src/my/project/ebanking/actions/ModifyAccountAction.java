package my.project.ebanking.actions;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.UserAccount;
import my.project.ebanking.model.AccountType;
import my.project.ebanking.model.Country;
import my.project.ebanking.model.StatusType;
import my.project.ebanking.services.BankAccountService;

public class ModifyAccountAction extends ActionSupport{
	BankAccountService service;
	BankAccount bankaccount=new BankAccount();
	private int accountId;
	
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	

	public BankAccount getBankaccount() {
		return bankaccount;
	}

	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}

	public BankAccountService getService() {
		return service;
	}

	public void setService(BankAccountService service) {
		this.service = service;
	}
	
	public String modify() throws Exception{
		bankaccount = service.getAccount(accountId);
		UserAccount userAccount = bankaccount.getUserAccount();
		bankaccount.setLoginId(userAccount.getLoginId());
		bankaccount.setPassword(userAccount.getPassword());
		//System.out.println(bankaccount);
		return SUCCESS;
	}
	public String execute() throws Exception{
		int i = 0;
		try{
			System.out.println(bankaccount);
			service.update(bankaccount);
			bankaccount = service.getAccount(bankaccount.getBankAccNumber());
			i=1;
		}catch(Exception e){
			i=0;
		}		
		if(i==1){
			return SUCCESS;
		}else{
			return "failure";
		}
		
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

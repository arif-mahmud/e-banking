package my.project.ebanking.actions;

import java.util.List;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.model.*;

public class BankAccountAction extends ActionSupport{
	public String execute() throws Exception{		
		return SUCCESS;
	}
	
	public List<AccountType> getAccountTypes(){
		List<AccountType> acTypes = new ArrayList<AccountType>();
		AccountType ac;
		ac = new AccountType(1, "Savings");
		acTypes.add(ac);	
		ac = new AccountType(2, "Current");
		acTypes.add(ac);	
		ac = new AccountType(3, "Super Saver");
		acTypes.add(ac);
		return acTypes;
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

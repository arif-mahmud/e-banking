package my.project.ebanking.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import my.project.ebanking.domains.AccountTransferHistory;
import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.Beneficiary;
import my.project.ebanking.model.BeneficiaryList;
import my.project.ebanking.services.BeneficiaryService;


public class BalanceTransfarAction {
	
	private AccountTransferHistory acctrnshis;
	
	BeneficiaryService service;
	List<String> alies;
	public void setBenlist(List<Beneficiary> beneficiaries) {
		List<String> benAlias = new ArrayList<String>();
		for(Beneficiary ben:beneficiaries){
			benAlias.add(ben.getAliasName());
		}
		this.alies = benAlias;
	}
	public String execute() throws Exception{
		List<Beneficiary> beneficiaries = service.getBeneficiaryList();
		this.setBenlist(beneficiaries);
		return "success";
	}
	
	public String continuebalancetransfar() throws Exception{
		List<Beneficiary> beneficiaries = service.getBeneficiaryList();
		this.setBenlist(beneficiaries);
		System.out.println(acctrnshis.getAliasName());
		Beneficiary ben = service.getBeneficiary(acctrnshis.getAliasName());
		BankAccount bankac = ben.getBankaccount();
		acctrnshis.setAccountHolderName(bankac.getAccountHolderName());
		acctrnshis.setMobile(bankac.getContactNumber());
		acctrnshis.setEmail(bankac.getEmailAddress());
		return "success";
	}
	public String BalanceTranfConf() throws Exception{
		System.out.println(acctrnshis.getAliasName());
		Beneficiary ben = service.getBeneficiary(acctrnshis.getAliasName());
		BankAccount bankac = ben.getBankaccount();
		acctrnshis.setAccountHolderName(bankac.getAccountHolderName());
		acctrnshis.setMobile(bankac.getContactNumber());
		acctrnshis.setEmail(bankac.getEmailAddress());
		return "success";
	}
	
	
	public BeneficiaryService getService() {
		return service;
	}	

	public void setService(BeneficiaryService service) {
		this.service = service;
	}
	
	public List<String> getAlies() {
		return alies;
	}
	public void setAlies(List<String> alies) {
		this.alies = alies;
	}
	public AccountTransferHistory getAcctrnshis() {
		return acctrnshis;
	}
	public void setAcctrnshis(AccountTransferHistory acctrnshis) {
		this.acctrnshis = acctrnshis;
	}
		
}

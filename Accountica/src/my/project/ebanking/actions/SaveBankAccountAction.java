package my.project.ebanking.actions;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.UserAccount;
import my.project.ebanking.services.BankAccountService;

public class SaveBankAccountAction extends ActionSupport {
	
	private BankAccountService service;	
	BankAccount bankaccount=new BankAccount();
	


	public BankAccountService getService() {
		return service;
	}


	public void setService(BankAccountService service) {
		this.service = service;
	}


	public BankAccount getBankaccount() {
		return bankaccount;
	}


	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
	}


	public String execute() throws Exception {
		try {
			this.bankaccount.setActiveStatus("2");
			UserAccount userAccount = new UserAccount(bankaccount.getLoginId(),
					bankaccount.getPassword(), "AccountHolder");

			this.bankaccount.setUserAccount(userAccount);
			userAccount.setBankaccnt(this.bankaccount);
			bankaccount.setBalance(new BigDecimal(0));
			System.out.println(this.bankaccount);
			int i = service.save(bankaccount);
			//int i = service.save(bankaccount);

			System.out.println(i);

			return "success";
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}
	}

}

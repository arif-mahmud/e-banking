package my.project.ebanking.actions;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.services.BankAccountService;

public class DeleteAccountAction extends ActionSupport{
	BankAccountService service;
	private int accountId;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public BankAccountService getService() {
		return service;
	}

	public void setService(BankAccountService service) {
		this.service = service;
	}
	
	public String execute() throws Exception{
		service.delete(accountId);
		return SUCCESS;
	}
}

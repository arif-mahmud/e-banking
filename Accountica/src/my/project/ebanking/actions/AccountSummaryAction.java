package my.project.ebanking.actions;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.LedgerAccount;
import my.project.ebanking.domains.UserAccount;
import my.project.ebanking.services.BankAccountService;
import my.project.ebanking.services.LedgerAccountService;

public class AccountSummaryAction extends ActionSupport implements Serializable,SessionAware {
	BankAccountService service;
	private LedgerAccount ledgeraccount;
	private LedgerAccountService ledgerService;
    private BankAccount bankaccount;
    private Map<String, Object> session;   
    
	public BankAccountService getService() {
		return service;
	}
	public void setService(BankAccountService service) {
		this.service = service;
	}
	public BankAccount getBankaccount() {
		return bankaccount;
	}
	
	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}
	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}
	public LedgerAccountService getLedgerService() {
		return ledgerService;
	}
	public void setLedgerService(LedgerAccountService ledgerService) {
		this.ledgerService = ledgerService;
	}
	public String execute() throws Exception{
		int bankacnumber = this.getAuthUserId();
		bankaccount = service.getAccount(bankacnumber);		
		//System.out.println(bankaccount.toString());
		return SUCCESS;		
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	protected int getAuthUserId(){
		session=ActionContext.getContext().getSession();
		UserAccount authuser = (UserAccount) session.get("user");
		return authuser.getBankAccNumber();
	}
	
}

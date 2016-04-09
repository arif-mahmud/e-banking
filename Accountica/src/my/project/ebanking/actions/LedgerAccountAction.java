package my.project.ebanking.actions;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.LedgerAccount;
import my.project.ebanking.services.BankAccountService;
import my.project.ebanking.services.LedgerAccountService;

public class LedgerAccountAction extends ActionSupport implements ModelDriven<LedgerAccount>{
	private LedgerAccountService ledgerService;
	private BankAccountService service;
	private int bankaccount;
	private List<LedgerAccount> ledgerlist;
	private BankAccount bankacc;
		
	public String execute() throws Exception{
		bankacc = service.getAccount(bankaccount);
		this.ledgerlist = ledgerService.getLedgerList(bankaccount);
		return SUCCESS;
	}
	
	public BankAccount getBankacc() {
		return bankacc;
	}
	
	public int getBankaccount() {
		return bankaccount;
	}

	public List<LedgerAccount> getLedgerlist() {
		return ledgerlist;
	}

	public void setBankaccount(int bankaccount) {
		this.bankaccount = bankaccount;
	}



	public BankAccountService getService() {
		return service;
	}

	public void setService(BankAccountService service) {
		this.service = service;
	}

	public LedgerAccountService getLedgerService() {
		return ledgerService;
	}

	public void setLedgerService(LedgerAccountService ledgerService) {
		this.ledgerService = ledgerService;
	}

	@Override
	public LedgerAccount getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}

package my.project.ebanking.actions;

import java.math.BigDecimal;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import my.project.ebanking.domains.LedgerAccount;
import my.project.ebanking.services.LedgerAccountService;
import my.project.ebanking.util.InvalidAccountException;

public class DepositAccountConfirmAction extends ActionSupport{
	private LedgerAccount ledgeraccount;
	private LedgerAccountService ledgerService;
	

	public DepositAccountConfirmAction() {
		super();
	}
		
	public void setLedgerService(LedgerAccountService ledgerService) {
		this.ledgerService = ledgerService;
	}	

	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}

	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}

	public String execute() throws Exception{
		String msg ="";
		
		try{			
			ledgerService.deposit(ledgeraccount, ledgeraccount.getDepositAmount());
			return "success";
		}
		catch (InvalidAccountException e) {
			msg = e.getIdentity().toString();
			return "failure";
		}
//		catch (InsufficientFundsException e) {
//			msg = e.getRequired().toString();
//			return "failure";
//		}
		catch(Exception e){
			msg ="DB Insert error";
			System.out.println("Exception");
			e.printStackTrace();
			return "failure";
		}
	}
}

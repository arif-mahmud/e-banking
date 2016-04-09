package my.project.ebanking.actions;

import java.math.BigDecimal;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import my.project.ebanking.domains.LedgerAccount;

public class DepositAccountAction extends ActionSupport implements ModelDriven<LedgerAccount>{
	private LedgerAccount ledgeraccount = new LedgerAccount();
	public DepositAccountAction() {
		super();
	}	
	
	@Override
	public LedgerAccount getModel() {		
		return ledgeraccount;
	}
	
	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}
	
	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}

	public String execute() throws Exception{
		return "success";
	}	
}

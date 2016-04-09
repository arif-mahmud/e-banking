package my.project.ebanking.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import my.project.ebanking.domains.LedgerAccount;

public class WithdrawAccountAction extends ActionSupport implements ModelDriven<LedgerAccount>{
	private LedgerAccount ledgeraccount = new LedgerAccount();
	public WithdrawAccountAction() {
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

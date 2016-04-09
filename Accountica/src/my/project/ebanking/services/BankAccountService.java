package my.project.ebanking.services;

import java.math.BigDecimal;
import java.util.List;

import my.project.ebanking.dao.BankAccountDao;
import my.project.ebanking.dao.LedgerAccountDao;
import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.LedgerAccount;

public class BankAccountService {
	BankAccountDao dao;
	LedgerAccountDao ledgerDao;		

	public BankAccountDao getDao() {
		return dao;
	}

	public void setDao(BankAccountDao dao) {
		this.dao = dao;
	}
	
	public LedgerAccountDao getLedgerDao() {
		return ledgerDao;
	}

	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}

	public int save(BankAccount bankAc){
		return dao.save(bankAc);
	}
	public List<BankAccount> getAccountList(int bankac,String accname,String contact){
		return dao.getAccountList(bankac,accname,contact);
	}
	public List<BankAccount> getInactiveAccountList(String accname,String contact){
		return dao.getInactiveAccountList(accname,contact);
	}
	public BankAccount getAccount(int bankacnumber){
		BankAccount bankacc = dao.getAccount(bankacnumber);
		BigDecimal ledgeramnt = ledgerDao.getAccountLedger(bankacc.getBankAccNumber());
		
		bankacc.setLedgerAmount(ledgeramnt);
		
		return bankacc;
	}
	public int update(BankAccount bankaccount){
		return dao.update(bankaccount);
	}
	
	public int delete(Integer accountId){
		return dao.delete(accountId); 
	}
}

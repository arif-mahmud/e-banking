package my.project.ebanking.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import my.project.ebanking.dao.BankAccountDao;
import my.project.ebanking.dao.LedgerAccountDao;
import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.LedgerAccount;
import my.project.ebanking.domains.UserAccount;
import my.project.ebanking.util.InvalidAccountException;

public class LedgerAccountService implements LedgerAccountDao {
	LedgerAccountDao ledgerDao;	
	BankAccountDao accountDao;

	LedgerAccount ledgeracc;
	
	
	
	public LedgerAccount getLedgeracc() {
		return ledgeracc;
	}

	public void setLedgeracc(LedgerAccount ledgeracc) {
		this.ledgeracc = ledgeracc;
	}


	public LedgerAccountDao getLedgerDao() {
		return ledgerDao;
	}

	public void setLedgerDao(LedgerAccountDao ledgerDao) {
		this.ledgerDao = ledgerDao;
	}

	public BankAccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(BankAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public Integer insert(LedgerAccount ledgeracc) {
		return ledgerDao.insert(ledgeracc);
	}

	public void deposit(LedgerAccount ledgeraccount, BigDecimal balance) {
		BankAccount bankaccount = accountDao.getAccount(ledgeraccount.getBankAccNumber());
		if(bankaccount==null){
			throw new InvalidAccountException(ledgeraccount.getBankAccNumber());			
		}
		bankaccount.creditBalance(balance);
		accountDao.update(bankaccount);	
		ledgeraccount.setLedgerDate(new Date());
		this.ledgerDao.insert(ledgeraccount);
		System.out.println("Your Deposit has been completed.");
		
	}
	
	public void withdraw(LedgerAccount ledgeraccount, BigDecimal balance) {
		BankAccount bankaccount = accountDao.getAccount(ledgeraccount.getBankAccNumber());
		if(bankaccount==null){
			throw new InvalidAccountException(ledgeraccount.getBankAccNumber());			
		}
		bankaccount.debitBalance(balance);
		accountDao.update(bankaccount);	
		ledgeraccount.setLedgerDate(new Date());
		this.ledgerDao.insert(ledgeraccount);
		System.out.println("Your withdraw has been completed.");
		
	}
	public BigDecimal getAccountLedger(int bankaccount){
		return null;
		//return ledgerDao.getAccountLedger(bankaccount);
		
	}

	@Override
	public List<LedgerAccount> getLedgerList(int bankaccount) {
		return ledgerDao.getLedgerList(bankaccount);
	}
}

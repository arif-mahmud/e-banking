package my.project.ebanking.dao;

import java.util.List;

import my.project.ebanking.domains.BankAccount;

public interface BankAccountDao {
	public Integer save(BankAccount bankaccount);
	public List<BankAccount> getAccountList(int bankac,String accname,String contact);
	public List<BankAccount> getInactiveAccountList(String accname,String contact);
	public BankAccount getAccount(Integer bankacnumber);
	public int update(BankAccount bankaccount);
	public int delete(Integer accountId);
	//public int depositAmount()
}

package my.project.ebanking.dao;

import java.math.BigDecimal;
import java.util.List;

import my.project.ebanking.domains.LedgerAccount;

public interface LedgerAccountDao {
	public Integer insert(LedgerAccount ledgeracc);
	public BigDecimal getAccountLedger(int bankaccount);
	public List<LedgerAccount> getLedgerList(int bankaccount);
}

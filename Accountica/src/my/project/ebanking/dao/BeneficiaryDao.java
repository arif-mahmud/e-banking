package my.project.ebanking.dao;

import java.util.List;

import my.project.ebanking.domains.AccountTransferHistory;
import my.project.ebanking.domains.Beneficiary;

public interface BeneficiaryDao {
	public Integer AddBeneficiary(Beneficiary ben);
	public List<Beneficiary> getBeneficiaryList();
	public Beneficiary getBeneficiary(String alias);
	public int saveAcTransfarHistory(AccountTransferHistory acchistory);
}

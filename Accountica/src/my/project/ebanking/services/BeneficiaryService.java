package my.project.ebanking.services;

import java.util.List;

import my.project.ebanking.dao.BeneficiaryDao;
import my.project.ebanking.domains.AccountTransferHistory;
import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.Beneficiary;

public class BeneficiaryService implements BeneficiaryDao{
	BeneficiaryDao dao;
	
	public BeneficiaryDao getDao() {
		return dao;
	}

	public void setDao(BeneficiaryDao dao) {
		this.dao = dao;
	}

	@Override
	public Integer AddBeneficiary(Beneficiary ben) {
		dao.AddBeneficiary(ben);
		return 0;
	}

	@Override
	public List<Beneficiary> getBeneficiaryList() {
		return dao.getBeneficiaryList();
	}
	public Beneficiary getBeneficiary(String alias){
		return dao.getBeneficiary(alias);
	}
	public int saveAcTransfarHistory(AccountTransferHistory acchistory){
		return dao.saveAcTransfarHistory(acchistory);
	}
	
}

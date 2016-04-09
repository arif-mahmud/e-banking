package my.project.ebanking.services;

import my.project.ebanking.dao.UserAccountDao;
import my.project.ebanking.domains.UserAccount;

public class UserAccountService {
	UserAccountDao dao;

	public UserAccountDao getDao() {
		return dao;
	}

	public void setDao(UserAccountDao dao) {
		this.dao = dao;
	}
	
	
}

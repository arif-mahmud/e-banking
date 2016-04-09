package my.project.ebanking.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import my.project.ebanking.domains.AccountTransferHistory;
import my.project.ebanking.domains.Beneficiary;

public class BeneficiaryHibernateDao implements BeneficiaryDao{
	SessionFactory sessionFactory;
	
	
	public BeneficiaryHibernateDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}


	@Override
	public Integer AddBeneficiary(Beneficiary ben) {
		Transaction transaction = null;
		Integer i= null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			System.out.println(ben.toString());
			i = (Integer) session.save(ben);
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return i;
	}


	@Override
	public List<Beneficiary> getBeneficiaryList() {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			return session.createQuery("from Beneficiary").list();
		} finally {
			transaction.commit();
			session.close();
		}		
	}


	@Override
	public Beneficiary getBeneficiary(String alias) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		Beneficiary beneficiary = null;
		try {
			List<Beneficiary> benList = session.createQuery("from Beneficiary").list();
			for(Beneficiary ben:benList){
				if(alias.equalsIgnoreCase(ben.getAliasName())){
					beneficiary = ben;
					break;
				}
			}
			
		} finally {
			transaction.commit();
			session.close();
		}
		return beneficiary;
	}


	@Override
	public int saveAcTransfarHistory(AccountTransferHistory acchistory) {
		Transaction transaction = null;
		int i = 0;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			i =  (Integer) session.save(acchistory);
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return i;
	}

}

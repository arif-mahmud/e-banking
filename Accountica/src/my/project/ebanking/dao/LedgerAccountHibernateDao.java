package my.project.ebanking.dao;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import my.project.ebanking.domains.LedgerAccount;

public class LedgerAccountHibernateDao implements LedgerAccountDao {
	SessionFactory sessionFactory;
	LedgerAccount ledgeraccount;
	
	public LedgerAccountHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public LedgerAccount getLedgeraccount() {
		return ledgeraccount;
	}

	public void setLedgeraccount(LedgerAccount ledgeraccount) {
		this.ledgeraccount = ledgeraccount;
	}

	@Override
	public Integer insert(LedgerAccount ledgeracc) {
		Transaction transaction = null;
		Integer i = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			i = (Integer)session.save(ledgeracc);
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
	public BigDecimal getAccountLedger(int bankaccount) {
		BigDecimal ledgerAmount = null;
		LedgerAccount ledgerac = new LedgerAccount();
		Transaction transaction = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{	
			 String SQL_QUERY = "SELECT nvl(sum(depositAmount),0),nvl(sum(withdrawAmount),0) FROM LedgerAccount where bankAccNumber="+bankaccount;  
			 Query query =  session.createQuery(SQL_QUERY);  
			 List<Object[]> qryResult = query.list();
			 BigDecimal deposit = null,withdraw=null;
			 for (Object[] aRow : qryResult) {
				  deposit = (BigDecimal) aRow[0];
				  withdraw = (BigDecimal) aRow[1];
				}			 
			 ledgerAmount = deposit.subtract(withdraw); 			 
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return ledgerAmount;
	}

	@Override
	public List<LedgerAccount> getLedgerList(int bankaccount) {
		List<LedgerAccount> ledgerlist = null;
		Transaction transaction = null;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{	
			 String SQL_QUERY = "FROM LedgerAccount where bankAccNumber="+bankaccount;  
			 ledgerlist =  session.createQuery(SQL_QUERY).list();
			transaction.commit();
		}catch(HibernateException e){
			if(transaction!=null)
				transaction.rollback();						
			e.printStackTrace();
		}finally{
			session.close();
		}
		return ledgerlist;
	}

}

package my.project.ebanking.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import my.project.ebanking.domains.BankAccount;
import my.project.ebanking.domains.UserAccount;

public class BankAccountHibernateDao implements BankAccountDao {
	SessionFactory sessionFactory;
	
	
	
	public BankAccountHibernateDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	@Override
	public Integer save(BankAccount bankaccnt) {
		
		Transaction transaction = null;
		Integer i = 0;
		Session session =null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{					
			session.saveOrUpdate(bankaccnt);
			session.saveOrUpdate(bankaccnt.getUserAccount());
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
	public List<BankAccount> getAccountList(int bankac,String accname,String contact){
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			Criteria cr = session.createCriteria(BankAccount.class);
			System.out.println(bankac+" "+accname+" "+contact);
			
			cr.add(Restrictions.eq("activeStatus","1"));
			
			if (bankac>0){
				cr.add(Restrictions.eq("bankAccNumber",bankac));
			}
			
			if (accname != null && (!accname.isEmpty())){
				cr.add(Restrictions.like("accountHolderName", "%"+ accname + "%"));
			}
			if (contact != null && (!contact.isEmpty())){
				cr.add(Restrictions.like("contactNumber", "%"+ contact + "%"));
			}
			System.out.println(cr);
			List results = cr.list();
			
			return results;
		} finally {
			transaction.commit();
			session.close();
		}
	}
	
	@Override
	public List<BankAccount> getInactiveAccountList(String accname,String contact){
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try {
			Criteria cr = session.createCriteria(BankAccount.class);
			cr.add(Restrictions.eq("activeStatus","2"));
			if (accname != null && (!accname.isEmpty())){
				cr.add(Restrictions.like("accountHolderName", "%"+ accname + "%"));
			}
			if (contact != null && (!contact.isEmpty())){
				cr.add(Restrictions.like("contactNumber", "%"+ contact + "%"));
			}

			System.out.println(cr);
			List results = cr.list();
			System.out.println(results);
			
			return results;
		} catch (Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			transaction.commit();
			session.close();
		}
		return null;
	}
	
	@Override
	public BankAccount getAccount(Integer bankacnumber) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{
			return (BankAccount) session.get(BankAccount.class,bankacnumber);
		}
		finally{
			transaction.commit();
			session.close();
		}
	}



	@Override
	public int update(BankAccount bankaccount) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		try{
			System.out.println(bankaccount.toString());
			session.saveOrUpdate(bankaccount);
			transaction.commit();
		}catch (Exception e) {
			transaction.rollback();
		}
		finally{
			session.close();
		}
		return 0;
	}



	@Override
	public int delete(Integer accountId) {
		Transaction transaction = null;
		Session session = null;
		session = this.sessionFactory.openSession();
		transaction = session.beginTransaction();
		BankAccount bankaccount;
		UserAccount useraccount;
		try{
			bankaccount = (BankAccount) session.get(BankAccount.class,accountId);
			session.delete(bankaccount);
			transaction.commit();
		}
		catch (Exception e){
			e.printStackTrace();
			transaction.rollback();
		}
		finally{
			
		}
		return 0;
	}

}

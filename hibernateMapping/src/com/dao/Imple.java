package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.Student;

public class Imple implements inter {
	public Student getById(int Sid)
	{
		Transaction trns=null;
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		Student res=null;
		try{
			trns=session.beginTransaction();
			Query query=session.createQuery("from Student where sid=:sid");
			query.setInteger("sid", Sid);
			res=(Student)query.uniqueResult();
			session.getTransaction().commit();
			
		}
		catch(RuntimeException e)
		{
			if(trns!=null)
			{
				trns.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		return res;
	}

}

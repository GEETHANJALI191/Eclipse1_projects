package com.daniel.dao;
	import java.util.ArrayList;
	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.Transaction;

	import com.daniel.model.Application;
	import com.daniel.util.HibernateUtil;

	public class UserDao {

	    public void addUser(Application user) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.save(user);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	    }

	    public void deleteUser(int userid) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            Application user = (Application) session.load(Application.class, new Integer(userid));
	            session.delete(user);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	    }

	    public void updateUser(Application user) {
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.update(user);
	            session.getTransaction().commit();
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	    }

	    public List<Application> getAllUsers() {
	        List<Application> users = new ArrayList<Application>();
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            users = session.createQuery("from User").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return users;
	    }

	    public Application getUserById(int id) {
	    	Application user = null;
	        Transaction trns = null;
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            String queryString = "from User where id = :id";
	            Query query = session.createQuery(queryString);
	            query.setInteger("id", id);
	            user = (Application) query.uniqueResult();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return user;
	    }
	
}

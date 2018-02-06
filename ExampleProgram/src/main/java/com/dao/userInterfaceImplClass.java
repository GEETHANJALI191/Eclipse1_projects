package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.UserPojo;
import com.util.UtilClass;

public class userInterfaceImplClass implements userInterface{
	 public String addUser(UserPojo user) {
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            session.save(user);
	            session.getTransaction().commit();
	            return "true";
	        } catch (RuntimeException e) {
	            if (trns != null) {
	                trns.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return "false";
	    }

	    public void deleteUser(int userid) {
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            UserPojo user = (UserPojo) session.load(UserPojo.class, new Integer(userid));
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

	    public void updateUser(UserPojo user) {
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
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

	    public List<UserPojo> getAllUsers() {
	        List<UserPojo> users = new ArrayList<UserPojo>();
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            users = session.createQuery("from usertable").list();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return users;
	    }

	    public UserPojo getUserById(int id) {
	    	UserPojo user = null;
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            String queryString = "from usertable where id = :id";
	            Query query = session.createQuery(queryString);
	            query.setInteger("id", id);
	            user = (UserPojo) query.uniqueResult();
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return user;
	    }
	    public UserPojo RetrieveDetails(int id){
	    	UserPojo user = null;
	        Transaction trns = null;
	        Session session = UtilClass.getSessionFactory().openSession();
	        try {
	            trns = session.beginTransaction();
	            UserPojo u=(UserPojo)session.get(UserPojo.class, id);
	            System.out.println("user name read from db is="+u.getFirstname());
	            return u;
	        } catch (RuntimeException e) {
	            e.printStackTrace();
	        } finally {
	            session.flush();
	            session.close();
	        }
	        return null;
	        
	    }
	   

	    }



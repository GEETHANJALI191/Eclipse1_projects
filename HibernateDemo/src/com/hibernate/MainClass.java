package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) 
	{

		new MainClass().insertionInfo();

	}
	public void insertionInfo()
	{
				
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");                                              //.configure().addAnnotatedClass(CampusMinds.class);
		//ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		DataProvider cm=new DataProvider();
		cm.setId(12);
		cm.setName("geetha");                        //these values are in java program need to store in database
		cm.setMailid("geethu1895@gmail.com");
		Transaction tx=session.beginTransaction();
		session.save(cm);
		System.out.println("hiiii");
		tx.commit(); 
		session.close();
		sf.close();//save method will directly store object[id,name,mailid] in to DB						
		//session is the interface belong to hibernate frame
	}
	public void getInfo(){
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");                                              //.configure().addAnnotatedClass(CampusMinds.class);
		//ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();

		Object ob=session.load(DataProvider.class, new Integer(122));
		DataProvider cm=(DataProvider)ob;
		System.out.println("id is"+cm.getId());
		System.out.println("name is"+cm.getName());
		System.out.println("mailid is"+cm.getMailid());
	}
}

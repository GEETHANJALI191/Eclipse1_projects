package com.orchard.program;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("/com/orchard/program/hibernate.cfg.xml").buildSessionFactory();
		try
		{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			CampusMinds cm=new CampusMinds();
			TeamLead tm=new TeamLead();
			tm.setMid(43);
			tm.setLeadName("jay");
			tm.setTrack("java");
			session.save(tm);
			
			cm.setMid(33);
			cm.setMindname("jeevi");
			cm.setTrack("java");
			cm.setTl(tm);
			session.save(cm);
			tx.commit();
			session.close();
			sf.close();
		}catch(HibernateException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
}

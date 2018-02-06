package com.orchard.program;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertOper {
	public static boolean InsertCampusMind(){
		SessionFactory sf=new Configuration().configure("/com/orchard/program/hibernate.cfg.xml").buildSessionFactory();
		try{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			CampusMinds cm=new CampusMinds();
			cm.setMid(31);
			cm.setMindname("geethanjali");
			cm.setTrack("EAI");
			session.save(cm);
			tx.commit();
			session.close();
			sf.close();
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return false;
	}
	public static boolean InsertTeamLead(){
		SessionFactory sf=new Configuration().configure("/com/orchard/program/hibernate.cfg.xml").buildSessionFactory();
		try{
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			TeamLead tm=new TeamLead();
			tm.setMid(21);
			tm.setLeadName("monika");
			tm.setTrack("EAI");
			session.save(tm);
			tx.commit();
			session.close();
			sf.close();
			return true;
		}catch(HibernateException e){
			e.printStackTrace();
		}
		return false;
	}
}

package com.result;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dao.Imple;
import com.dao.inter;
import com.pojo.Adharcard;
import com.pojo.Phone;
import com.pojo.Student;

public class result {
	public static void main(String[] args){
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Transaction trns= null;
		Session session=sf.openSession();
		try{
			trns=session.beginTransaction();
			Student s=new Student();
			s.setSid(101);
			s.setSname("geethanjali");
			 Adharcard a=new Adharcard();
			 a.setAdharno(2536567);
			 session.save(a);
			Phone p= new Phone(123457,s);
			Phone p1=new Phone(234567,s);
			s.getPhones().add(p);
			s.getPhones().add(p1);
			session.save(s);
			session.save(p);
			session.save(p1);
			trns.commit();
	}
		catch(HibernateException e){
			e.printStackTrace();
		}
		
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("enter the sid");
			int sid=s.nextInt();
			Imple i1=new Imple();
			Student res=i1.getById(sid);
			System.out.println(res);
			}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		
	}

}

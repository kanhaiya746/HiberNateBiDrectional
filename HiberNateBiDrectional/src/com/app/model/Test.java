package com.app.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("com/app/config/hibernate.cfg.xml");
		SessionFactory se=cfg.buildSessionFactory();
		Session ses=se.openSession();
		Transaction tx=ses.beginTransaction();
		Course c=new Course();
		c.setCorId(12);	
		Student s=new Student();
		s.setStuId(23);
		s.setStuName("kanhaiya");
		s.setStuBranch("mca");
		s.getCor().add(c);
		ses.save(s);
		tx.commit();
		try
		{
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

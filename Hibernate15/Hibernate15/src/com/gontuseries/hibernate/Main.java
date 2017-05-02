package com.gontuseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudent_name("Gontu1");
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		student.setStudent_name("Gontu1 modified before save function");

		student = (Student) session.get(Student.class, 1);
		
		student.setStudent_name("Gontu1 modified after save function");

		session.getTransaction().commit();
		session.close();
		
		student.setStudent_name("Gontu1 modified post session.close");
		
	}
}

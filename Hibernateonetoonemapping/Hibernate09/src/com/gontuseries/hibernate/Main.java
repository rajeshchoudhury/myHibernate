package com.gontuseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setStudent_name("Gontu1");

		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setStudent_mobile_number("99XX1XXX77");
		studentDetail.setStudent(student);
		
		student.setStudentDetail(studentDetail);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//please note I am not saving studentDetail object but still it will be saved in database
		//that's the magic of one to one mapping 
		session.save(student);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

	
}

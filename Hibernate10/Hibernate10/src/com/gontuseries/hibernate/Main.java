package com.gontuseries.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {


		StudentAddress studentAddress = new StudentAddress();
		studentAddress.setAddress_detail("Hyderabad, India");

		Student student1 = new Student();
		student1.setStudent_name("Gontu1");
		student1.setStudentAddress(studentAddress);

		Student student2 = new Student();
		student2.setStudent_name("Gontu2");
		student2.setStudentAddress(studentAddress);

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		//please note I am not saving studentAddress object but still it will be saved in database
		//that's the magic of Many to one mapping 
		session.save(student1);
		session.save(student2);

		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}

}

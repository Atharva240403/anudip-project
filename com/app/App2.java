package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sms.HibernateUtil;
import com.sms.Supplier;

//public class App2 {

	/*public static void main(String[] args) {

		// Obtain a Hibernate SessionFactory
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Create a new Student
		
		Supplier supplier = new Supplier("C112",  "Ramesh","P123","9987577765", "C111");
		
		// Open a new session
		Session session = factory.openSession();
		// Begin a transaction
		Transaction transaction = session.beginTransaction();
		// Save the student to the database
		session.save(supplier);

		// Commit the transaction
		transaction.commit();
		// Close the Session
		session.close();
		factory.close();

	}

	}*/



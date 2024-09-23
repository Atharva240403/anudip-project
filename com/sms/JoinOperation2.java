package com.sms;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class JoinOperation2 {

	public static void main(String[] args) {
		// Obtain a Hibernate SessionFactory
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Create a new Supplier

		Supplier supplier = new Supplier("C114", "Ramesh", "W111", "9987577765","E342");
		// Create Product
		Product product = new Product("1", "tupperware","Bottle",  456);

		List<Product> products = new ArrayList<Product>();
		products.add(product);
		supplier.setProducts(products);
       
		 // Open a new session
        Session session = factory.openSession();
      
        session.save(supplier);
        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        // Save the customer to the database (which will also cascade save the orders if properly configured)
        // Save the enrollement to the database

        // Commit the transaction
        transaction.commit();
        // Close the Session
        session.close();
        // Close the Session Factory
        factory.close();

	}
}
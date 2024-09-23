package com.sms;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class JoinOperation {

	public static void main(String[] args) {
		// Obtain a Hibernate SessionFactory
		SessionFactory factory = HibernateUtil.getSessionFactory();
		// Create a new Supplier


		 // Create a new Customer
		        Customer customer = new Customer(  "sai", "pawar", "sai@gmail.com", 9987577762L,"sion");

		        // Create CustomerOrder
		        LocalDate localDate = LocalDate.of(1988, 1, 13);
		        LocalDate sqlDate = LocalDate.of(2002,01,02);
		        CustomerOrder customerOrder = new CustomerOrder("C112","E114", sqlDate);
		        
		        
		         List<CustomerOrder> orders = new ArrayList<CustomerOrder>();
		        orders.add(customerOrder);
		        customer.setCustomerOrders(orders);
       
		 // Open a new session
        Session session = factory.openSession();
      
        session.save(customer);
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

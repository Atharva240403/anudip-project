package services;

import java.util.List;

import com.sms.Customer;


public interface Customerservices {
	// Create a new customer order
	Customer createCustomer(Customer customer);

	// Retrieve all customers
	List<Customer> getAllCustomers();

	// Create a new customer order


	// Retrieve a customer by ID
	Customer getCustomerById(int customerId);

	// Retrieve order details by order ID
	//List<CustomerOrder> getCustomerOrderDetailsByorderId(String orderId);

	// Update an existing customer
	Customer updateCustomer(int customerId, Customer updatedCustomer);

	// Delete a customer by ID
	String deleteCustomer(int customerId);

	//List<CustomerOrder> getCustomerOrderDetailsByOrderId(String orderId);

	Customer getCustomer(int customerId);
}

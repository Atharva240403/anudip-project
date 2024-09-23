package SalesDao;
import java.util.List;

import com.sms.*;

public interface CustomerDao {
	Customer createCustomer(Customer customer);
    Customer getCustomer(int Customerid);
    //List<Customer>getCustomer();
    Customer updateCustomer(int Customerid, Customer updatedCustomer);
	String deleteCustomer(int customerid);
    List<Customer> getAllCustomers();
	Customer getCustomerById(int customerId);
	
}

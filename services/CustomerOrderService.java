package services;

import java.util.List;

import com.sms.Customer;
import com.sms.CustomerOrder;


public interface CustomerOrderService {
	CustomerOrder createCustomerOrder(CustomerOrder customerrder);
	
	CustomerOrder getCustomerOrder(String customerorderId);
	
	CustomerOrder getCustomerOrderById(String customerorderId);
	
	CustomerOrder updateCustomerOrder(String customerorderId, CustomerOrder updatedCustomerorderId);
    
	String deleteCustomerOrder(String customerorderId);

	List<CustomerOrder> getAllCustomerOrders();

}

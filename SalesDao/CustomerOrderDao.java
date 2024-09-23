package SalesDao;

import java.util.List;

import com.sms.CustomerOrder;

public interface CustomerOrderDao {
	CustomerOrder createCustomerOrder(CustomerOrder customerorder);

	// CustomerOrder getCustomer(CustomerOrder Orderid);
	// List<Customer>getCustomer();
	CustomerOrder updateCustomerOrder(String customerorderId, CustomerOrder CustomerOrder);

	String deleteCustomerOrder(String customerorderId);

	List<CustomerOrder> getAllCustomerOrders();

	CustomerOrder getCustomerOrderById(String CustomerOrder);

	CustomerOrder getCustomerOrder(String orderId);
}

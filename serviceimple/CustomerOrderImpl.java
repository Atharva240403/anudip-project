package serviceimple;
import java.util.List;

import com.sms.Customer;
import com.sms.CustomerOrder;

import Daoimpl.CustomerOrderDaoImpl;
import SalesDao.CustomerOrderDao;

import services.*;

import services.CustomerOrderService;

public class CustomerOrderImpl implements CustomerOrderService {

	private  CustomerOrderDao customerOrderDao = new CustomerOrderDaoImpl();

	@Override
	public CustomerOrder createCustomerOrder(CustomerOrder customerOrder) {
		return customerOrderDao.createCustomerOrder(customerOrder);
	}

	@Override
	public List<CustomerOrder> getAllCustomerOrders() {
		// TODO Auto-generated method stub
		return customerOrderDao.getAllCustomerOrders();
	}

	@Override
	public CustomerOrder getCustomerOrderById(String customerorderId) {
		// TODO Auto-generated method stub
		return customerOrderDao.getCustomerOrder(customerorderId);

	}

	@Override
	public CustomerOrder updateCustomerOrder(String customerorderId, CustomerOrder updatedCustomerorderId) {
		// TODO Auto-generated method stub
		return customerOrderDao.updateCustomerOrder(customerorderId,updatedCustomerorderId);

	}

	@Override
	public String deleteCustomerOrder(String customerorderId) {
		// TODO Auto-generated method stub
		return customerOrderDao.deleteCustomerOrder(customerorderId);
	}

	@Override
	public CustomerOrder getCustomerOrder(String customerorderId) {
		// TODO Auto-generated method stub
		return null;
	}
}
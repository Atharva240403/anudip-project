package serviceimple;

import java.util.List;

import com.sms.Customer;
//import com.sms.CustomerOrder;
//import com.sms.CustomerOrder;
//import com.sms.CustomerOrder;

import Daoimpl.CustomerDaoImpl;
import SalesDao.CustomerDao;
import services.Customerservices;

public class Customerservicesimpl implements Customerservices {

	CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public Customer createCustomer(Customer customer) {
		// invoke daoimple method to save customer object
		return customerDao.createCustomer(customer);
	}

	@Override
	public Customer getCustomer(int customerid) {
		return customerDao.getCustomer(customerid);
	}

	@Override
	public Customer updateCustomer(int customerid, Customer updatedCustomer) {
		return customerDao.updateCustomer(customerid, updatedCustomer);
	}

	@Override
	public String deleteCustomer(int customerid) {
		return customerDao.deleteCustomer(customerid);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao. getCustomerById(customerId);
	}

}
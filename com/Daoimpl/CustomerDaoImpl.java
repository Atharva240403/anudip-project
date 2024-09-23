package Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sms.Customer;
import com.sms.HibernateUtil;

import SalesDao.CustomerDao;

public class CustomerDaoImpl implements CustomerDao {

		 Scanner sc=new Scanner(System.in);
		@Override
		public Customer createCustomer(Customer customer){
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(customer);
				session.getTransaction().commit();
				return customer;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return null ;
		}
		@Override
		public List<Customer> getAllCustomers() {
			try(Session session=HibernateUtil.getSession()) {
				
				//execute HQL query to retrieve all students data
				Query<Customer> query=session.createQuery("FROM Customer");
				List<Customer> customerList=query.list();
				return customerList;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			
			return null;
		}
		
		@Override
		public Customer getCustomer(int customerId) {
			
				try(Session session=HibernateUtil.getSession()) {
						
					Customer customer=session.get(Customer.class, customerId);
						return customer;
					}
					catch (HibernateException e) {
						System.out.println(e);
					}
					catch (Exception e) {
						System.out.println(e);
					}
					
					return null;
				}

		@Override
		public Customer updateCustomer(int Customerid,Customer updatedCustomer) {
			try(Session session=HibernateUtil.getSession()) {
				Customer customer=session.get(Customer.class, Customerid);
					session.beginTransaction();
					
					customer.setCustomerid(Customerid);
					customer.setCustomerfname(updatedCustomer.getCustomerfname()); 
					customer.setCustomerLname(updatedCustomer.getCustomerLname());
					customer.setemail(updatedCustomer. getemail());
					customer.setphonenumber(updatedCustomer.getphonenumber());
					customer.setCustomerAddress(updatedCustomer.getCustomerAddress());
					session.saveOrUpdate(customer);
					session.getTransaction().commit();
					return customer;
				
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return null;
		}

		@Override
		public String deleteCustomer(int customerid) {
			String message=null;
			try(Session session=HibernateUtil.getSession()) {
				Customer customer=session.get(Customer.class, customerid);
					session.beginTransaction();
					System.out.println("Are you sure  you want to delete?");
					String status=sc.next();
					if(status.equalsIgnoreCase("yes"))
					{
						session.delete(customer);//data will be deleted from DB
						session.getTransaction().commit();
						session.evict(customer);//data will remove from session Cache
						message="Object is deleted";
						
					}else
					{
						message="User wants to retain this object!!";
					}
					
			}
			catch (HibernateException e) {
				System.out.println(e);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return message;
		}
		@Override
		public Customer getCustomerById(int customerId) {
			// TODO Auto-generated method stub
			return null;
		}
		
		


		

	

	

	

	/*@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	*/

}

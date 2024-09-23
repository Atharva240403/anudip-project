package Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sms.CustomerOrder;
import com.sms.HibernateUtil;

import SalesDao.CustomerOrderDao;

public class CustomerOrderDaoImpl implements CustomerOrderDao{
	
	 Scanner scanner=new Scanner(System.in);

	 Scanner sc=new Scanner(System.in);
		@Override
		public CustomerOrder createCustomerOrder(CustomerOrder customerorder){
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(customerorder);
				session.getTransaction().commit();
				return customerorder;
				
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
		public List<CustomerOrder> getAllCustomerOrders() {
			try(Session session=HibernateUtil.getSession()) {
				
				//execute HQL query to retrieve all students data
				Query<CustomerOrder> query=session.createQuery("FROM CustomerOrder");
				List<CustomerOrder> customerorderList=query.list();
				return customerorderList;
				
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
		public CustomerOrder getCustomerOrderById(String Orderid) {
			// TODO Auto-generated method stub
			try(Session session=HibernateUtil.getSession()) {
				
				CustomerOrder customerorder=session.get(CustomerOrder.class, Orderid);
					return customerorder;
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
		public CustomerOrder updateCustomerOrder(String customerorderId, CustomerOrder CustomerOrder) {
			// TODO Auto-generated method stub
			try(Session session=HibernateUtil.getSession()) {
				CustomerOrder customerorder=session.get(CustomerOrder.class, customerorderId);
					session.beginTransaction();
					
					
					customerorder.setOrderDate(customerorder.getOrderDate());
					
					
					session.saveOrUpdate(customerorder);
					session.getTransaction().commit();
					return customerorder;
				
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
		public String deleteCustomerOrder(String customerorderId) {
			// TODO Auto-generated method stub
			String message=null;
			try(Session session=HibernateUtil.getSession()) {
				CustomerOrder customerorder=session.get(CustomerOrder.class, customerorderId);
					session.beginTransaction();
					System.out.println("Are you sure  you want to delete?");
					String status=sc.next();
					if(status.equalsIgnoreCase("yes"))
					{
						session.delete(customerorder);//data will be deleted from DB
						session.getTransaction().commit();
						session.evict(customerorder);//data will remove from session Cache
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
			return message;		}
		@Override
		public CustomerOrder getCustomerOrder(String orderId) {
			// TODO Auto-generated method stub
			return null;
		}
		}
		
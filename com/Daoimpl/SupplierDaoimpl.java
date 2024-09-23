package Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sms.Customer;
import com.sms.CustomerOrder;
import com.sms.HibernateUtil;
import com.sms.Supplier;

import SalesDao.SupplierDao;

public class SupplierDaoimpl implements SupplierDao{

	Scanner scanner=new Scanner(System.in);
	 Scanner sc=new Scanner(System.in);
		@Override
		public Supplier createSupplier(Supplier supplier){
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(supplier);
				session.getTransaction().commit();
				return supplier;
				
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
		public List<Supplier> getAllSupplier() {
			try(Session session=HibernateUtil.getSession()) {
				
				//execute HQL query to retrieve all students data
				Query<Supplier> query=session.createQuery("FROM Supplier");
				List<Supplier> supplierList=query.list();
				return supplierList;
				
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
		public Supplier getSupplier(String supplierId) {
			
				try(Session session=HibernateUtil.getSession()) {
						
					Supplier supplier=session.get(Supplier.class, supplierId);
						return supplier;
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
		public Supplier updateSupplier(String supplierId,Supplier updatedSupplier) {
			try(Session session=HibernateUtil.getSession()) {
				Supplier supplier=session.get(Supplier.class, supplierId);
					session.beginTransaction();
					
					supplier.setSupplierId(supplierId);
					supplier.setSupplierName(updatedSupplier.getSupplierName()); 
					supplier.setProductId(updatedSupplier.getProductId());
					supplier.setPhoneNumber(updatedSupplier. getPhoneNumber());
					supplier.setOrderId(updatedSupplier. getOrderId());
					session.saveOrUpdate(supplier);
					session.getTransaction().commit();
					return supplier;
				
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
		public String deleteSupplier(String supplierId) {
			String message=null;
			try(Session session=HibernateUtil.getSession()) {
				Supplier supplier=session.get(Supplier.class, supplierId);
					session.beginTransaction();
					System.out.println("Are you sure  you want to delete?");
					String status=sc.next();
					if(status.equalsIgnoreCase("yes"))
					{
						session.delete(supplier);//data will be deleted from DB
						session.getTransaction().commit();
						session.evict(supplier);//data will remove from session Cache
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
		public Supplier getSupplierById(String supplierId) {
			// TODO Auto-generated method stub
			return null;
		}
		}
		
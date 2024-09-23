package Daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.sms.Customer;
import com.sms.HibernateUtil;
import com.sms.Product;

import SalesDao.ProductDao;

public class ProductDaoimpl implements ProductDao {

	 Scanner sc=new Scanner(System.in);
		@Override
		public Product createProduct(Product product){
			try(Session session=HibernateUtil.getSession()) {
				
				session.beginTransaction();
				session.save(product);
				session.getTransaction().commit();
				return product;
				
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
		public List<Product>getProductDetailsById(){
			try(Session session=HibernateUtil.getSession()) {
				
				//execute HQL query to retrieve all students data
				Query<Product> query=session.createQuery("FROM Product");
				List<Product>  productList=query.list();
				return  productList;
				
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
		public Product  getProduct(String productId) {
			
				try(Session session=HibernateUtil.getSession()) {
						
					Product product=session.get( Product.class, productId);
						return  product;
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
		public Product updateProduct(String productId,Product updatedProduct) {
			try(Session session=HibernateUtil.getSession()) {
				Product product=session.get(Product.class, productId);
					session.beginTransaction();
					
					product.setProductId( productId);
					product.setProductBrand(updatedProduct.getProductBrand());
					product.setProductName(updatedProduct.getProductName()); 
					product.setProductQuantity(updatedProduct.getProductQuantity());
					session.saveOrUpdate(product);
					session.getTransaction().commit();
					return product;
				
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
		public String deleteProduct(String productId) {
			String message=null;
			try(Session session=HibernateUtil.getSession()) {
				Product product=session.get(Product.class, productId);
					session.beginTransaction();
					System.out.println("Are you sure  you want to delete?");
					String status=sc.next();
					if(status.equalsIgnoreCase("yes"))
					{
						session.delete(product);//data will be deleted from DB
						session.getTransaction().commit();
						session.evict(product);//data will remove from session Cache
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
		public Product getProductById(String productId) {
			// TODO Auto-generated method stub
			return null;
		}
}
		
		
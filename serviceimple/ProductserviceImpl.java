package serviceimple;


import java.util.List;

import com.sms.Product;

import Daoimpl.CustomerDaoImpl;
import Daoimpl.ProductDaoimpl;
import services.ProductService;
import SalesDao.CustomerDao;
import SalesDao.ProductDao;
import services.*;
public class ProductserviceImpl implements ProductService  {
	
	ProductDao productDao = new ProductDaoimpl();


	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.createProduct(product);
	}

	@Override
	public Product getProduct(String productId) {
		 //TODO Auto-generated method stub
		return productDao.getProduct(productId);
	}

	@Override
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		return productDao.getProductById(productId);
	}

	@Override
	public Product updateProduct(String productId, Product updatedProduct) {
		// TODO Auto-generated method stub
		return productDao.updateProduct(productId,updatedProduct);
	}

	@Override
	public String deleteProduct(String productId) {
		// TODO Auto-generated method stub
		return productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> getProductDetailsById() {
		// TODO Auto-generated method stub
		return productDao.getProductDetailsById();
	}

}

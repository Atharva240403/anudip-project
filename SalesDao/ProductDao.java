package SalesDao;

import java.util.List;

import com.sms.Customer;
import com.sms.Product;

public interface ProductDao {
	Product createProduct(Product product);

	Product getProduct(String productId);

	// List<Customer>getCustomer();
	Product updateProduct(String productId, Product updatedProduct);

	String deleteProduct(String productId);

	List<Product> getProductDetailsById();

	Product getProductById(String productId);

}

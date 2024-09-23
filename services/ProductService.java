package services;

import java.util.List;

import com.sms.Customer;
import com.sms.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product getProduct(String productId);
	
	Product getProductById(String productId);

	// Retrieve order details by order ID
	//List<CustomerOrder> getCustomerOrderDetailsByorderId(String orderId);

	// Update an existing customer
	//Product updateProduct(String productId);

	// Delete a customer by ID
	String deleteProduct(String productId);

	List<Product> getProductDetailsById();

	Product updateProduct(String productId, Product updatedProduct);


	
	
}

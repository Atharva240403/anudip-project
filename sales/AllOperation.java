package sales;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.sms.Customer;
import com.sms.CustomerOrder;
import com.sms.Product;
import com.sms.Supplier;

import serviceimple.CustomerOrderImpl;
import serviceimple.Customerservicesimpl;
import serviceimple.ProductserviceImpl;
import serviceimple.Supplierserviceimpl;
import services.CustomerOrderService;
import services.Customerservices;
import services.ProductService;
import services.SupplierService;
public class AllOperation {

	static Customerservices customerservices = new Customerservicesimpl();
	static CustomerOrderService customerorderservice = new CustomerOrderImpl();
	static SupplierService supplierService = new Supplierserviceimpl();
	static ProductService productService = new ProductserviceImpl();

	static Scanner sc = new Scanner(System.in);

	public static Customer CustomerInputs() {
		sc.nextLine(); // Consume newlin
		
		System.out.println("Enter Customer First Name:");
		String customerFirstName = sc.nextLine();

		System.out.println("Enter Customer Last Name:");
		String customerLastName = sc.nextLine();

		System.out.println("Enter Email:");
		String email = sc.nextLine();

		System.out.println("Enter Phone Number:");
		long phoneNumber = sc.nextLong();
		sc.nextLine(); // Consume newline

		System.out.println("Enter Address:");
		String address = sc.nextLine();

		return new Customer(customerFirstName, customerLastName, email, phoneNumber, address);
	}

	public static CustomerOrder CustomerOrderInputs() throws ParseException {
		sc.nextLine(); // Consume newline

		System.out.println("Enter Order ID:");
		String orderId = sc.nextLine();

		System.out.println("Enter Product ID:");
		String productId = sc.nextLine();

		System.out.println("Enter Order Date (dd-mm-yyyy) ");
		String date = sc.nextLine();

		LocalDate sqlDate = LocalDate.of(2024, 01, 02);

		return new CustomerOrder( orderId,productId, sqlDate);
	}

	public static Supplier SupplierInputs() {
		sc.nextLine(); // Consume newline

		System.out.println("Enter Supplier ID:");
		String supplierId = sc.nextLine();

		System.out.println("Enter Supplier Name:");
		String supplierName = sc.nextLine();

		System.out.println("Enter Product ID:");
		String productId = sc.nextLine();

		System.out.println("Enter Phone Number:");
		String phoneNumber = sc.nextLine();

		System.out.println("Enter Order ID:");
		String orderId = sc.nextLine();

		return new Supplier(supplierId, supplierName, productId, phoneNumber, orderId);
	}

	public static Product ProductInputs() {
		sc.nextLine(); // Consume newline

		System.out.println("Enter Product ID:");
		String productId = sc.nextLine();

		System.out.println("Enter productBrand :");
		String productBrand = sc.nextLine();

		System.out.println("Enter Product Name:");
		String productName = sc.nextLine();

		System.out.println("Enter Product Quantity:");
		int productQuantity = sc.nextInt();

		return new Product(  productId,productBrand, productName, productQuantity);
	}

	public static void CustomerOperations() {
		while (true) {
			System.out.println("1. Add Customer\n" + "2. Retrieve All Customers\n" + "3. Update Customer\n"
					+ "4. Delete Customer\n" + "5. Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				Customer customer = CustomerInputs();
				Customer savedCustomer = customerservices.createCustomer(customer);
				System.out.println("Customer added successfully: " + savedCustomer);
				break;

			case 2:
				List<Customer> customers = customerservices.getAllCustomers();
				if (customers != null && !customers.isEmpty()) {
					for (Customer cust : customers) {
						System.out.println(cust);
					}
				} else {
					System.out.println("No customers found.");
				}
				break;

			case 3:
				System.out.println("Enter Customer ID to update:");
				int customerId = sc.nextInt();
				Customer existingCustomer = customerservices.getCustomer(customerId);
				if (existingCustomer != null) {
					Customer updatedCustomer = CustomerInputs();
					Customer updatedInfo = customerservices.updateCustomer(customerId, updatedCustomer);
					System.out.println("Customer updated successfully: " + updatedInfo);
				} else {
					System.out.println("Customer not found.");
				}
				break;

			case 4:
				System.out.println("Enter Customer ID to delete:");
				int id = sc.nextInt();
				String deleteMessage = customerservices.deleteCustomer(id);
				System.out.println(deleteMessage);
				break;

			case 5:
				return; // Exit back to main menu

			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

	public static void CustomerOrderOperations() throws ParseException {
		while (true) {
			System.out.println(
					"1. Add Customer Order\n2. Retrieve All Customer Orders\n3. Update Customer Order\n4. Delete Customer Order\n5. Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				CustomerOrder orderInput = CustomerOrderInputs();
				CustomerOrder createdOrder = customerorderservice.createCustomerOrder(orderInput);
				System.out.println("Customer Order added successfully: " + createdOrder);
				break;

			case 2:
				List<CustomerOrder> orders = customerorderservice.getAllCustomerOrders();
				if (orders != null && !orders.isEmpty()) {
					for (CustomerOrder order : orders) {
						System.out.println(order);
					}
				} else {
					System.out.println("No customer orders found.");
				}
				break;

			case 3:
				System.out.println("Enter Customer Order ID to update:");
				String orderId = sc.nextLine();
				CustomerOrder existingOrder = customerorderservice.getCustomerOrder(orderId);
				if (existingOrder != null) {
					CustomerOrder updatedCustomerOrder = CustomerOrderInputs();
					CustomerOrder updatedInfo = customerorderservice.updateCustomerOrder(orderId, updatedCustomerOrder);
					System.out.println("Customer Order updated successfully: " + updatedInfo);
				} else {
					System.out.println("Customer Order not found.");
				}
				break;

			case 4:
				System.out.println("Enter Customer Order ID to delete:");
				String deleteOrderId = sc.nextLine();
				String deleteMessage = customerorderservice.deleteCustomerOrder(deleteOrderId);
				System.out.println(deleteMessage);
				break;

			case 5:
				return; // Exit back to main menu

			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

	public static void SupplierOperations() {
		while (true) {
			System.out.println(
					"1. Add Supplier\n2. Retrieve All Suppliers\n3. Update Supplier\n4. Delete Supplier\n5. Back to Main Menu");
			int input = sc.nextInt();
			sc.nextLine(); // Consume newline

			switch (input) {
			case 1:
				Supplier supplierInput = SupplierInputs();
				Supplier createdSupplier = supplierService.createSupplier(supplierInput);
				System.out.println("Supplier added successfully: " + createdSupplier);
				break;

			case 2:
				List<Supplier> suppliers = supplierService.getAllSupplier();
				if (suppliers != null && !suppliers.isEmpty()) {
					for (Supplier supplier : suppliers) {
						System.out.println(supplier);
					}
				} else {
					System.out.println("No suppliers found.");
				}
				break;

			case 3:
				System.out.println("Enter Supplier ID to update:");
				String supplierId = sc.nextLine();
				Supplier existingSupplier = supplierService.getAllSupplier(supplierId);
				if (existingSupplier != null) {
					Supplier updatedSupplier = SupplierInputs();
					Supplier updatedInfo = supplierService.updateSupplier(supplierId, updatedSupplier);
					System.out.println("Supplier updated successfully: " + updatedInfo);
				} else {
					System.out.println("Supplier not found.");
				}
				break;

			case 4:
				System.out.println("Enter Supplier ID to delete:");
				String deleteSupplierId = sc.nextLine();
				String deleteMessage = supplierService.deletesupplier(deleteSupplierId);
				System.out.println(deleteMessage);
				break;

			case 5:
				return; // Exit back to main menu

			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

	public static Void ProductOperations() {
		while (true) {
			System.out.println(
					"Press 1.Add Product Details\n" + "2.Retrieve All Product Data\n" + "3.Update Product Data\nPress"
							+ "4.Delete Product Data\nPress" + " 5.To getback to the main menu");
			int input = sc.nextInt();

			switch (input) {
			case 1:
				Product productInput = ProductInputs();
				Product product = productService.createProduct(productInput);
				System.out.println("Product details added successfully" + product);
				break;

			case 2:
				List<Product> products = productService.getProductDetailsById();
				for (Product stud : products) {
					System.out.println(stud);
				}
				break;

			case 3:
				sc.nextLine();
				System.out.println("Enter Product ID to update:");
				String productId = sc.nextLine();
				Product existingEmployee = productService.getProduct(productId);
				if (existingEmployee != null) {
					Product updatedProduct = ProductInputs();
					Product updated = productService.updateProduct(productId, updatedProduct);
					System.out.println("Product updated successfully: " + updated);
				} else {
					System.out.println("Product not found");
				}
				break;
			case 4:
				System.out.println("Enter Product Id to delete the infromation");
				String deleteProduct = sc.next();
				String message = productService.deleteProduct(deleteProduct);
				System.out.println(message);
				break;

			case 5:
				try {
					MainOperation.mainOps();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	

}

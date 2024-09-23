package services;

import java.util.List;

import com.sms.Supplier;

public interface SupplierService {
	Supplier createSupplier(Supplier supplier);

	Supplier getAllSupplier(String supplierId);
	
	Supplier getSupplierById(String supplierId);

	// Retrieve order details by order ID
	List<Supplier> getAllSupplier();

	// Update an existing customer
	Supplier updateSupplier(String SupplierId, Supplier updatedSupplier);

	// Delete a customer by ID
	String deletesupplier(String supplierId);

}

package SalesDao;

import java.util.List;

import com.sms.Customer;
import com.sms.Supplier;

public interface SupplierDao {
	Supplier createSupplier(Supplier supplier);
    Supplier getSupplier(String supplierId);
    //List<Customer>getCustomer();
    Supplier updateSupplier(String supplierId, Supplier updatedCustomer);
	String deleteSupplier(String supplierId);
    List<Supplier> getAllSupplier();
	Supplier getSupplierById(String supplierId);

}

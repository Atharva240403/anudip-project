package serviceimple;

import java.util.List;

import com.sms.Supplier;

import services.SupplierService;
import SalesDao.SupplierDao;
import Daoimpl.SupplierDaoimpl;
public class Supplierserviceimpl implements SupplierService{
      
	SupplierDao supplierDao = new SupplierDaoimpl();
	@Override
	public Supplier createSupplier(Supplier supplier) {
		
		return supplierDao .createSupplier(supplier);
	}

	@Override
	public Supplier getAllSupplier(String supplierId) {
		
		return supplierDao.getSupplier(supplierId);
	}

	@Override
	public Supplier getSupplierById(String supplierId) {
	
		return supplierDao .getSupplierById(supplierId);
	}

	@Override
	public Supplier updateSupplier(String SupplierId, Supplier updatedSupplier) {
		return supplierDao .updateSupplier(SupplierId,updatedSupplier);
	}

	@Override
	public String deletesupplier(String supplierId) {
		
		return supplierDao.deleteSupplier(supplierId);
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		return supplierDao.getAllSupplier();
	}

	

	
}

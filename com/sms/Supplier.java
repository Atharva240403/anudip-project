package com.sms;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Supplier")
public class Supplier {
	@Id
	@Column(name = "supplierId", length = 30)
	private String supplierId;

	@Column(name = "supplierName", length = 30)
	private String supplierName;

	@Column(name = "productId", length = 30)
	private String productId;

	@Column(name = "phonenumber", length = 100)
	private String phoneNumber;

	@Column(name = "orderId", length = 30)
	private String orderId;

	

	@OneToMany(mappedBy = "productId")
	private List<Product>products;
	
	 public List<Product> getProducts() {
		 return products;
		 }
	 
	 	public void setProducts(List<Product>products) {
	 		this.products=products;
	 	}
	// generate getter setter method

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	// All arguement constructor

	public Supplier(String supplierId, String supplierName, String productId, String phonenumber, String orderId) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.productId = productId;
		this.phoneNumber = phonenumber;
		this.orderId = orderId;
		
	}

	// Default Constructor

	public Supplier() {
		super();
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", productId=" + productId
				+ ", phoneNumber=" + phoneNumber + ", orderId=" + orderId + "]";
	}
}

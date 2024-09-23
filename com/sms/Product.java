package com.sms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@Column(name = "productId", length = 100)
	private String productId;

	@Column(name = "productBrand", length = 30)
	private String productBrand;

	@Column(name = "productName", length = 30)
	private String productName;

	@Column(name = "productQuantity", length = 30)
	private int productQuantity;

	@ManyToOne
	@JoinColumn(name = "supplierid")
	private Supplier supplier;

	@Column(length = 30)

	// generate getter setter method

	public String getProductId() {
		return productId;
	}

	
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	// default constructor
	public Product() {
		super();
	}

	public Product(String productId, String productBrand, String productName, int productQuantity, Supplier	supplier) {
		super();
		this.productId = productId;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.supplier = supplier;
	}

	// all arguement constructor
	public Product(String productId, String productBrand, String productName, int productQuantity) {
		this.productId=productId;
		this.productBrand = productBrand;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productBrand=" + productBrand + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + "]";
	}
}

package com.sms;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CustomerOrder")
public class CustomerOrder {
	@Id
	@Column(name = "orderId", length = 30)
	private String orderId;


	@Column(name = "prductId", length = 30)
	private String productId;

	@Column(name = "orderDate", length = 30)
	private LocalDate orderDate;
	
	@ManyToOne
	@JoinColumn(name="Customerid")
	private Customer Customerid;



	// getter and setter method;
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}



	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	// All arguement constructor
	public CustomerOrder(String orderId, String productId, LocalDate orderDate) {
		this.orderId=orderId;
		this.productId = productId;
		this.orderDate = orderDate;
	}

	// Default constructor
	public CustomerOrder() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerOrder [orderId=" + orderId + ", productId=" + productId
				+ ", orderDate=" + orderDate + "]";
	}

}



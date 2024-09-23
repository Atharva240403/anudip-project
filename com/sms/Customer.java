package com.sms;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
@Entity
@Table(name = "Customer")
public class Customer {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "Customerid", length = 10)
	private int Customerid;

	@Column(name = "Customerfname", length = 50)
	private String Customerfname;

	@Column(name = "Customerlname", length = 50)
	private String Customerlname;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "phonenumber", length = 100)
	private long phonenumber;

	@Column(name = "CustomerAddress", length = 255)
	private String CustomerAddress;
	
     //one to one Mapping
	@OneToMany(mappedBy = "orderId")
	private List<CustomerOrder> customerOrders;

	public List<CustomerOrder> getCustomerOrders() {
		return customerOrders;
	}

	public void setCustomerOrders(List<CustomerOrder> customerOrders) {
		this.customerOrders = customerOrders;
	}

	// Setter And Getter

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int Customerid) {
		this.Customerid = Customerid;
	}

	public String getCustomerfname() {
		return Customerfname;
	}

	public void setCustomerfname(String Customerfname) {
		this.Customerfname = Customerfname;
	}

	public String getCustomerLname() {
		return Customerlname;
	}

	public void setCustomerLname(String Customerlname) {
		this.Customerlname = Customerlname;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public long getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String CustomerAddress) {
		this.CustomerAddress = CustomerAddress;
	}

	// All arguement Constructor
	public Customer( String Customerfname, String Customerlname, String email, long phonenumber,String CustomerAddress) {
		super();
		
		this.Customerfname = Customerfname;
		this.Customerlname = Customerlname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.CustomerAddress = CustomerAddress;

	}

	// Default Constructor
	public Customer() {
		super();
	}

	// ToString method
	@Override
	public String toString() {
		return "Customer[Customerid=" + Customerid + "Customerfname=" + Customerfname + "Customerlname=" + Customerlname
				+ "email=" + email + "phonenumber=" + phonenumber + "CustomerAddress=" + CustomerAddress + "]";
	}
}

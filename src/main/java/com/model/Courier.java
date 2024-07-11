package com.model;

public class Courier {
     String username;
     String address1;
     String address2;
     String phonenum;
     String product;
     String productno;
     String quantity;
	public Courier(String username, String address1, String address2, String phonenum, String product, String productno,
			String quantity) {
		super();
		this.username = username;
		this.address1 = address1;
		this.address2 = address2;
		this.phonenum = phonenum;
		this.product = product;
		this.productno = productno;
		this.quantity = quantity;
	}
	public String getUsername() {
		return username;
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	public String getPhonenum() {
		return phonenum;
	}
	
	public String getProduct() {
		return product;
	}
	
	public String getProductno() {
		return productno;
	}
	
	public String getQuantity() {
		return quantity;
	}
	
     
     
}

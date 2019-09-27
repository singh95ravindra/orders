package com.cyient.training.orders;

public class Order {

	private Long productId;
	private int qty;
	
	public Order() {
		super();
	}
	
	public Order(Long productId, int qty) {
		super();
		this.productId = productId;
		this.qty = qty;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}

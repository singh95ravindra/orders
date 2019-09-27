package com.cyient.training.orders;

public class OrderDetails {

	private Long orderId;
	private String status;
	private Double total;
	
	public OrderDetails() {
		super();
	}
	
	public OrderDetails(Long orderId, String status, Double total) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.total = total;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}

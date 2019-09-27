package com.cyient.training.orders;

import java.util.Random;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	private RestTemplate restTemplate = new RestTemplate();
	private String getProdUrl = "http:/localhost:9000/cyient/products/";

	@RequestMapping(value="/placeOrder", method=RequestMethod.POST)
	public OrderDetails placeOrder(@RequestBody Order order) {
		OrderDetails orderDetails = new OrderDetails();
		ResponseEntity<Product> productEntity = restTemplate.getForEntity(
				getProdUrl+order.getProductId(), Product.class);
		if(productEntity.hasBody()) {
			Product p = productEntity.getBody();
			orderDetails.setOrderId(new Random().nextLong());
			orderDetails.setStatus("SUCCESS");
			orderDetails.setTotal(order.getQty() * p.getPrice());
			return orderDetails;
		} else {
			orderDetails.setStatus("Product not found");;
		}
		return orderDetails;
	}
}

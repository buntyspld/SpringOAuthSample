package com.service.ordersservice.invokeproductservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.ordersservice.model.Product;

@FeignClient(name="Product-Service")
public interface ProductInvoke {

	@GetMapping(path="product/{productNames}")
	Product getProductById();
	

	@GetMapping(path="products")
	List<Product> getProducts();
	
}

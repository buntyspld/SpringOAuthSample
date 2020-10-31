package com.service.ordersservice.invokeproductservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.ordersservice.model.Product;

@RestController
public class ProductClient {

	@Autowired
	ProductInvoke invoke;
	
	@GetMapping("product/{productNames}")
	public ResponseEntity<Product> getProductById(){
		return new ResponseEntity<Product>(invoke.getProductById(), HttpStatus.OK);
	}
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getProducts(){
		return new ResponseEntity<List<Product>>(invoke.getProducts(), HttpStatus.OK);
	}
}

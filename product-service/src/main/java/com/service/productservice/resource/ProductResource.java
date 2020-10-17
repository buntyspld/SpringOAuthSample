package com.service.productservice.resource;

import com.service.productservice.model.Product;
import com.service.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ProductResource {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> allProducts(){
        return productService.allProducts();
    }
    @GetMapping("/product/{productNames}")
    public Product productbyName(String productName){
        return productService.productByName(productName);
    }

}

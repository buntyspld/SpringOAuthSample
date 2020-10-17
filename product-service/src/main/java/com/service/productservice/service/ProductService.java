package com.service.productservice.service;

import com.service.productservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private static List<Product> allProduct = new ArrayList<>();

    public ProductService() {
        allProduct.add(new Product(1, "Nokia 3310", "Mobile", 8000));
        allProduct.add(new Product(2, "Nokia 6600", "Mobile", 18000));
        allProduct.add(new Product(3, "Playstation 4", "Gaming", 38000));
        allProduct.add(new Product(4, "Super Mario", "Video Game", 3000));
    }

    public List<Product> allProducts() {
        return allProduct;
    }


    public Product productByName(String productName) {
  //      return allProduct.stream().filter(p->p.getProductName().equalsIgnoreCase(productName)).findFirst();
   //     return Collections.binarySearch(allProduct,productName);
        for(Product p:allProduct){
            if(p.getProductName().equalsIgnoreCase(productName)) {
                return p;
            }
        }
        return null;
    }
}

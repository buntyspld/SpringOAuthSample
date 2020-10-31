package com.shipping.shippingservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.shipping.shippingservice.model.Product;

@Service
public class ShippingService {


	@KafkaListener(topics = "Ship_Order")
    public void shipOrder(Product product) 
    {
        // order shipped
    }
}

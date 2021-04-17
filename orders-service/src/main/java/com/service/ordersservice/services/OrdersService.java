package com.service.ordersservice.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

	//@KafkaListener(topics = "Confirm_Order")
    public void confirmOrder(String message) 
    {
        // order confirm & send confirm mail
    }
}

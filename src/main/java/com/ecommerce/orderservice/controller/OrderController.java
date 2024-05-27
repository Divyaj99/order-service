package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.model.OrderResponse;
import com.ecommerce.orderservice.service.OrderService;
import com.ecommerce.orderservice.service.implementation.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @Autowired
    private RestTemplate restTemplate;

    // RestTemplate restTemplate = new RestTemplate(); // Violates singleton scope
    @GetMapping("/{orderId}")
    private ResponseEntity<String> findOrderInfo(@PathVariable Long orderId) {
        return restTemplate.getForEntity("http://localhost:8085/cart/{orderId}", String.class, orderId);
    }
}

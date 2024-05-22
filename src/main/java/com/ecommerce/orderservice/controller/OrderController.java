package com.ecommerce.orderservice.controller;

import com.ecommerce.orderservice.model.OrderResponse;
import com.ecommerce.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order/")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{orderId}")
    private OrderResponse findOrderInfo(@PathVariable Long orderId) {
        orderService.fetchOrderDetails();
        return null;
    }
}

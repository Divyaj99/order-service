package com.ecommerce.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private Long orderId;
    private String orderName;
    private String orderDescription;
    private Double price;
    private LocalDate orderDate;


  }

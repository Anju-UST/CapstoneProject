package com.Order.Controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Order.Model.Order;
import com.Order.Service.OrderService;
import com.Order.dto.OrderDto;


@RestController
@RequestMapping("/api/orders")
@CrossOrigin("*")
public class OrderController {
    private final OrderService orderService;
    
//    private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping()
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @PostMapping()
    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        Order createdOrder = orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }
    @PostMapping("/all")
    public ResponseEntity<List<Order>> createMultipleProduct(@RequestBody OrderDto order) {
//    	logger.info("========================/all==============");
    	System.err.println(order);
        List<Order> createdOrder = orderService.createMultipleProducts(order.getCartItems());
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }

    

    // Add more endpoints as needed
}

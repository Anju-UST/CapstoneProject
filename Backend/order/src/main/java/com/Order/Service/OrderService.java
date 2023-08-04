package com.Order.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Order.Model.Order;
import com.Order.Repository.OrderRepository;
//import com.example.product.Model.Product;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

	public List<Order> createMultipleProducts(List<Order> order) {
	    List<Order> createdOrder = orderRepository.saveAll(order);
	    return createdOrder;
	}


    // Add more methods as needed
}


package com.Order.dto;

import java.util.List;

import com.Order.Model.Order;

public class OrderDto {

	private List<Order> cartItems;
	
	public List<Order> getCartItems() {
		return cartItems;
	}
	
	public void setCartItems(List<Order> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		return "OrderDto [cartItems=" + cartItems + "]";
	}
	
	
}

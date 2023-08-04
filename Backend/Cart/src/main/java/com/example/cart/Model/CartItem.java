package com.example.cart.Model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class CartItem {
	
	@Id
    private long id;
	private long user_id;
    private String name;
    private double price;
    private String image;
    private int quantity;
    
	public long getId() {      // Constructors,
		return id;
	}
	
	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public CartItem() {  //  getters, and setters
	
		super();
	}
    

    
}

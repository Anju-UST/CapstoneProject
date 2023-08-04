package com.example.cart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cart.Model.CartItem;
@Repository
public interface CartRepository extends JpaRepository<CartItem,Long> {

}

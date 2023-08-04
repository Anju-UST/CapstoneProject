package com.Order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Order.Model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

}

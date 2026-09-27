package com.canteen.canteen_backend.repository;

import com.canteen.canteen_backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
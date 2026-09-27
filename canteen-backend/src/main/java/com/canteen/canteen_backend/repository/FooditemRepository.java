package com.canteen.canteen_backend.repository;

import com.canteen.canteen_backend.model.Fooditem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooditemRepository extends JpaRepository<Fooditem, Long> {
}
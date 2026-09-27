package com.canteen.canteen_backend.controller;

import com.canteen.canteen_backend.model.Fooditem;
import com.canteen.canteen_backend.repository.FooditemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/food")
public class FooditemController {

    private final FooditemRepository FooditemRepository;

    public FooditemController(FooditemRepository foodItemRepository) {
        this.FooditemRepository = foodItemRepository;
    }

    @GetMapping
    public List<Fooditem> getAllFoodItems() {
        return FooditemRepository.findAll();
    }
}

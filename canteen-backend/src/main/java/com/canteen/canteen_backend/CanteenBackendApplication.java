package com.canteen.canteen_backend;

import com.canteen.canteen_backend.model.Fooditem;
import com.canteen.canteen_backend.repository.FooditemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CanteenBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CanteenBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner loadFoodItems(FooditemRepository repository) {
        return args -> {

            if (repository.count() == 0) {

                repository.save(new Fooditem("Sambar Rice", 50));
                repository.save(new Fooditem("Curd Rice", 45));
                repository.save(new Fooditem("Vegetable Biryani", 90));
                repository.save(new Fooditem("Kuska", 80));
                repository.save(new Fooditem("Parotta", 40));
                repository.save(new Fooditem("Chapati", 40));
                repository.save(new Fooditem("Dosa", 40));
                repository.save(new Fooditem("Chicken Biryani", 120));
                repository.save(new Fooditem("Fried Rice", 80));
                repository.save(new Fooditem("Chicken Rice", 100));
                repository.save(new Fooditem("Mushroom Rice", 90));
                repository.save(new Fooditem("Cauliflower Rice", 80));
                repository.save(new Fooditem("Chicken Noodles", 100));
                repository.save(new Fooditem("Mushroom Noodles", 90));
                repository.save(new Fooditem("Cauliflower Noodles", 80));
            }
        };
    }
}

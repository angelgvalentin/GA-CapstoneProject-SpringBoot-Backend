package com.example.demo.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service //this connects to groceryService in groceryController
public class GroceryService {


    private final GroceryRepository groceryRepository;

    @Autowired
    public GroceryService(GroceryRepository groceryRepository) {
        this.groceryRepository = groceryRepository;
    }

    public List<Grocery> getGrocery() {
        return groceryRepository.findAll();
    }

    public void addNewGrocery(Grocery grocery) {
        Optional<Grocery> groceryOptional = groceryRepository
                .findGroceryByImage(grocery.getImage());
        groceryRepository.save(grocery);
    }

    public void deleteGrocery(Long groceryId) {
        boolean exists = groceryRepository.existsById(groceryId);

        groceryRepository.deleteById(groceryId);
    }

    @Transactional
    public void updateGrocery( Long groceryId, Grocery groceryData) {
        groceryData.setId(groceryId);
        groceryRepository.save(groceryData);

    }
}

package com.example.demo.grocery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/v1/grocery")
@CrossOrigin(origins = "*", allowedHeaders = "*")


public class GroceryController {

    private final GroceryService groceryService;

    @Autowired
    public GroceryController(GroceryService groceryService) {
        this.groceryService = groceryService;
    }

    @GetMapping
    public List<Grocery> getGrocery(){
        return groceryService.getGrocery();
    }

    @PostMapping
    public void addNewGrocery(@RequestBody Grocery grocery) {
        groceryService.addNewGrocery(grocery);
    }

    @DeleteMapping(path = "{groceryId}")
    public void deleteGrocery(
            @PathVariable("groceryId")Long groceryId) {
        groceryService.deleteGrocery(groceryId);
    }

    @PutMapping(path = "{groceryId}")
    public void updateGrocery(@PathVariable("groceryId") Long groceryId,
            @RequestBody(required = false) Grocery groceryData) {
        groceryService.updateGrocery(groceryId, groceryData);
    }



}

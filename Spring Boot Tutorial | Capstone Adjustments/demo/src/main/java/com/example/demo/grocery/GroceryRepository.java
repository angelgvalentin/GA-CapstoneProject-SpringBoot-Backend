package com.example.demo.grocery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GroceryRepository extends JpaRepository<Grocery, Long> {

    @Query("SELECT s FROM Grocery s WHERE s.image = ?1")
    Optional<Grocery> findGroceryByImage(String image);
}

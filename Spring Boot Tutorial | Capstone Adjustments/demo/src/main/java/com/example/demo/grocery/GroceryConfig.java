//package com.example.demo.grocery;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class GroceryConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(
//            GroceryRepository repository) {
//        return args -> {
//            Grocery eggs = new Grocery(
//                    "Eggs",
//                     "https://www.svgrepo.com/show/70713/eggs.svg",
//                    0
//
//
//             );
//
//            Grocery milk = new Grocery(
//                    "Milk",
//                     "https://www.svgrepo.com/show/108604/milk.svg",
//                    0
//
//            );
//
//            repository.saveAll(
//                    List.of(eggs, milk)
//            );
//        };
//    }
//
//}

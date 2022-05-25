package com.example.demo.grocery;

import javax.persistence.*;

@Entity
@Table
public class Grocery {
    @Id
    @SequenceGenerator(
            name = "grocery_sequence",
            sequenceName = "grocery_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "grocery_sequence"
    )
    private Long id;

    private String name;
    private String image;
    private Integer quantity; //TODO: ADD QUANTITY EVERYWHERE FOR IT TO WORK


    public Grocery() {

    }


    public Grocery(Long id, String name, String image, Integer quantity) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.quantity = quantity;
    }


    public Grocery(String name, String image, Integer quantity) {
        this.name = name;
        this.image = image;
        this.quantity = quantity;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }





    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

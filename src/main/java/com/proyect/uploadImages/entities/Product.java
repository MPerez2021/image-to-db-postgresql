package com.proyect.uploadImages.entities;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Product {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Getter @Setter
    public String id;

    @NotNull
    @Getter @Setter
    private String name;

    @NotNull
    @Getter @Setter
    private Double price;

    @NotNull
    @Getter @Setter
    private String description;

    @NotNull
    @Getter @Setter
    private String category;

    @Lob
    @NotNull
    @Getter @Setter
    private String image;

    public Product() {
    }

    public Product(String id, String name, Double price, String description, String category, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
    }
}

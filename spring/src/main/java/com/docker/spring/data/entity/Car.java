package com.docker.spring.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String model;
   private Integer year;

   @ManyToOne()
   @JoinColumn(name = "brand_id")
   private Brand brand;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public Integer getYear() {
      return year;
   }

   public void setYear(Integer year) {
      this.year = year;
   }

   public Brand getBrand() {
      return brand;
   }

   public void setBrand(Brand brand) {
      this.brand = brand;
   }
}

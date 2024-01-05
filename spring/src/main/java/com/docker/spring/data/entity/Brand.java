package com.docker.spring.data.entity;

import com.docker.spring.data.type.Countries;
import jakarta.persistence.*;

@Entity
@Table(name = "brand")
public class Brand {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String name;
   private Countries country;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Countries getCountry() {
      return country;
   }

   public void setCountry(Countries country) {
      this.country = country;
   }
}

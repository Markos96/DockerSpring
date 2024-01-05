package com.docker.spring.data.DTO;

import com.docker.spring.data.type.Countries;

public class BrandDTO {
   private String name;
   private Countries country;

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

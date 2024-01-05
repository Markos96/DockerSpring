package com.docker.spring.controller;

import com.docker.spring.data.DTO.BrandDTO;
import com.docker.spring.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

   private BrandService brandService;

   @PostMapping
   public ResponseEntity<BrandDTO> saveBrand(@RequestBody BrandDTO brandDTO){
      return ResponseEntity.ok(brandService.saveBrand(brandDTO));
   }

   @GetMapping("/brands")
   public ResponseEntity<List<BrandDTO>> getBrands(){
      return ResponseEntity.ok(brandService.getBrands());
   }

   @GetMapping("/{id}")
   public ResponseEntity<BrandDTO> getBrandById(@PathVariable Integer id){
      return ResponseEntity.ok(brandService.getBrandById(id));
   }

   @DeleteMapping("/{id}")
   public void deleteBrandById(@PathVariable Integer id){
      brandService.deleteBrandById(id);
   }

   @Autowired
   public void setBrandService(BrandService brandService) {
      this.brandService = brandService;
   }
}

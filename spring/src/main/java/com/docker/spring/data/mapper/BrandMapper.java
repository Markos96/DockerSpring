package com.docker.spring.data.mapper;

import com.docker.spring.data.DTO.BrandDTO;
import com.docker.spring.data.entity.Brand;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BrandMapper {
   private ModelMapper modelMapper;

   public BrandDTO toDTO(Brand brand){
      return modelMapper.map(brand, BrandDTO.class);
   }

   public Brand toEntity(BrandDTO brandDTO){
      return modelMapper.map(brandDTO, Brand.class);
   }


   @Autowired
   public void setModelMapper(ModelMapper modelMapper) {
      this.modelMapper = modelMapper;
   }

}

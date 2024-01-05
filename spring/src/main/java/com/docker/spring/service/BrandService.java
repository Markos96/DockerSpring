package com.docker.spring.service;

import com.docker.spring.data.DTO.BrandDTO;
import com.docker.spring.data.mapper.BrandMapper;
import com.docker.spring.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrandService {

   private BrandMapper brandMapper;
   private BrandRepository brandRepository;

   public BrandDTO saveBrand(BrandDTO brandDTO){
      return brandMapper.toDTO(brandRepository
              .save(brandMapper.toEntity(brandDTO)));
   }

   public List<BrandDTO> getBrands(){
      return brandRepository.findAll()
              .stream()
              .map(dto -> brandMapper.toDTO(dto))
              .collect(Collectors.toList());
   }

   public BrandDTO getBrandById(Integer id){
      return brandMapper.toDTO(brandRepository.findById(id)
              .orElseThrow(RuntimeException::new));
   }

   public void deleteBrandById(Integer id){
      if(brandRepository.existsById(id)){
         brandRepository.deleteById(id);
      }else{
         throw new RuntimeException("No se encuentra el ID indicado");
      }
   }

   @Autowired
   public void setBrandMapper(BrandMapper brandMapper) {
      this.brandMapper = brandMapper;
   }

   @Autowired
   public void setBrandRepository(BrandRepository brandRepository) {
      this.brandRepository = brandRepository;
   }
}

package com.ecom.cliente.ecom.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cliente.ecom.dto.ProductDTO;
import com.ecom.cliente.ecom.mapper.ProductMapper;
import com.ecom.cliente.ecom.model.Product;
import com.ecom.cliente.ecom.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private final ProductMapper motorcycleMapper;
    @Autowired
    private final ProductRepository motorcycleRepository;

    public ProductService(ProductMapper motorcycleMapper, ProductRepository motorcycleRepository) {
        this.motorcycleMapper = motorcycleMapper;
        this.motorcycleRepository = motorcycleRepository;
    }

    public ProductDTO createProduct(ProductDTO motorcycleDTO) {
        Product motorcycle = motorcycleMapper.toProduct(motorcycleDTO);
        Product savedMotorcycle = motorcycleRepository.save(motorcycle);
        return motorcycleMapper.toProductDTO(savedMotorcycle);
    }

    public ProductDTO getProductById(Long id) {
        return motorcycleRepository.findById(id)
                .map(motorcycleMapper::toProductDTO)
                .orElse(null);
    }

    public List<ProductDTO> getAllProducts() {
        return motorcycleRepository.findAll().stream()
                .map(motorcycleMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO updateProduct(Long id, ProductDTO motorcycleDTO) {
        return motorcycleRepository.findById(id)
                .map(motorcycle -> {
                    motorcycle.setModel(motorcycleDTO.getModel());
                    motorcycle.setBrand(motorcycleDTO.getBrand());
                    return motorcycleMapper.toProductDTO(motorcycleRepository.save(motorcycle));
                })
                .orElse(null);
    }

    public void deleteProduct(Long id) {
        motorcycleRepository.deleteById(id);
    }
}

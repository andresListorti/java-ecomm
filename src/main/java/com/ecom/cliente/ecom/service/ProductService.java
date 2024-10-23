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
    private final ProductMapper productMapper;
    @Autowired
    private final ProductRepository productRepository;

    public ProductService(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = productMapper.toProduct(productDTO);
        Product savedProduct = productRepository.save(product);
        return productMapper.toProductDTO(savedProduct);
    }

    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toProductDTO)
                .orElse(null);
    }

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setModel(productDTO.getModel());
                    product.setBrand(productDTO.getBrand());
                    return productMapper.toProductDTO(productRepository.save(product));
                })
                .orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

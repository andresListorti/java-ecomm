package com.ecom.cliente.ecom.mapper;

import org.springframework.stereotype.Component;

import com.ecom.cliente.ecom.dto.ProductDTO;
import com.ecom.cliente.ecom.model.Product;

@Component
public class ProductMapper {
    public ProductDTO toProductDTO(Product product) {
        if (product == null) {
            return null;
        }

        return ProductDTO.builder()
                .id(product.getId())
                .model(product.getModel())
                .brand(product.getBrand())
                .userId(product.getUser() != null ? product.getUser().getId() : null)
                .build();
    }

    public Product toProduct(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }

        Product product = new Product();
        product.setId(productDTO.getId());
        product.setModel(productDTO.getModel());
        product.setBrand(productDTO.getBrand());
        
        return product;
    }
}

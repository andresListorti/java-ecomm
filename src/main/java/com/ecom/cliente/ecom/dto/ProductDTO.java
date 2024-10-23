package com.ecom.cliente.ecom.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {
    private Long id;
    private String model;
    private String brand;
    private Long userId;
}
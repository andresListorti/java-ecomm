package com.ecom.cliente.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.cliente.ecom.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}

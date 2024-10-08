package com.ecom.cliente.ecom.repository;

import org.hibernate.mapping.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.cliente.ecom.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByDni(Long dni);

    Cliente findByNombre(String nombre);
    
}

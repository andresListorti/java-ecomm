package com.ecom.cliente.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.cliente.ecom.model.Domicilio;



@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {

}


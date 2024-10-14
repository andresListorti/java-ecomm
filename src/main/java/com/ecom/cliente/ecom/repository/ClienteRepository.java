package com.ecom.cliente.ecom.repository;

import java.util.List;
// import org.hibernate.mapping.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.cliente.ecom.model.Cliente;
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Cliente findByDni(Long dni);

    Cliente findByNombre(String nombre);
    
    List<Cliente> findByApellido(String apellido);

    

    
}

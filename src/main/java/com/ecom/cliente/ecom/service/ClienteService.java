package com.ecom.cliente.ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cliente.ecom.model.Cliente;
import com.ecom.cliente.ecom.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void agregarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
    public Optional<Cliente> getById(int id) {
        return clienteRepository.findById(id);
    }

    public Cliente findByDni(Long dni) {
        return this.clienteRepository.findByDni(dni);
    }
    public Cliente findByNombre(String nombre) {
        return this.clienteRepository.findByNombre(nombre);
    }

    public void borrarCliente(Cliente c) {
        if (this.clienteRepository.existsById(c.getId())) {
            this.clienteRepository.delete(c);
        } else {
            System.out.println("El Cliente no puede borrarse porque no existe");
        }

    }


}

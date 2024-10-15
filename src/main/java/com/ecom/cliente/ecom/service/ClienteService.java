package com.ecom.cliente.ecom.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.cliente.ecom.dto.ClienteDTO;
import com.ecom.cliente.ecom.model.Cliente;
import com.ecom.cliente.ecom.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    

    public void agregarCliente(Cliente cliente) {
        Cliente c = clienteRepository.findByDni(cliente.getDni());
        if (c != null) {
            throw new IllegalIdentifierException("El cliente ya existe");
        } 
        clienteRepository.save(cliente);

    }

    public ClienteDTO actualizarCliente(int id, Cliente c) {
        Cliente clienteExistente = this.clienteRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Cliente no encontrado"));
        
        clienteExistente.setNombre(c.getNombre());
        clienteExistente.setApellido(c.getApellido());
        clienteExistente.setEdad(c.getEdad());
        clienteExistente.setFechaModificacion(FechaService.getFechaActual());

        
        this.clienteRepository.save(clienteExistente);

        ClienteDTO clienteAux = ClienteDTO.builder().nombre(clienteExistente.getNombre()).apellido(clienteExistente.getApellido()).edad(clienteExistente.getEdad()).build();

        return clienteAux;


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
    
    public List<Cliente> findByNombre(String nombre) {
        return this.clienteRepository.findByNombre(nombre);
    }
    
    // public List<Cliente> buscarPorNombre(String nombre) {
    //     return this.clienteRepository.buscarPorNombre(nombre);
    // }
    
    public List<Cliente> findByApellido(String apellido) {
        return this.clienteRepository.findByApellido(apellido);
    }

    public void borrarCliente(Cliente c) {
        if (this.clienteRepository.existsById(c.getId())) {
            this.clienteRepository.delete(c);
        } else {
            System.out.println("El Cliente no puede borrarse porque no existe");
        }

    }


}

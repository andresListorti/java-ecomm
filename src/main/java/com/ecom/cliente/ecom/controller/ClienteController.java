package com.ecom.cliente.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.cliente.ecom.model.Cliente;
import com.ecom.cliente.ecom.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/all")
    public List<Cliente> getAllClients() {
        return this.clienteService.getAllClientes();
    }
    
    @GetMapping("/pornombre")
    public ResponseEntity<?> buscarClientePorNombre(@RequestParam String nombre) {
        try {
            this.clienteService.findByNombre(nombre);
            return ResponseEntity.ok(this.clienteService.findByNombre(nombre));
        } catch (Exception e) {
            
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
    @GetMapping("/porapellido/{apellido}")
    public ResponseEntity<?> buscarClientePorApellido(@PathVariable String apellido) {
        try {
            this.clienteService.findByApellido(apellido);
            return ResponseEntity.ok(this.clienteService.findByApellido(apellido));
        } catch (Exception e) {
            
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/create")
    public ResponseEntity<?> agregarCliente(@RequestBody Cliente cliente) {
        try {
            this.clienteService.agregarCliente(cliente);
            return ResponseEntity.ok(cliente);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return ResponseEntity.status(400).body("Cliente No creado");
        }
        // this.clienteService.agregarCliente(cliente);
        // return ResponseEntity.ok(cliente);
    }
    
    
    


}

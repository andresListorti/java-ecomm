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

    @PostMapping("/create")
    public ResponseEntity<?> agregarCliente(@RequestBody Cliente cliente) {
        this.clienteService.agregarCliente(cliente);
        return ResponseEntity.ok(cliente);
    }
    
    


}

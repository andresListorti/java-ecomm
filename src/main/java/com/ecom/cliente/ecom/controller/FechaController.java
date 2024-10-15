package com.ecom.cliente.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.cliente.ecom.service.FechaService;
import com.ecom.cliente.ecom.utils.ApiResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/fechas")
public class FechaController {

    @Autowired
    private FechaService fechaService;

    @GetMapping("/allFechas")
    public ResponseEntity<?> getfechas() {
        ApiResponse apiResponse = new ApiResponse("Hora Actual: " + FechaService.getFechaActual(), " Cantidad de invocaciones: " + fechaService.getCantidadDeInvocaciones());
        return ResponseEntity.ok(apiResponse);
    
    }
    


}

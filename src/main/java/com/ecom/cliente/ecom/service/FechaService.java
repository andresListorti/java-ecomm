package com.ecom.cliente.ecom.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;

@Service
public class FechaService {

    private ZoneId zonaArgentina = ZoneId.of("America/Argentina/Buenos_Aires");
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
    
    private int cantidadDeInvocaciones = 0;
    
    public String getFechaActual() {
        ZonedDateTime fechaActual = ZonedDateTime.now(zonaArgentina);
        setCantidadDeInvocaciones();
        return fechaActual.format(formato);
    } 
    
    public int getCantidadDeInvocaciones() {
        return cantidadDeInvocaciones;
    }

    public void setCantidadDeInvocaciones() {
        this.cantidadDeInvocaciones++;
    }
    
    


}

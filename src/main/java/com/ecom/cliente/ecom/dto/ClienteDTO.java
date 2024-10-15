package com.ecom.cliente.ecom.dto;

import org.springframework.core.serializer.Serializer;
import java.io.Serializable;

// DTO Data Transfer Object

public class ClienteDTO implements Serializable {
    private String nombre;
    private String apellido;
    private long dni;

    public ClienteDTO(String nombre, String apellido, long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
}

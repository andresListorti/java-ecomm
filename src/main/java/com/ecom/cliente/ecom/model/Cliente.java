package com.ecom.cliente.ecom.model;

import java.util.List;

import com.ecom.cliente.ecom.service.FechaService;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Inheritance;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "CLIENTE")
// @Inheritance(strategy = InheritanceType.JOINED)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Cliente {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(name = "NOMBRE")
 private String nombre;

 @Column(name = "APELLIDO")
 private String apellido;

 @Column(name = "DNI")
 private long dni;
 
 @Column(name = "EDAD")
 private int edad;

 @Column(name = "FECHA DE CREACION")
 private String fechaCreacion = FechaService.getFechaActual();

 @Column(name = "FECHA DE MODIFICACION")
 private String fechaModificacion;

 @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
 private List<Domicilio> domicilio;

 

public Cliente(String nombre, String apellido, long dni, List<Domicilio> domicilio, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.edad = edad;
    this.domicilio = domicilio;
}








@Override
public boolean equals(Object obj) {
    if (this == obj)
    return true;
    if (obj == null)
    return false;
    if (getClass() != obj.getClass())
    return false;
    Cliente other = (Cliente) obj;
    if (id != other.id)
    return false;
    if (nombre == null) {
        if (other.nombre != null)
        return false;
    } else if (!nombre.equals(other.nombre))
    return false;
    if (apellido == null) {
        if (other.apellido != null)
        return false;
    } else if (!apellido.equals(other.apellido))
    return false;
    if (dni != other.dni)
    return false;
    if (domicilio == null) {
        if (other.domicilio != null)
        return false;
    } else if (!domicilio.equals(other.domicilio))
    return false;
    return true;
}





@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
    result = prime * result + (int) (dni ^ (dni >>> 32));
    result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
    return result;
}



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", apellido='" + getApellido() + "'" +
            ", dni='" + getDni() + "'" +
            ", edad='" + getEdad() + "'" +
            ", fechaCreacion='" + getFechaCreacion() + "'" +
            ", fechaModificacion='" + getFechaModificacion() + "'" +
            ", domicilio='" + getDomicilio() + "'" +
            "}";
    }








}
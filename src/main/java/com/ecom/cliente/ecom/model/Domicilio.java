package com.ecom.cliente.ecom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "DOMICILIO")
public class Domicilio {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;

 @Column(name = "CALLE")
 private String calle;

 @Column(name = "NUMERO")
 private int numero;

 @Column(name = "PISO")
 private int piso;

 @Column(name = "DEPARTAMENTO")
 private String departamento;

 @Column(name = "CP")
 private String cp;

 @Column(name = "LOCALIDAD")
 private String localidad;

 @Column(name = "PROVINCIA")
 private String provincia;

 @ManyToOne(fetch = FetchType.LAZY)
 private Cliente cliente;
// RESTO DE LOS MÉTODOS
}
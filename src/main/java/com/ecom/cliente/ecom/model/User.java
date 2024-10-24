package com.ecom.cliente.ecom.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String website;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    @JoinTable(name = "user_domicilio", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "domicilio_id"))
    private Set<Domicilio> domicilios = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String email, String phone, String website, List<Product> products,
            Set<Domicilio> domicilios) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.products = products;
        this.domicilios = domicilios;
    }

    public void addProduct(Product product) {
        products.add(product);
        product.setUser(this);
    }

    public void removeProduct(Product product) {
        products.remove(product);
        product.setUser(null);
    }

    
    public void addDomicilio(Domicilio domicilio) {
        if (!this.domicilios.contains(domicilio)) {
            domicilios.add(domicilio);
            
            if (!domicilio.getUsers().contains(this)) {
                domicilio.getUsers().add(this);
            }
        }
    }

    public void removeDomicilio(Domicilio domicilio) {
        domicilios.remove(domicilio);
        domicilio.getUsers().remove(this);
    }

    
}

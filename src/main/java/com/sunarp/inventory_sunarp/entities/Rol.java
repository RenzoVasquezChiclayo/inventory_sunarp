package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class Rol {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int id;

    @Column
    private String rol;

    @Column
    private Date created_at;

    @ManyToMany(targetEntity=Usuario.class)
    private Set Usuario;

    public Rol() {
        super();
    }

    public Rol(int id, Date created_at, String rol, Set usuario) {
        this.id = id;
        this.created_at = created_at;
        this.rol = rol;
        Usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Set getUsuario() {
        return Usuario;
    }

    public void setUsuario(Set usuario) {
        Usuario = usuario;
    }
}

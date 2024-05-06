package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Usuario {
    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int id;

    @Column(unique=true)
    private String usuario;

    @Column
    private String password;

    @Column
    private Date created_at;

    public Usuario() {
        super();
    }

    public Usuario(int id, String usuario, String password, Date created_at) {
        this.id = id;
        this.usuario = usuario;
        this.password = password;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}

package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Rol {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int id;

    @Column
    private String rol;

    @Column
    private Date created_at;

    public Rol() {
        super();
    }

    public Rol(int id, String rol, Date created_at) {
        this.id = id;
        this.rol = rol;
        this.created_at = created_at;
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
}

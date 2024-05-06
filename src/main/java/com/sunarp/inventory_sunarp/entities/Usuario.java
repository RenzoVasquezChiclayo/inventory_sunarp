package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Usuario {
    @Id
    private int id;

    @Column(unique=true)
    private String usuario;

    @Column
    private String password;

    @Column
    private Date created_at;



}

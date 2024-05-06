package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Rol {

    @Id
    private int id;

    @Column
    private String rol;

    @Column
    private Date created_at;
}

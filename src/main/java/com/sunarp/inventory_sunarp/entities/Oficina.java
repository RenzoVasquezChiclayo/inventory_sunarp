package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Oficina {

    @Id
    private int id;

    @Column
    private String departamento;

    @Column
    private String provincia;

    @Column
    private String oficina;

    @Column
    private Character estado;

    @Column
    private Date created_at;


}

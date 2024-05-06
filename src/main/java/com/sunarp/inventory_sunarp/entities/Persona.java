package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

import java.util.Date;

public class Persona {

    @Id
    private int id;

    @Column
    private String dni;

    @Column
    private String nombres;

    @Column
    private String apellidos;

    @Column
    private Character sexo;

    @Column
    private Date fecha_nacimiento;

    @Column
    private Character celular;

    @Column
    private Character telefono;

    @Column
    private String direccion;

    @Column
    private String correo;

    @Column
    private Character estado;

    @Column
    private Date created_at;
}

package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Patrimonio {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
    private int id;

    @Column
    private String bien;

    @Column
    private String descripcion;

    @Column
    private Character estado;

    @Column
    private String observacion;

    @Column
    private Date created_at;

    public Patrimonio() {
        super();
    }

    public Patrimonio(int id, String bien, String descripcion, Character estado, String observacion, Date created_at) {
        this.id = id;
        this.bien = bien;
        this.descripcion = descripcion;
        this.estado = estado;
        this.observacion = observacion;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBien() {
        return bien;
    }

    public void setBien(String bien) {
        this.bien = bien;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}

package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Area {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    private String area;

    @Column
    private Character estado;

    @Column
    private Date created_at;

    @ManyToOne
    private Oficina oficina;

    public Area() {
        super();
    }

    public Area(int id, String area, Character estado, Date created_at, Oficina oficina) {
        this.id = id;
        this.area = area;
        this.estado = estado;
        this.created_at = created_at;
        this.oficina = oficina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }
}

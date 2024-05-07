package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Mueble {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int id;

    @OneToOne
    private Patrimonio patrimonio;

    public Mueble() {
        super();
    }

    public Mueble(int id, Patrimonio patrimonio) {
        this.id = id;
        this.patrimonio = patrimonio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }
}

package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

public class Equipo {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String marca;

    @Column
    private String modelo;

    @Column
    private String color;

    @Column
    private String serie;

    @Column
    private String dimensiones;

    @Column
    private String ram;

    @Column
    private String disco;

    @Column
    private String procesador;

    @Column
    private String generacion;

    @OneToOne
    private Patrimonio patrimonio;

    public Equipo() {
        super();
    }

    public Equipo(int id, String marca, String modelo, String color, String serie, String dimensiones, String ram, String disco, String procesador, String generacion, Patrimonio patrimonio) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.serie = serie;
        this.dimensiones = dimensiones;
        this.ram = ram;
        this.disco = disco;
        this.procesador = procesador;
        this.generacion = generacion;
        this.patrimonio = patrimonio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public Patrimonio getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(Patrimonio patrimonio) {
        this.patrimonio = patrimonio;
    }
}

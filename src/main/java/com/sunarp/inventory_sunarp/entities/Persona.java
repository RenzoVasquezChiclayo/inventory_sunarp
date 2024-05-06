package com.sunarp.inventory_sunarp.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Persona {

    @Id
    @GeneratedValue( strategy= GenerationType.IDENTITY )
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

    public Persona() {
        super();
    }

    public Persona(int id, String dni, String nombres, String apellidos, Character sexo, Date fecha_nacimiento, Character celular, Character telefono, String direccion, String correo, Character estado, Date created_at) {
        this.id = id;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.celular = celular;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.estado = estado;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Character getCelular() {
        return celular;
    }

    public void setCelular(Character celular) {
        this.celular = celular;
    }

    public Character getTelefono() {
        return telefono;
    }

    public void setTelefono(Character telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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
}

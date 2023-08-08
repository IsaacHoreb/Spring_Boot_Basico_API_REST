package com.gestion.productos.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    //Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private float precio;

    //Constructor con ID
    public Producto(Integer id, String nombre, float precio) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    //Constructor sin ID
    public Producto(String nombre, float precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
    }

    //Constructor vacio
    public Producto() {
        super();
    }

    //GENERACION DE GET AND SET

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

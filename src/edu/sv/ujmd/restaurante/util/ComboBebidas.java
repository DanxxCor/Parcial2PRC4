/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.restaurante.util;

/**
 *
 * @author reyee
 */
public class ComboBebidas {
     private int id;
    private String nombre;
    private float precio;

    public ComboBebidas() {
    }

    public ComboBebidas(int pid, String pnombre) {
        id = pid;
        nombre = pnombre;        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

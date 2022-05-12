/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.restaurante.util;



/**
 *
 * @author reyee
 */
public class ComboAlimentos {
    private int id;
    private String nombre;
    private float precio;

    public ComboAlimentos() {
    }

    public ComboAlimentos(int pid, String pnombre, float pprecio) {
        id = pid;
        nombre = pnombre;   
        precio = pprecio;
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

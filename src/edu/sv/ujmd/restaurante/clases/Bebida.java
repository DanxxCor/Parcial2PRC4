/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.restaurante.clases;

import edu.sv.ujmd.restaurante.conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author reyee
 */
public class Bebida {
    
    
    private String VistaBebidas = "select * from restaurante.vistabebidas";
    private int Columnas = 0;
    private Connection cnn;
    
    public Bebida() {
        cnn = Conexion.Conectar();
    } 
    
    public String getVistaBebidas() {
        return VistaBebidas;
    }

    public void setVistaBebidas(String vistaBebidas) {
        this.VistaBebidas = vistaBebidas;
    }
    
    public ResultSet llenarComboBebida() {
          ResultSet rs = null;
          Statement smt = null;
        try {
            Connection cnn;
            cnn = Conexion.Conectar();
            smt = cnn.createStatement();
            rs= smt.executeQuery(getVistaBebidas());
        } catch (SQLException ex) {
            Logger.getLogger(Bebida.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public DefaultTableModel CargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            Connection cnn;
            cnn = Conexion.Conectar();
            Statement smt = cnn.createStatement();
            ResultSet rs = smt.executeQuery(getVistaBebidas());
            ResultSetMetaData md = rs.getMetaData();
            int columnas = md.getColumnCount();
            for (int i = 1; i <= columnas; i++) {
                modelo.addColumn(md.getColumnLabel(i));
            }
            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
                fila = null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Alimentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
}

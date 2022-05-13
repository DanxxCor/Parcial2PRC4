/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.restaurante.clases;

import edu.sv.ujmd.restaurante.conexion.Conexion;
import java.sql.CallableStatement;
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
public class Factura {
    
    // Atributos privados
    private String Insertar = "CALL InsertarDatos(?,?,?)";
    private String Modificar = "CALL ModificarDatos(?,?,?)";
    private String Eliminar = "CALL BorrarDatos(?)";
    private String ObtenerPrecioAliPorId = "CALL BuscarPrecioAliPorId(?,?)";
    private String vistaFactura = "select * from restaurante.vistafactura";
    
    private int Columnas = 0;
    private Connection cnn;

    public Factura() {
        cnn = Conexion.Conectar();
    }  

    public String getInsertar() {
        return Insertar;
    }

    public void setInsertar(String Insertar) {
        this.Insertar = Insertar;
    }

    public String getModificar() {
        return Modificar;
    }

    public void setModificar(String Modificar) {
        this.Modificar = Modificar;
    }

    public String getEliminar() {
        return Eliminar;
    }

    public void setEliminar(String Eliminar) {
        this.Eliminar = Eliminar;
    }

    public String getvistaFactura() {
        return vistaFactura;
    }

    public void setvistaFactura(String vistaFactura) {
        this.vistaFactura = vistaFactura;
    }

    public String getObtenerPrecioAliPorId() {
        return ObtenerPrecioAliPorId;
    }

    public void setObtenerPrecioAliPorId(String ObtenerPrecioAliPorId) {
        this.ObtenerPrecioAliPorId = ObtenerPrecioAliPorId;
    }

    public ResultSet llenarComboFactura() {
          ResultSet rs = null;
          Statement smt = null;
        try {
            Connection cnn;
            cnn = Conexion.Conectar();
            smt = cnn.createStatement();
            rs= smt.executeQuery(getvistaFactura());
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public DefaultTableModel CargarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            Connection cnn;
            cnn = Conexion.Conectar();
            Statement smt = cnn.createStatement();
            ResultSet rs = smt.executeQuery(getvistaFactura());
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
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    public String ObtenerPrecioAliPorId(int id_alimento
    ){
        String resultado;
        try {         
            CallableStatement cmst = cnn.prepareCall(getObtenerPrecioAliPorId());
            cmst.setInt(1, id_alimento);

            
            cmst.execute();
            resultado = " Los datos se cargaron exitosamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }
    public String IngresarDatos(int id_alimento, 
            int id_bebida, 
            double subtotal 
            ) {
        String resultado;
        try {         
            CallableStatement cmst = cnn.prepareCall(getInsertar());
            cmst.setInt(1, id_alimento);
            cmst.setInt(2, id_bebida);
            cmst.setDouble(3, subtotal);
            
            cmst.execute();
            resultado = " Los datos se ingresaron exitosamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            resultado = " No se realizo la operacion " + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = " No se realizo la operacion " + ex.getMessage();
        }
        return resultado;
    }
    
    public String ModificarDatos(int id_Factura, int id_Alimento, int idBebida, float subtotal) {
        String resultado;
        try {
            cnn = Conexion.Conectar();
            CallableStatement cmst = cnn.prepareCall(getModificar());
            cmst.setInt(1, id_Factura);
            cmst.setInt(2, id_Alimento);
            cmst.setInt(3, idBebida);
            cmst.setFloat(4, subtotal);
            cmst.execute();
            resultado = "Los datos se modificaron correctamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }

    public String EliminarDatos(int id_Factura) {
        String resultado;
        try {
            cnn = Conexion.Conectar();
            CallableStatement cmst = cnn.prepareCall(getEliminar());
            cmst.setInt(1, id_Factura);
            cmst.execute();
            resultado = "Los datos se eliminaron correctamente !!!";
            cnn.close();
        } catch (SQLException sqlex) {
            System.out.println(sqlex.getMessage());
            resultado = "No se realizo la operacion" + sqlex.getMessage();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            resultado = "No se realizo la operacion" + ex.getMessage();
        }
        return resultado;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.sv.ujmd.restaurante.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author reyee
 */
public class CargarPropiedades {

    public static Properties prop = new Properties();
    InputStream is = null;

    public CargarPropiedades() throws IOException {
        leerPropiedades();
    }

    public static Properties getProp() {
        return prop;
    }

    public static void setProp(Properties prop) {
        CargarPropiedades.prop = prop;
    }

    public void leerPropiedades() throws FileNotFoundException, IOException {
        //is = new FileInputStream(System.getProperty("user.dir") + "\\src\\propiedades\\propiedades.properties");   
        is = new FileInputStream(System.getProperty("user.dir") + "\\configuraciones.properties");
        prop.load(is);
    }
}

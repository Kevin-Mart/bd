/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobasesdatos.Conexion.database;

import java.sql.Connection;
import java.sql.DriverManager;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author pc
 */
public class DatabaseUtil {
    
    public Connection conexionBaseDeDatos() throws Exception {
            DriverManager.registerDriver(new OracleDriver());
           return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","MI_USUARIO","admin123");
    }
}

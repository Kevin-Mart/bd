/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobasesdatos.Conexion;

import com.mycompany.proyectobasesdatos.Conexion.database.DatabaseUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;


/**
 *
 * @author pc
 */
public class Conexion {
    
    
    
    
    
    public static void main(String[] args) {
        
        Statement st;
        ResultSet rs;
        DatabaseUtil db = new DatabaseUtil();        
        try {
            Connection cn = db.conexionBaseDeDatos();
            st= cn.createStatement();
            rs=st.executeQuery("Select * from usuario");
            
            while(rs.next()){
                System.out.println("ID " + rs.getInt("ID")+" nombre: " + rs.getString("NOMBRE"));
            }
            cn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    
    
}

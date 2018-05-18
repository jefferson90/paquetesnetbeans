/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.Senaadsi1.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jeffe
 */
public class conexion {
    Connection Conectar()throws  SQLException{
        Connection conexion=null;
        String url="jdbc:mysql://localhost:3306/mydb?zeroDateTimeBehavior=convertToNull";
        
        try{
            conexion = (Connection) DriverManager.getConnection(url,"root","12345");
            
            
        } catch (SQLException sqle){
            throw sqle;
            
        }
            return conexion;
        }
}



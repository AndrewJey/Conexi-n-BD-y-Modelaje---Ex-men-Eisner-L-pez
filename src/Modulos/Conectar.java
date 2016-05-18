/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eisne
 */
public class Conectar {

    Connection conect = null;
    String userDB = "postgres";
    String passDB = "123";

    public Connection conexion() {
        try {
            String Estado = "";
  
            Class.forName("org.postgresql.Driver");
            
            conect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ExamenArchivos", userDB, passDB);
            Estado = "Conexion Establecida";
            System.out.println(Estado);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null, "Error de conexion" + e);
        }
        return conect;
    }
}
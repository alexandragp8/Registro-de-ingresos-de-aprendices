/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author alexandragonzalez
 */
public class Conexion {
    String url = "nuevaBasedatos.db";
    Connection conexion;
    
    public Connection conectar(){
        try{
            conexion=DriverManager.getConnection("jdbc:sqlite:"+ url);
            if(conexion!=null){
                return conexion;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public void cerrarConexion (){
        try {
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error", ex.getMessage(),JOptionPane.ERROR_MESSAGE);
        }
    }
    
}


package modelo.conexion;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;


public class UsuarioCAD {
    Conexion con = new Conexion();//Instanciar el objeto de la clase Conexion
    
    //no se importa porque estan en el mismo paquete
    public  String acceder (Usuario u) {
        
        try {
            String sql= "SELECT * FROM tb_usuario WHERE usuario=? AND clave=?"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,u.getUsuario());
            ps.setString(2,u.getClave());
            ResultSet d = ps.executeQuery();
            if(d.next()){
                String n=d.getString("nombre");
                con.cerrarConexion();
                return n;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return "";
    }
    
    public  boolean registrar(Usuario u) {
        
        try {
            String sql= "insert into tb_usuario(nombre,usuario,clave) values(?,?,?)"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,u.getNombre());
            ps.setString(2,u.getUsuario());
            ps.setString(3,u.getClave());
            int respuesta = ps.executeUpdate();
            if(respuesta>0){
                con.cerrarConexion();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return false;
    }
    public  boolean eliminar(Usuario u) {
        
        try {
            String sql= "delete from tb_usuario where usuario=?"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,u.getUsuario());
            int respuesta = ps.executeUpdate();
            if(respuesta>0){
                con.cerrarConexion();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return false;
    }
    
    public  Usuario consultar (Usuario u) {
        
        try {
            String sql= "SELECT * FROM tb_usuario WHERE usuario=?"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,u.getUsuario());
            ResultSet d = ps.executeQuery();
            if(d.next()){
                u.setNombre(d.getString("nombre"));
                u.setClave(d.getString("clave"));
                con.cerrarConexion();
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.RegistroIngreso;

/**
 *
 * @author alexandragonzalez
 */
public class RegistroIngresoCAD {
    
     Conexion con = new Conexion();//Instanciar el objeto de la clase Conexion

    public boolean guardar(RegistroIngreso registroIngreso) {
        
        try {
            String sql= "insert into tb_registroIngreso(nombre,apellido,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,edad,fecha) values(?,?,?,?,?,?,?,?,?,?,?)"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,registroIngreso.getNombre());
            ps.setString(2,registroIngreso.getApellido());
            ps.setString(3,registroIngreso.getHoraEntrada());
            ps.setString(4,registroIngreso.getHoraLlegada());
            ps.setString(5,registroIngreso.getHoraSalida());
            ps.setString(6,registroIngreso.getObservaciones());
            ps.setString(7,registroIngreso.getNombreInstructor());
            ps.setString(8,registroIngreso.getSexo());
            ps.setString(9,registroIngreso.getNombreCurso());
            ps.setString(10,registroIngreso.getEdad());
            ps.setString(11,registroIngreso.getFecha());

            
            int respuesta = ps.executeUpdate();
                        
            if(respuesta>0){
                con.cerrarConexion();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroIngresoCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return false;

    }
     
    public  boolean eliminar(RegistroIngreso registroIngreso) {
        
        try {
            String sql= "delete from tb_registroIngreso where nombre=? and fecha=? ";
                    //+ "and apellido=? and nombreCurso=? and fecha=?"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,registroIngreso.getNombre());
            /*ps.setString(2,registroIngreso.getApellido());
            ps.setString(3,registroIngreso.getNombreCurso());*/
            ps.setString(2,registroIngreso.getFecha());
            int respuesta = ps.executeUpdate();
            if(respuesta>0){
                con.cerrarConexion();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroIngresoCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return false;
    }
     
    public  RegistroIngreso consultar (RegistroIngreso registroIngreso) {
        
        try {
            String sql= "SELECT * FROM tb_registroIngreso where nombre=? and apellido=? and fecha=?"; //HACE LA CONSULTA A LA BASE DE DATOS
            
            
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,registroIngreso.getNombre());
            ps.setString(2,registroIngreso.getApellido());
            ps.setString(3,registroIngreso.getFecha());
            ResultSet d = ps.executeQuery();
            if(d.next()){
                
                registroIngreso.setEdad(d.getString("edad"));
                registroIngreso.setSexo(d.getString("sexo"));
                registroIngreso.setNombreCurso(d.getString("nombreCurso"));
                registroIngreso.setNombreInstructor(d.getString("nombreInstructor"));
                registroIngreso.setHoraEntrada(d.getString("horaEntrada"));
                registroIngreso.setHoraLlegada(d.getString("horaLlegada"));
                registroIngreso.setHoraSalida(d.getString("horaSalida"));
                registroIngreso.setObservaciones(d.getString("observaciones"));
                

                con.cerrarConexion();
                return registroIngreso;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroIngresoCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return null;
    }
    
    public List listarRegistros(){
        
        List listaRegistros = new ArrayList<RegistroIngreso>(); // Declaracion de la variable - Inicializa lista
        
        try {
            Connection c=con.conectar();
            String sql= "select * from tb_registroIngreso";      
            PreparedStatement ps=c.prepareStatement(sql);  
            ResultSet respuesta = ps.executeQuery();
            
            while (respuesta.next()) {
                String nombre = respuesta.getString("nombre");
                String apellido = respuesta.getString("apellido"); 
                String edad = respuesta.getString("edad");
                String horaEntrada = respuesta.getString("horaEntrada");
                String horaLlegada = respuesta.getString("horaLlegada");
                String horaSalida = respuesta.getString("horaSalida");
                String observaciones = respuesta.getString("observaciones");
                String nombreInstructor = respuesta.getString("nombreInstructor");
                String sexo = respuesta.getString("sexo");
                String nombreCurso = respuesta.getString("nombreCurso");
                String fecha = respuesta.getString("fecha");
                System.out.println(nombre+":"+apellido+":"+edad+":"+horaEntrada+":"+horaLlegada+":"+horaSalida+":"+observaciones+":"+nombreInstructor+":"+sexo+":"+nombreCurso+":"+fecha);

                RegistroIngreso registroIngreso = new RegistroIngreso(nombre,apellido,edad,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,fecha);
                
                listaRegistros.add(registroIngreso);
                
            }

            
            /*if(respuesta>0){
                con.cerrarConexion();
                return listaRegistros;
            }*/
        } catch (SQLException ex) {
            Logger.getLogger(RegistroIngresoCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return listaRegistros;
    }

    public vista.RegistroIngreso consultar(vista.RegistroIngreso registroIngreso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean editar(RegistroIngreso registroIngreso) {
            
        try {
            String sql= "update tb_registroIngreso set nombre=?,apellido=?,horaEntrada=?,horaLlegada=?,horaSalida=?,observaciones=?,nombreInstructor=?,sexo=?,nombreCurso=?,edad=?,fecha=? where nombre=? and apellido=? and fecha=?";
            Connection c=con.conectar();
            PreparedStatement ps=c.prepareStatement(sql);
            ps.setString(1,registroIngreso.getNombre());
            ps.setString(2,registroIngreso.getApellido());
            ps.setString(3,registroIngreso.getHoraEntrada());
            ps.setString(4,registroIngreso.getHoraLlegada());
            ps.setString(5,registroIngreso.getHoraSalida());
            ps.setString(6,registroIngreso.getObservaciones());
            ps.setString(7,registroIngreso.getNombreInstructor());
            ps.setString(8,registroIngreso.getSexo());
            ps.setString(9,registroIngreso.getNombreCurso());
            ps.setString(10,registroIngreso.getEdad());
            ps.setString(11,registroIngreso.getFecha());
            ps.setString(12,registroIngreso.getNombre());
            ps.setString(13,registroIngreso.getApellido());
            ps.setString(14,registroIngreso.getFecha());


            
            int respuesta = ps.executeUpdate();
                        
            if(respuesta>0){
                con.cerrarConexion();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroIngresoCAD.class.getName()).log(Level.SEVERE, null, ex);
        }
        con.cerrarConexion();
        return false;

    }

   
}

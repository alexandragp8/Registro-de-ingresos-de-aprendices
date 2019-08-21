/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.RegistroIngreso;
import modelo.conexion.RegistroIngresoCAD;

/**
 *
 * @author alexandragonzalez
 */
public class ControladorRegistroIngreso {
    
    RegistroIngresoCAD registroIngresoCAD;
    
    public ControladorRegistroIngreso(){
        
    registroIngresoCAD = new RegistroIngresoCAD();
        
    }
    

    public void registrar(String nombre, String apellido, String edad, String horaEntrada, String horaLlegada, String horaSalida, String observaciones, String nombreInstructor, String sexo, String nombreCurso, String fecha) {
        
        RegistroIngreso registroIngreso = new RegistroIngreso(nombre,apellido,edad,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,fecha);
        registroIngresoCAD.guardar(registroIngreso);

        
    }
    
    public List<RegistroIngreso> listar(){
        return registroIngresoCAD.listarRegistros();
    }

    public void eliminar(String nombre, String apellido, String nombreCurso, String fecha) {
        RegistroIngreso registroIngreso = new RegistroIngreso(nombre,apellido,nombreCurso,fecha);
        registroIngresoCAD.eliminar(registroIngreso);
    }

    public RegistroIngreso consultar(String nombre, String apellido, String fecha) {
        RegistroIngreso registroIngreso = new RegistroIngreso();
        registroIngreso.setNombre(nombre);
        registroIngreso.setApellido(apellido);
        registroIngreso.setFecha(fecha);
        
        return registroIngresoCAD.consultar(registroIngreso);
    }

    public void editar(String nombre, String apellido, String edad, String horaEntrada, String horaLlegada, String horaSalida, String observaciones, String nombreInstructor, String sexo, String nombreCurso, String fecha) {
        
        RegistroIngreso registroIngreso = new RegistroIngreso(nombre,apellido,edad,horaEntrada,horaLlegada,horaSalida,observaciones,nombreInstructor,sexo,nombreCurso,fecha);
        registroIngresoCAD.editar(registroIngreso);

    }
    
    
}

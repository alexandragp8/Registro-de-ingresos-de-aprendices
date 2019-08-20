/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alexandragonzalez
 */
public class RegistroIngreso {
    
       private String nombre;
       private String apellido;
       private String edad;
       private String horaEntrada;
       private String horaLlegada;
       private String horaSalida;
       private String observaciones;
       private String nombreInstructor;
       private String sexo;
       private String nombreCurso;
       private String fecha;

    public RegistroIngreso(String nombre, String apellido, String edad, String horaEntrada, String horaLlegada, String horaSalida, String observaciones, String nombreInstructor, String sexo, String nombreCurso, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.horaEntrada = horaEntrada;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.observaciones = observaciones;
        this.nombreInstructor = nombreInstructor;
        this.sexo = sexo;
        this.nombreCurso = nombreCurso;
        this.fecha = fecha;
    }

    public RegistroIngreso(String nombre, String apellido, String nombreCurso, String fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCurso = nombreCurso;
        this.fecha = fecha;

    }

    public RegistroIngreso() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getFecha() {
           return fecha;
      
    }
      
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}

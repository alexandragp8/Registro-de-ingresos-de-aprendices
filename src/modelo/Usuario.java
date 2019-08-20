
package modelo;

public class Usuario {
    private  String usuario; 
    private String nombre;
    private String clave; 
    //NECESITA CONSTRUCTOR !!!!! 

    public Usuario() {
    }

    public Usuario(String nombre,String usuario,  String clave) { //constructor
        this.usuario = usuario;
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
}

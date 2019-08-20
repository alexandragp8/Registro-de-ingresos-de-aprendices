/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Usuario;
import modelo.conexion.UsuarioCAD;

/**
 *
 * @author alexandragonzalez
 */
public class ControladorLogin { //clase

    UsuarioCAD usuarioCAD; //atributo

    public ControladorLogin() { //constructor

        usuarioCAD = new UsuarioCAD();
    }

    public boolean autenticar(String usuario, String clave) {

        Usuario u = new Usuario(); //LLENANDO EL MODELO CON LOS DATOS RECIVIDOS
        u.setUsuario(usuario);
        u.setClave(clave);
        String respuesta = usuarioCAD.acceder(u);
        if (!respuesta.equals("")) {
            return true;
        } else {
            return false;
        }
    }

}

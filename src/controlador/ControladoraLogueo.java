/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Empresa;
import modelo.Usuario;

/**
 *
 * @author cristian
 */
public class ControladoraLogueo {
    Empresa em;
    
    public ControladoraLogueo(Empresa empresa) {
        this.em = empresa;
    }
    
    public Usuario usuarioLogueado(String usuario, String clave) throws NullPointerException, Exception{
        Usuario u = this.em.buscarUsuario(usuario);
        if(!u.claveCorrecta(clave))
            throw new Exception("Contraseña incorrecta!");
        return u;
    }
}

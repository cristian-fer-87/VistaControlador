/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.Empresa;
import modelo.NivelDeUsario;
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
    public List<Usuario>getUsuarios(){
        return this.em.getUsuarios();
    }
    public Usuario usuarioLogueado(String usuario, String clave) throws NullPointerException, Exception{
        Usuario u = this.em.buscarUsuario(usuario);
        if(!u.claveCorrecta(clave))
            throw new Exception("Contraseña incorrecta!");
        return u;
    }
    
    public void nuevoUsuario(String nombre, String nombreUsuario, String clave, NivelDeUsario nivel) throws Exception{
        if(nombre == null || nombreUsuario == null || clave == null)
            throw new Exception("Todos los campos son obigatorios");
        else
            if(this.em.buscarUsuario(nombreUsuario)!= null)
                throw new Exception("Ya existe un usuario con ese nombre");
        
        Usuario usuario = new Usuario(nombre, nombreUsuario, clave);
        usuario.setNivel(nivel);
        this.em.getUsuarios().add(usuario);
    }
    
    public void borrarUsuario(String nombreUsuario) throws Exception{
        Usuario usuario = this.em.buscarUsuario(nombreUsuario);
        if(usuario == null)
            throw new Exception("No se ha encontrado el usuario");
        this.em.getUsuarios().remove(usuario);
    }
}

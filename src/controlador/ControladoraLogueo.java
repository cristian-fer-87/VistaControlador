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
    public Usuario buscarUsuario(String nombreUsuario){
        return this.em.buscarUsuario(nombreUsuario);
    }
    public void nuevoUsuario(String nombre, String nombreUsuario, String clave, NivelDeUsario nivel) throws Exception{
        if(nombre.equals("") || nombreUsuario.equals("") || clave.equals(""))
            throw new Exception("Todos los campos son obigatorios");
        else
            if(this.em.buscarUsuario(nombreUsuario)!= null)
                throw new Exception("Ya existe un usuario con ese nombre");
        this.em.nuevoUsuario(nombre, nombreUsuario, clave, nivel);
    }
    
    public void borrarUsuario(String nombreUsuario) throws Exception{
        if(this.em.buscarUsuario(nombreUsuario) == null)
            throw new Exception("No se ha encontrado el usuario");
        this.em.borrarUsuario(nombreUsuario);
    }
    
    public void editarUsuario(String nombre, String nombreUsuario, String clave, NivelDeUsario nivel) throws Exception{
       if(nombre.equals("") || nombreUsuario.equals("") || clave.equals(""))
            throw new Exception("Todos los campos son obigatorios");
        else
            if(this.em.buscarUsuario(nombreUsuario)!= null)
                this.em.editarUsuario(nombre, nombreUsuario, clave, nivel);
            else
                throw new Exception("El usuario no existe");
    }
    public List<Usuario> buscarUsuarios(String nombre){
        return this.em.buscarUsuarios(nombre);
    }
}

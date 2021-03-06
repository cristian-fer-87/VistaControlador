/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sistemate
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private List<Usuario> usuarios;
    private List<NivelDeUsario> nivelesDeUsuario;

    public Empresa(String nombre, String direccion, List<Usuario> usuarios) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.usuarios = usuarios;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<NivelDeUsario> getNivelesDeUsuario() {
        return nivelesDeUsuario;
    }

    public void setNivelesDeUsuario(List<NivelDeUsario> nivelesDeUsuario) {
        this.nivelesDeUsuario = nivelesDeUsuario;
    }
    
    public Usuario buscarUsuario(String usuario) /*throws Exception*/{
        Usuario u = null;
        for (Usuario us : usuarios) {
            if(us.getUsuario().equals(usuario)){
                u=us;
                break;
            }
        }
        return u;
    }
    public void nuevoUsuario(String nombre, String nombreUsuario, String clave, NivelDeUsario nivel){
         Usuario usuario = new Usuario(nombre, nombreUsuario, clave);
        usuario.setNivel(nivel);
        this.usuarios.add(usuario);
    }
    
    public void editarUsuario(String nombre, String nombreUsuario, String clave, NivelDeUsario nivel){
        Usuario usuario = this.buscarUsuario(nombreUsuario);
        usuario.setClave(clave);
        usuario.setNombre(nombre);
        usuario.setNivel(nivel);
    }
    
    public void borrarUsuario(String nombreUsuario){
        Usuario usuario = this.buscarUsuario(nombreUsuario);
        this.usuarios.remove(usuario);
    }
    
    public List<Usuario> buscarUsuarios(String nombre) /*throws Exception*/{
        List<Usuario> us = new LinkedList<>();
        for (Usuario u : this.usuarios) {
            if(u.getNombre().indexOf(nombre) != -1)
                us.add(u);
        }
        return us;
    }
}
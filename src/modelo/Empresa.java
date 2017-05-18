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
 * @author cristian
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private List<Usuario> usuarios;

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
    
    public Usuario buscarUsuario(String usuario) /*throws Exception*/{
        Usuario u = null;
        for (Usuario us : usuarios) {
            if(us.getUsuario().equals(usuario)){
                u=us;
                break;
            }
        }
        //if(u == null) throw new Exception("El Usuario no existe!");
        return u;
    }
}

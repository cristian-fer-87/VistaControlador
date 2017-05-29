/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.Empresa;
import modelo.NivelDeUsario;
import modelo.Usuario;
import vista.Login;

/**
 *
 * @author sistemate
 */
public class ControladoraPrincipal {
    
    private Empresa empresa;
    private ControladoraLogueo cLogueo;
    
    public ControladoraPrincipal() {
        Usuario usuario;
        List<Usuario> usuarios;
        NivelDeUsario nivel1 = new NivelDeUsario("nivel 1", 1);
        NivelDeUsario nivel2 = new NivelDeUsario("nivel 2", 2);
        NivelDeUsario nivel3 = new NivelDeUsario("nivel 3", 3);
        List<NivelDeUsario> niveles = new LinkedList<>();
        usuario = new Usuario("Cristian", "cristian", "1234");
        usuario.setNivel(nivel1);
        usuarios = new LinkedList();
        usuarios.add(usuario);
        empresa = new Empresa("Sistemate", "direccion", usuarios);
        niveles.add(nivel1);
        niveles.add(nivel2);
        niveles.add(nivel3);
        empresa.setNivelesDeUsuario(niveles);
        cLogueo = new ControladoraLogueo(empresa);
    }

    public ControladoraLogueo getcLogueo() {
        return cLogueo;
    }
    public List<NivelDeUsario> getNiveles(){
        return this.empresa.getNivelesDeUsuario();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladoraPrincipal cp = new ControladoraPrincipal();
        Login login = new Login(cp);
        login.setVisible(true);
    }
}

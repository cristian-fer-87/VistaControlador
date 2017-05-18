/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.Empresa;
import modelo.Usuario;
import vista.Login;

/**
 *
 * @author cristian
 */
public class ControladoraPrincipal {
    private Usuario usuario;
    private List<Usuario> usuarios;
    private Empresa empresa;
    
    public ControladoraPrincipal() {
        usuario = new Usuario("Cristian", "cristian", "1234");
        usuarios = new LinkedList();
        usuarios.add(usuario);
        empresa = new Empresa("Sistemate", "direccion", usuarios);
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

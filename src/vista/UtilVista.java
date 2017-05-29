/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author cristian
 */
public abstract class UtilVista {
        public static void cargarCombo (List<?> miLista, JComboBox cmbCombo){
        DefaultComboBoxModel miCombo = new DefaultComboBoxModel();
        if(miLista != null){
            miCombo.addElement("[SELECCIONAR]");
            for (Object object : miLista) {
                miCombo.addElement(object); 
          }
          cmbCombo.setModel(miCombo);
        }
    }
}

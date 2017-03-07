/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import vue.VueMenuGeneral;

/**
 *
 * @author Windows 8.1
 */
public class CtrlMenuGeneral implements WindowListener, ActionListener {

      private VueMenuGeneral vue;         // LA VUE
      private CtrlPrincipal ctrlPrincipal;

      
      //Methode de la classe
    public VueMenuGeneral getVue() {
        return vue;
    }

    public void setVue(VueMenuGeneral vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }
    
    
      //Controlleur de la classe

    public CtrlMenuGeneral(VueMenuGeneral vue, CtrlPrincipal ctrlPrincipal) {
        this.vue = vue;
        this.ctrlPrincipal = ctrlPrincipal;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjButtonVisiteursMP().addActionListener(this);
        // préparer l'état iniitial de la vue
        //afficherLesVisiteur();
    }
    
      
      
    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vue.getjButtonVisiteursMP()) ){
                ctrlPrincipal.afficherLesVisiteur();
                System.out.println("ok");
            }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import javax.swing.JOptionPane;

/**
 *
 * @author Windows 8.1
 */
public class CtrlPrincipal {
    
    CtrlVisiteur ctrlVisiteur; 
    
     public void afficherLesVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
        ;
    }
    
    
}

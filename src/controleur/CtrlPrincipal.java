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
    CtrlMenuGeneral ctrlMenuGeneral;
    
     public void afficherLesVisiteur() {
        this.ctrlVisiteur.getVue().setVisible(true);
        this.ctrlMenuGeneral.getVue().setVisible(false);
    }
     
     public void afficherMenuPrincipal(){
        this.ctrlVisiteur.getVue().setVisible(false);
        this.ctrlMenuGeneral.getVue().setVisible(true);
     }
     
     public void quitterApplication() {
        // Confirmer avant de quitter
        int rep = JOptionPane.showConfirmDialog(null, "Quitter l'application\nEtes-vous sûr(e) ?", "GSB", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (rep == JOptionPane.YES_OPTION) {
            // mettre fin à l'application
            System.exit(0);
        }
        
        
    
}

    public CtrlVisiteur getCtrlVisiteur() {
        return ctrlVisiteur;
    }

    public void setCtrlVisiteur(CtrlVisiteur ctrlVisiteur) {
        this.ctrlVisiteur = ctrlVisiteur;
    }

    public CtrlMenuGeneral getCtrlMenuGeneral() {
        return ctrlMenuGeneral;
    }

    public void setCtrlMenuGeneral(CtrlMenuGeneral ctrlMenuGeneral) {
        this.ctrlMenuGeneral = ctrlMenuGeneral;
    }
    
    
}

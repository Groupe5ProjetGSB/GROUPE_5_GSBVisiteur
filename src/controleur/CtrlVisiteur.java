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
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import modele.metier.Visiteur;
import vue.VueVisiteur;

/**
 *
 * @author Windows 8.1
 */
public class CtrlVisiteur implements WindowListener, ActionListener{
    
      private VueVisiteur vue;         // LA VUE
      private CtrlPrincipal ctrlPrincipal;
      
       public CtrlVisiteur(VueVisiteur vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjButtonVisiteur().addActionListener(this);
        // préparer l'état iniitial de la vue
        afficherLesVisiteur();
    }
       
       
       // méthodes publiques
    public final void afficherLesVisiteur() {
         List<Visiteur> lesVisiteurs = null;
        try {
            lesVisiteurs = DaoVisiteur.selectAll();
            getVue().getModeleTableClients().setRowCount(0);
            String[] titresColonnes = {"Nom", "Prénom", "Ddn"};
            getVue().getModeleTableClients().setColumnIdentifiers(titresColonnes);
            String[] ligneDonnees = new String[3];
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for (Client unClient : lesVisiteurs) {
                ligneDonnees[0] = unClient.getNom();
                ligneDonnees[1] = unClient.getPrenom();
                ligneDonnees[2] = sdf.format(unClient.getDateNaissance());
                getVue().getModeleTableClients().addRow(ligneDonnees);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesClients - échec de sélection des clients");
        }

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
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

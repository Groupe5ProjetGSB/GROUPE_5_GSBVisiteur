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
import modele.dao.DaoVisiteur;
import modele.metier.Visiteur;
import vue.VueVisiteur;

/**
 *
 * @author Windows 8.1
 */
public class CtrlVisiteur implements WindowListener, ActionListener {

    private VueVisiteur vue;         // LA VUE
    private CtrlPrincipal ctrlPrincipal;

    public VueVisiteur getVue() {
        return vue;
    }

    public void setVue(VueVisiteur vue) {
        this.vue = vue;
    }

    public CtrlPrincipal getCtrlPrincipal() {
        return ctrlPrincipal;
    }

    public void setCtrlPrincipal(CtrlPrincipal ctrlPrincipal) {
        this.ctrlPrincipal = ctrlPrincipal;
    }

    // Controlleur de la classe
    public CtrlVisiteur(VueVisiteur vue, CtrlPrincipal ctrl) {
        this.vue = vue;
        this.ctrlPrincipal = ctrl;
        // le contrôleur écoute la vue
        this.vue.addWindowListener(this);
        this.vue.getjButtonChercherVisiteur().addActionListener(this);
        this.vue.getjButtonFermer().addActionListener(this);
        this.vue.getjButtonPrecedent().addActionListener(this);
        this.vue.getjButtonSuivant().addActionListener(this);
        // préparer l'état iniitial de la vue
        afficherLesVisiteur();
    }

    public final void afficherLesVisiteur() {
        List<Visiteur> lesVisiteur = null;
        try {
            lesVisiteur = DaoVisiteur.selectAll();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            for (Visiteur unVisiteur : lesVisiteur) {
                getVue().getjComboBoxChercher().addItem(unVisiteur);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(getVue(), "CtrlLesClients - échec de sélection des clients");
        }
    }

    public final void afficherVueVisiteur() {
        Visiteur unVisiteur = (Visiteur) vue.getjComboBoxChercher().getSelectedItem();
        getVue().getjTextFieldNom().setText(unVisiteur.getNomVisiteur());
        getVue().getjTextFieldPrenom().setText(unVisiteur.getPrenomVisiteur());
        getVue().getjTextFieldAdresse().setText(unVisiteur.getAdresseVisiteur());
        getVue().getjTextFieldCp().setText(unVisiteur.getCpVisiteur());
        getVue().getjTextFieldNomVille().setText(unVisiteur.getVilleVisiteur());
    }

    private void quitter() {
        ctrlPrincipal.quitterApplication();
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
        quitter();
    }

    @Override
    public void windowClosed(WindowEvent we) {

    }

    @Override
    public void windowIconified(WindowEvent we) {

    }

    @Override
    public void windowDeiconified(WindowEvent we) {

    }

    @Override
    public void windowActivated(WindowEvent we) {

    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /* if (e.getSource().equals(vue.getjButtonVisiteur()) ){
                ctrlPrincipal.afficherLesVisiteur();
            }*/

        if (e.getSource().equals(vue.getjButtonChercherVisiteur())) {
            afficherVueVisiteur();
        }
        if (e.getSource().equals(vue.getjButtonPrecedent())) {
            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i - 1;

            if (z > -1) {
                vue.getjComboBoxChercher().setSelectedIndex(z);
                afficherVueVisiteur();
            }
        }
        if (e.getSource().equals(vue.getjButtonSuivant())) {

            int i = vue.getjComboBoxChercher().getSelectedIndex();
            int z = i + 1;

            if (z > i) {
                vue.getjComboBoxChercher().setSelectedIndex(z);
                afficherVueVisiteur();
            }

        }
    }
}

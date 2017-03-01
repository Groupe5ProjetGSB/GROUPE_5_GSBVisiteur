/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;

/**
 *
 * @author Dimitri
 */
public class Visiteur {

    private String vis_matricule;
    private String vis_nom;
    private String vis_adresse;
    private String vis_cp;
    private String vis_ville;
    private Date vis_dateEmbauche;
    private Secteur sec_code;
    private Labo Lab_code;

    public String getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(String vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public String getVis_nom() {
        return vis_nom;
    }

    public void setVis_nom(String vis_nom) {
        this.vis_nom = vis_nom;
    }

    public String getVis_adresse() {
        return vis_adresse;
    }

    public void setVis_adresse(String vis_adresse) {
        this.vis_adresse = vis_adresse;
    }

    public String getVis_cp() {
        return vis_cp;
    }

    public void setVis_cp(String vis_cp) {
        this.vis_cp = vis_cp;
    }

    public String getVis_ville() {
        return vis_ville;
    }

    public void setVis_ville(String vis_ville) {
        this.vis_ville = vis_ville;
    }

    public Date getVis_dateEmbauche() {
        return vis_dateEmbauche;
    }

    public void setVis_dateEmbauche(Date vis_dateEmbauche) {
        this.vis_dateEmbauche = vis_dateEmbauche;
    }

    public Secteur getSec_code() {
        return sec_code;
    }

    public void setSec_code(Secteur sec_code) {
        this.sec_code = sec_code;
    }

    public Labo getLab_code() {
        return Lab_code;
    }

    public void setLab_code(Labo Lab_code) {
        this.Lab_code = Lab_code;
    }

}

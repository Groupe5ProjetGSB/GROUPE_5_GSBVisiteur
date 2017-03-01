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
public class Travailler {

    private Date JJMMAA;

    private String vis_matricule;

    private String regCode;

    private String visiteur;

    private String tra_role;

    public Date getJJMMAA() {
        return JJMMAA;
    }

    public void setJJMMAA(Date JJMMAA) {
        this.JJMMAA = JJMMAA;
    }

    public String getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(String vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(String visiteur) {
        this.visiteur = visiteur;
    }

    public String getTra_role() {
        return tra_role;
    }

    public void setTra_role(String tra_role) {
        this.tra_role = tra_role;
    }

}

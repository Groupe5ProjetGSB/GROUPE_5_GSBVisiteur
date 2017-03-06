/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.List;
import java.util.Date;

/**
 *
 * @author Dimitri
 */
public class Travailler {

    private Date JJMMAA;

    private List<Visiteur> visiteurMatricule;

    private List<Region> codeRegion;

    private String roleTravailleur;

    public Travailler(Date JJMMAA, List<Visiteur> visiteurMatricule, List<Region> codeRegion, String roleTravailleur) {
        this.JJMMAA = JJMMAA;
        this.visiteurMatricule = visiteurMatricule;
        this.codeRegion = codeRegion;
        this.roleTravailleur = roleTravailleur;
    }
    
    

    public Date getJJMMAA() {
        return JJMMAA;
    }

    public void setJJMMAA(Date JJMMAA) {
        this.JJMMAA = JJMMAA;
    }

    public List<Visiteur> getVisiteurMatricule() {
        return visiteurMatricule;
    }

    public void setVisiteurMatricule(List<Visiteur> visiteurMatricule) {
        this.visiteurMatricule = visiteurMatricule;
    }

    public List<Region> getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(List<Region> codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getRoleTravailleur() {
        return roleTravailleur;
    }

    public void setRoleTravailleur(String roleTravailleur) {
        this.roleTravailleur = roleTravailleur;
    }

    
}

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
public class RapportVisite {

    private Visiteur matriculVisiteur;
    private Practicien numPracticien;
    private int numRapport;
    private Date dateRapport;
    private String motifRapport;
    private String bilanRapport;

    public RapportVisite(Visiteur matriculVisiteur, Practicien numPracticien, int numRapport, Date dateRapport, String motifRapport, String bilanRapport) {
        this.matriculVisiteur = matriculVisiteur;
        this.numPracticien = numPracticien;
        this.numRapport = numRapport;
        this.dateRapport = dateRapport;
        this.motifRapport = motifRapport;
        this.bilanRapport = bilanRapport;
    }

    public Visiteur getMatriculVisiteur() {
        return matriculVisiteur;
    }

    public void setMatriculVisiteur(Visiteur matriculVisiteur) {
        this.matriculVisiteur = matriculVisiteur;
    }

    public Practicien getNumPracticien() {
        return numPracticien;
    }

    public void setNumPracticien(Practicien numPracticien) {
        this.numPracticien = numPracticien;
    }

    public int getNumRapport() {
        return numRapport;
    }

    public void setNumRapport(int numRapport) {
        this.numRapport = numRapport;
    }

    public Date getDateRapport() {
        return dateRapport;
    }

    public void setDateRapport(Date dateRapport) {
        this.dateRapport = dateRapport;
    }

    public String getMotifRapport() {
        return motifRapport;
    }

    public void setMotifRapport(String motifRapport) {
        this.motifRapport = motifRapport;
    }

    public String getBilanRapport() {
        return bilanRapport;
    }

    public void setBilanRapport(String bilanRapport) {
        this.bilanRapport = bilanRapport;
    }

}

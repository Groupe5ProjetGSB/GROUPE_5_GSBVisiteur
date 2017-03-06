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

    private String matriculeVisiteur;
    private String nomVisiteur;
    private String adresseVisiteur;
    private String cpVisiteur;
    private String villeVisiteur;
    private Date dateEmbaucheVisiteur;
    private Secteur codeSecteur;
    private Labo codeLabo;

    public Visiteur(String matriculeVisiteur, String nomVisiteur, String adresseVisiteur, String cpVisiteur, String villeVisiteur, Date dateEmbaucheVisiteur) {
        this.matriculeVisiteur = matriculeVisiteur;
        this.nomVisiteur = nomVisiteur;
        this.adresseVisiteur = adresseVisiteur;
        this.cpVisiteur = cpVisiteur;
        this.villeVisiteur = villeVisiteur;
        this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
    }

    public Visiteur(String matriculeVisiteur, String nomVisiteur, String adresseVisiteur, String cpVisiteur, String villeVisiteur, Date dateEmbaucheVisiteur, Secteur codeSecteur, Labo codeLabo) {
        this.matriculeVisiteur = matriculeVisiteur;
        this.nomVisiteur = nomVisiteur;
        this.adresseVisiteur = adresseVisiteur;
        this.cpVisiteur = cpVisiteur;
        this.villeVisiteur = villeVisiteur;
        this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
        this.codeSecteur = codeSecteur;
        this.codeLabo = codeLabo;
    }

    
    
    
    public String getMatriculeVisiteur() {
        return matriculeVisiteur;
    }

    public void setMatriculeVisiteur(String matriculeVisiteur) {
        this.matriculeVisiteur = matriculeVisiteur;
    }

    public String getNomVisiteur() {
        return nomVisiteur;
    }

    public void setNomVisiteur(String nomVisiteur) {
        this.nomVisiteur = nomVisiteur;
    }

    public String getAdresseVisiteur() {
        return adresseVisiteur;
    }

    public void setAdresseVisiteur(String adresseVisiteur) {
        this.adresseVisiteur = adresseVisiteur;
    }

    public String getCpVisiteur() {
        return cpVisiteur;
    }

    public void setCpVisiteur(String cpVisiteur) {
        this.cpVisiteur = cpVisiteur;
    }

    public String getVilleVisiteur() {
        return villeVisiteur;
    }

    public void setVilleVisiteur(String villeVisiteur) {
        this.villeVisiteur = villeVisiteur;
    }

    public Date getDateEmbaucheVisiteur() {
        return dateEmbaucheVisiteur;
    }

    public void setDateEmbaucheVisiteur(Date dateEmbaucheVisiteur) {
        this.dateEmbaucheVisiteur = dateEmbaucheVisiteur;
    }

    public Secteur getCodeSecteur() {
        return codeSecteur;
    }

    public void setCodeSecteur(Secteur codeSecteur) {
        this.codeSecteur = codeSecteur;
    }

    public Labo getCodeLabo() {
        return codeLabo;
    }

    public void setCodeLabo(Labo codeLabo) {
        this.codeLabo = codeLabo;
    }

   

}

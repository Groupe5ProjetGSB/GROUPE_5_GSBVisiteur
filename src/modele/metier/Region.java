/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author Windows 8.1
 */
public class Region {
    
    private int codeRegion;
    
    private Secteur codeSecteur;
    
    private String nomRegion;

    public Region(int codeRegion, Secteur codeSecteur, String nomRegion) {
        this.codeRegion = codeRegion;
        this.codeSecteur = codeSecteur;
        this.nomRegion = nomRegion;
    }

    
    
    
    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public Secteur getCodeSecteur() {
        return codeSecteur;
    }

    public void setCodeSecteur(Secteur codeSecteur) {
        this.codeSecteur = codeSecteur;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }
    
    
    
}

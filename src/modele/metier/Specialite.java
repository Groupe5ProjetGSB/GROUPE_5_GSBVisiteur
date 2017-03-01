/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author Dimitri
 */
public class Specialite {

    private String spe_code;
    private String spe_libelle;

    public String getSpe_code() {
        return spe_code;
    }

    public void setSpe_code(String spe_code) {
        this.spe_code = spe_code;
    }

    public String getSpe_libelle() {
        return spe_libelle;
    }

    public void setSpe_libelle(String spe_libelle) {
        this.spe_libelle = spe_libelle;
    }

    public Specialite(String spe_code, String spe_libelle) {
        this.spe_code = spe_code;
        this.spe_libelle = spe_libelle;
    }

}

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
public class TypePraticien {

    private String typ_code;
    private String typ_libelle;
    private String typ_lieu;

    public String getTyp_code() {
        return typ_code;
    }

    public void setTyp_code(String typ_code) {
        this.typ_code = typ_code;
    }

    public String getTyp_libelle() {
        return typ_libelle;
    }

    public void setTyp_libelle(String typ_libelle) {
        this.typ_libelle = typ_libelle;
    }

    public String getTyp_lieu() {
        return typ_lieu;
    }

    public void setTyp_lieu(String typ_lieu) {
        this.typ_lieu = typ_lieu;
    }

    public TypePraticien(String typ_code, String typ_libelle, String typ_lieu) {
        this.typ_code = typ_code;
        this.typ_libelle = typ_libelle;
        this.typ_lieu = typ_lieu;
    }

    @Override
    public String toString() {
        return "TypePraticien{" + "typ_code=" + typ_code + ", typ_libelle=" + typ_libelle + ", typ_lieu=" + typ_lieu + '}';
    }

}

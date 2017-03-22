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
public class Practicien {

    private int numeroPracticien;
    private String nomPracticien;
    private String prenomPracticien;
    private String cpPracticien;
    private String villePracticien;
    private float coefNotorietePracticien;
    private TypePraticien codeTypePracticien;

    public Practicien(int numeroPracticien, String nomPracticien, String prenomPracticien, String cpPracticien, String villePracticien, float coefNotorietePracticien, TypePraticien codeTypePracticien) {
        this.numeroPracticien = numeroPracticien;
        this.nomPracticien = nomPracticien;
        this.prenomPracticien = prenomPracticien;
        this.cpPracticien = cpPracticien;
        this.villePracticien = villePracticien;
        this.coefNotorietePracticien = coefNotorietePracticien;
        this.codeTypePracticien = codeTypePracticien;
    }

    public int getNumeroPracticien() {
        return numeroPracticien;
    }

    public void setNumeroPracticien(int numeroPracticien) {
        this.numeroPracticien = numeroPracticien;
    }

    public String getNomPracticien() {
        return nomPracticien;
    }

    public void setNomPracticien(String nomPracticien) {
        this.nomPracticien = nomPracticien;
    }

    public String getPrenomPracticien() {
        return prenomPracticien;
    }

    public void setPrenomPracticien(String prenomPracticien) {
        this.prenomPracticien = prenomPracticien;
    }

    public String getCpPracticien() {
        return cpPracticien;
    }

    public void setCpPracticien(String cpPracticien) {
        this.cpPracticien = cpPracticien;
    }

    public String getVillePracticien() {
        return villePracticien;
    }

    public void setVillePracticien(String villePracticien) {
        this.villePracticien = villePracticien;
    }

    public float getCoefNotorietePracticien() {
        return coefNotorietePracticien;
    }

    public void setCoefNotorietePracticien(float coefNotorietePracticien) {
        this.coefNotorietePracticien = coefNotorietePracticien;
    }

    public TypePraticien getCodeTypePracticien() {
        return codeTypePracticien;
    }

    public void setCodeTypePracticien(TypePraticien codeTypePracticien) {
        this.codeTypePracticien = codeTypePracticien;
    }

}

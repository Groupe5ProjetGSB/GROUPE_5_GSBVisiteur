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

    private int pra_num;
    private String pra_nom;
    private String pra_prenom;
    private String pra_cp;
    private String pra_ville;
    private float pra_coefNotoriete;
    private TypePraticien typ_code;

    public int getPra_num() {
        return pra_num;
    }

    public void setPra_num(int pra_num) {
        this.pra_num = pra_num;
    }

    public String getPra_nom() {
        return pra_nom;
    }

    public void setPra_nom(String pra_nom) {
        this.pra_nom = pra_nom;
    }

    public String getPra_prenom() {
        return pra_prenom;
    }

    public void setPra_prenom(String pra_prenom) {
        this.pra_prenom = pra_prenom;
    }

    public String getPra_cp() {
        return pra_cp;
    }

    public void setPra_cp(String pra_cp) {
        this.pra_cp = pra_cp;
    }

    public String getPra_ville() {
        return pra_ville;
    }

    public void setPra_ville(String pra_ville) {
        this.pra_ville = pra_ville;
    }

    public float getPra_coefNotoriete() {
        return pra_coefNotoriete;
    }

    public void setPra_coefNotoriete(float pra_coefNotoriete) {
        this.pra_coefNotoriete = pra_coefNotoriete;
    }

    public TypePraticien getTyp_code() {
        return typ_code;
    }

    public void setTyp_code(TypePraticien typ_code) {
        this.typ_code = typ_code;
    }

}

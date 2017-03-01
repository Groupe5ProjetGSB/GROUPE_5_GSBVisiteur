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
public class Medicament {

    private String med_depotLegal;
    private Famille fam_code;
    private String med_nomCommercial;
    private String med_composition;
    private String med_effets;
    private String med_contreIndic;
    private float med_prixEchantillon;

    public Medicament(String med_depotLegal, Famille fam_code, String med_nomCommercial, String med_composition, String med_effets, String med_contreIndic, float med_prixEchantillon) {
        this.med_depotLegal = med_depotLegal;
        this.fam_code = fam_code;
        this.med_nomCommercial = med_nomCommercial;
        this.med_composition = med_composition;
        this.med_effets = med_effets;
        this.med_contreIndic = med_contreIndic;
        this.med_prixEchantillon = med_prixEchantillon;
    }

    public String getMed_depotLegal() {
        return med_depotLegal;
    }

    public void setMed_depotLegal(String med_depotLegal) {
        this.med_depotLegal = med_depotLegal;
    }

    public Famille getFam_code() {
        return fam_code;
    }

    public void setFam_code(Famille fam_code) {
        this.fam_code = fam_code;
    }

    public String getMed_nomCommercial() {
        return med_nomCommercial;
    }

    public void setMed_nomCommercial(String med_nomCommercial) {
        this.med_nomCommercial = med_nomCommercial;
    }

    public String getMed_composition() {
        return med_composition;
    }

    public void setMed_composition(String med_composition) {
        this.med_composition = med_composition;
    }

    public String getMed_effets() {
        return med_effets;
    }

    public void setMed_effets(String med_effets) {
        this.med_effets = med_effets;
    }

    public String getMed_contreIndic() {
        return med_contreIndic;
    }

    public void setMed_contreIndic(String med_contreIndic) {
        this.med_contreIndic = med_contreIndic;
    }

    public float getMed_prixEchantillon() {
        return med_prixEchantillon;
    }

    public void setMed_prixEchantillon(float med_prixEchantillon) {
        this.med_prixEchantillon = med_prixEchantillon;
    }

}

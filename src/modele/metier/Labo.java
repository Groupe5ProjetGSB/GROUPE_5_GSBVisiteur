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
public class Labo {

    private String lab_Code;

    private String lab_Nom;

    private String lab_ChefVente;

    public String getLab_Code() {
        return lab_Code;
    }

    public void setLab_Code(String lab_Code) {
        this.lab_Code = lab_Code;
    }

    public String getLab_Nom() {
        return lab_Nom;
    }

    public void setLab_Nom(String lab_Nom) {
        this.lab_Nom = lab_Nom;
    }

    public String getLab_ChefVente() {
        return lab_ChefVente;
    }

    public void setLab_ChefVente(String lab_ChefVente) {
        this.lab_ChefVente = lab_ChefVente;
    }

    public Labo(String lab_Code, String lab_Nom, String lab_ChefVente) {
        this.lab_Code = lab_Code;
        this.lab_Nom = lab_Nom;
        this.lab_ChefVente = lab_ChefVente;
    }

}

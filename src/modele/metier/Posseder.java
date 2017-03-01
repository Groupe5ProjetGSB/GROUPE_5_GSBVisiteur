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
public class Posseder {

    private int pra_num;
    private String spe_code;
    private String pos_diplome;
    private float pos_coefPrescription;

    public int getPra_num() {
        return pra_num;
    }

    public void setPra_num(int pra_num) {
        this.pra_num = pra_num;
    }

    public String getSpe_code() {
        return spe_code;
    }

    public void setSpe_code(String spe_code) {
        this.spe_code = spe_code;
    }

    public String getPos_diplome() {
        return pos_diplome;
    }

    public void setPos_diplome(String pos_diplome) {
        this.pos_diplome = pos_diplome;
    }

    public float getPos_coefPrescription() {
        return pos_coefPrescription;
    }

    public void setPos_coefPrescription(float pos_coefPrescription) {
        this.pos_coefPrescription = pos_coefPrescription;
    }

    public Posseder(int pra_num, String spe_code, String pos_diplome, float pos_coefPrescription) {
        this.pra_num = pra_num;
        this.spe_code = spe_code;
        this.pos_diplome = pos_diplome;
        this.pos_coefPrescription = pos_coefPrescription;
    }

}

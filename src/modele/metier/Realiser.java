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
public class Realiser {

    private int ac_num;
    private String vis_matricule;
    private float rea_mttfrais;

    public int getAc_num() {
        return ac_num;
    }

    public void setAc_num(int ac_num) {
        this.ac_num = ac_num;
    }

    public String getVis_matricule() {
        return vis_matricule;
    }

    public void setVis_matricule(String vis_matricule) {
        this.vis_matricule = vis_matricule;
    }

    public float getRea_mttfrais() {
        return rea_mttfrais;
    }

    public void setRea_mttfrais(float rea_mttfrais) {
        this.rea_mttfrais = rea_mttfrais;
    }

    public Realiser(int ac_num, String vis_matricule, float rea_mttfrais) {
        this.ac_num = ac_num;
        this.vis_matricule = vis_matricule;
        this.rea_mttfrais = rea_mttfrais;
    }

}

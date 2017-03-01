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
public class RapportVisite {

    private Stringg pre_code;
    private int rap_num;
    private Offrir pra_num;
    private Date rap_date;
    private String rap_motif;
    private String rap_bilan;

    public Stringg getPre_code() {
        return pre_code;
    }

    public void setPre_code(Stringg pre_code) {
        this.pre_code = pre_code;
    }

    public int getRap_num() {
        return rap_num;
    }

    public void setRap_num(int rap_num) {
        this.rap_num = rap_num;
    }

    public Offrir getPra_num() {
        return pra_num;
    }

    public void setPra_num(Offrir pra_num) {
        this.pra_num = pra_num;
    }

    public Date getRap_date() {
        return rap_date;
    }

    public void setRap_date(Date rap_date) {
        this.rap_date = rap_date;
    }

    public String getRap_motif() {
        return rap_motif;
    }

    public void setRap_motif(String rap_motif) {
        this.rap_motif = rap_motif;
    }

    public String getRap_bilan() {
        return rap_bilan;
    }

    public void setRap_bilan(String rap_bilan) {
        this.rap_bilan = rap_bilan;
    }

}

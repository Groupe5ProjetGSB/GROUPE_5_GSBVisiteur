/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modele.metier.Labo;
import modele.metier.Practicien;
import modele.metier.Secteur;
import modele.metier.Visiteur;

/**
 *
 * @author Dimitri
 */
public class DaoPracticien {

    public static List<Practicien> selectAll() throws SQLException {
        List<Practicien> lesPracticiens = new ArrayList<Practicien>();
        Practicien unPracticien = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM PRACTICIEN";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int numPracticien = rs.getInt("PRA_NUM");
            String nomPracticien = rs.getString("PRA_NOM");
            String prenomPracticien = rs.getString("PRA_PRENOM");
            String adressePracticien = rs.getString("PRA_ADRESSE");
            String cpPracticien = rs.getString("PRA_CP");
            float coefNotorietePracticien = rs.getFloat("PRA_COEFNOTORIETE");
            String codeType = rs.getString("TYP_CODE");

            /*Secteur unSecteur = DaoSecteur.selectOne(codeSecteur);
            Labo unLabo = DaoLabo.selectOne(codeLabo);
            unVisiteur = new Visiteur(matriculeVisiteur, nomVisiteur, prenomVisiteur, adresseVisiteur, cpVisiteur, villeVisiteur, dateEmbaucheVisiteur, unSecteur, unLabo);
            lesVisiteur.add(unVisiteur);*/
        }
        return lesPracticiens;
    }

}

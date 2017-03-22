/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.Practicien;
import modele.metier.Secteur;
import modele.metier.TypePraticien;

/**
 *
 * @author Dimitri
 */
public class DaoTypePracticien {

    public static TypePraticien selectOne(String codePratique) throws SQLException {
        TypePraticien unTypePraticien = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM TYPE_PRATICIEN WHERE TYP_CODE= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, codePratique);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String codeType = rs.getString("TYP_CODE");
            String libelleType = rs.getString("TYP_LIBELLE");
            String lieuType = rs.getString("TYP_LIEU");
            unTypePraticien = new TypePraticien(codeType, libelleType, lieuType);
        }
        return unTypePraticien;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.Labo;

/**
 *
 * @author Dimitri
 */
public class DaoLabo {

    public static Labo selectOne(String codeLabo) throws SQLException {
        Labo unLabo = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM LABO WHERE LAB_CODE= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, codeLabo);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String codeLab = rs.getString("LAB_CODE");
            unLabo = new Labo(codeLab);
        }
        return unLabo;

    }

}

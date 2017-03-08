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
import modele.metier.Secteur;

/**
 *
 * @author Dimitri
 */
public class DaoSecteur {

    public static Secteur selectOne() throws SQLException {
        Secteur unSecteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM LABO";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            String codeSecteur = rs.getString("SEC_CODE");
            unSecteur = new Secteur(codeSecteur);
        }
        return unSecteur;
    }

    public static Secteur selectOne(String codeSecteur) throws SQLException {
        Secteur unSecteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM SECTEUR WHERE SEC_CODE= ?";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        pstmt.setString(1, codeSecteur);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            int id = rs.getInt("ID");
            String rue = rs.getString("RUE");
            String cdp = rs.getString("CDP");
            String ville = rs.getString("VILLE");
            uneAdresse = new Adresse(id, rue, cdp, ville);
        }
        return unSecteur;

    }

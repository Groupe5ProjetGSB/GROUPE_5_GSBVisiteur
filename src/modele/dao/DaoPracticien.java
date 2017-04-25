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
import modele.metier.TypePraticien;
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
        String requete = "SELECT * FROM PRATICIEN";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();
        while (rs.next()) {
            int numPracticien = rs.getInt("PRA_NUM");
            String nomPracticien = rs.getString("PRA_NOM");
            String prenomPracticien = rs.getString("PRA_PRENOM");
            String adressePracticien = rs.getString("PRA_ADRESSE");
            String cpPracticien = rs.getString("PRA_CP");
            String villePraticien = rs.getString("PRA_VILLE");
            float coefNotorietePracticien = rs.getFloat("PRA_COEFNOTORIETE");
            String codeType = rs.getString("TYP_CODE");
            TypePraticien unTypePraticien = DaoTypePracticien.selectOne(codeType);

            unPracticien = new Practicien(numPracticien, nomPracticien, prenomPracticien, adressePracticien, cpPracticien, villePraticien, coefNotorietePracticien, unTypePraticien);
            lesPracticiens.add(unPracticien);
        }
        return lesPracticiens;
    }

    public static Practicien getOneByNum(int num) {
        Practicien unPraticien = null;

        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();

        //requête
        try {
            String requete = "SELECT * FROM PRATICIEN WHERE PRA_NUM = ?";
            pstmt = jdbc.getConnexion().prepareStatement(requete);
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            if(rs.next()){
                int numeroPraticien = rs.getInt("PRA_NUM");
                String nomPraticien = rs.getString("PRA_NOM");
                String prenomPraticien = rs.getString("PRA_PRENOM");
                String adressePraticien = rs.getString("PRA_ADRESSE");
                String cpPraticien = rs.getString("PRA_CP");
                String villePraticien = rs.getString("PRA_VILLE");
                float coefNotorietePraticien = rs.getFloat("PRA_COEFNOTORIETE");
                String codeType = rs.getString("TYP_CODE");
                //Methode pour récup le type praticien
                TypePraticien unTypePraticien = DaoTypePracticien.selectOne(codeType);
                unPraticien = new Practicien(numeroPraticien, nomPraticien, prenomPraticien, adressePraticien, cpPraticien, villePraticien, coefNotorietePraticien, unTypePraticien);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
        }
        
        return unPraticien;
    }

}

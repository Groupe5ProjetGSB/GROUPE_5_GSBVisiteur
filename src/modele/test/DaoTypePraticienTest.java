/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoSecteur;
import modele.dao.DaoTypePracticien;
import modele.dao.Jdbc;
import modele.metier.Secteur;
import modele.metier.TypePraticien;

/**
 *
 * @author Dimitri
 */
public class DaoTypePraticienTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        test0_Connexion();
        System.out.println("Test0 effectué : connexion\n");
        test1_SelectUnique("MH");
        System.out.println("Test1 effectué : sélection unique\n");
        if (cnx != null) {
            cnx.close();
        }

    }

    public static void test1_SelectUnique(String codePratique) throws SQLException {
        TypePraticien unTypePraticien = DaoTypePracticien.selectOne(codePratique);
        System.out.println("Le TypePracticien lus : " + unTypePraticien.toString());

    }

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "gsb@//localhost:1521/xe", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoVisiteur;
import modele.dao.Jdbc;
import modele.metier.Visiteur;

/**
 *
 * @author Dimitri
 */
public class DaoVisiteurTest {

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("com.mysql.jdbc.Driver", "jdbc:mysql://", "localhost/", "AGENCEB", "agenceb_util", "secret");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }

    public static void test1_SelectUnique() throws SQLException {
        List<Visiteur> desVisiteur = DaoVisiteur.selectAll();
        System.out.println("Les clients lus : " + desVisiteur.toString());

    }

}

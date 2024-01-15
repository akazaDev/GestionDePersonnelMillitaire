package actions.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AfficherListeEmployees {

    public static void afficherListeEmployees() {
        System.out.println("Afficher la liste des employés");
        String url = "jdbc:postgresql://localhost:5432/Base Millitaire";
        String utilisateur = "postgres";
        String motDePasse = "Epsilon94";

        // Connexion à la base de données et affichage de la liste des employés
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            // Requête SQL de sélection
            String sql = "SELECT * FROM personnel";

            try (PreparedStatement preparedStatement = connexion.prepareStatement(sql);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                // Traitement des résultats
                while (resultSet.next()) {
                    int numeroIdentification = resultSet.getInt("numero_identification");
                    String nom = resultSet.getString("nom");
                    String prenom = resultSet.getString("prenom");
                    String grade = resultSet.getString("grade");

                    System.out.println("ID: " + numeroIdentification + ", Nom: " + nom + ", Prénom: " + prenom + ", Grade: " + grade);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package actions.database;

import personnel.Personnel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AddToDataBase {

    public AddToDataBase(Personnel personnel) {
        String url = "jdbc:postgresql://localhost:5432/Base Millitaire";
        String utilisateur = "postgres";
        String motDePasse = "Epsilon94";

        // Connexion à la base de données et insertion du soldat
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            // Requête SQL d'insertion
            String sql = "INSERT INTO personnel (numero_identification, nom, prenom, grade, competences) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = connexion.prepareStatement(sql)) {
                // Paramétrage des valeurs
                preparedStatement.setInt(1, personnel.getNumeroIdentification());
                preparedStatement.setString(2, personnel.getNom());
                preparedStatement.setString(3, personnel.getPrenom());
                preparedStatement.setString(4, personnel.getGrade());
                preparedStatement.setArray(5, connexion.createArrayOf("text", personnel.getCompetences().toArray()));

                // Exécution de la requête
                int nombreLignesAffectees = preparedStatement.executeUpdate();

                if (nombreLignesAffectees > 0) {
                    System.out.println("Soldat inséré avec succès !");
                } else {
                    System.out.println("Échec de l'insertion du soldat.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
}
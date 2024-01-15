package actions.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateGrade {

    //constructor
    public UpdateGrade(int numeroIdentification, String _nouveauGrade) {
        String url = "jdbc:postgresql://localhost:5432/Base Millitaire";
        String utilisateur = "postgres";
        String motDePasse = "Epsilon94";

        // Numéro d'identification de l'employé à mettre à jour
        int numeroIdentificationEmploye = numeroIdentification;

        // Nouveau grade de l'employé
        String nouveauGrade = _nouveauGrade;

        // Connexion à la base de données et mise à jour du grade
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            // Requête SQL de mise à jour
            String sql = "UPDATE personnel SET grade = ? WHERE numero_identification = ?";

            try (PreparedStatement preparedStatement = ((Connection) connexion).prepareStatement(sql)) {
                // Paramétrage du nouveau grade et du numéro d'identification
                preparedStatement.setString(1, nouveauGrade);
                preparedStatement.setInt(2, numeroIdentificationEmploye);

                // Exécution de la requête
                int nombreLignesAffectees = preparedStatement.executeUpdate();

                if (nombreLignesAffectees > 0) {
                    System.out.println("Grade mis à jour avec succès !");
                } else {
                    System.out.println("Aucun employé trouvé avec le numéro d'identification spécifié.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

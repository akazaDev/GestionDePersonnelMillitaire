package actions.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveFromDataBase {

    public RemoveFromDataBase(int numeroIdentification) {
        SuppressionSoldat(numeroIdentification);
    }

    public void SuppressionSoldat(int numeroIdentificationSoldat) {
            // Informations de connexion à la base de données (à adapter selon votre configuration)
            String url = "jdbc:postgresql://localhost:5432/Base Millitaire";
            String utilisateur = "postgres";
            String motDePasse = "Epsilon94";

            // Connexion à la base de données et suppression du soldat
            try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
                // Requête SQL de suppression
                String sql = "DELETE FROM personnel WHERE numero_identification = ?";

                try (PreparedStatement preparedStatement = connexion.prepareStatement(sql)) {
                    // Paramétrage du numéro d'identification
                    preparedStatement.setInt(1, numeroIdentificationSoldat);

                    // Exécution de la requête
                    int nombreLignesAffectees = preparedStatement.executeUpdate();

                    if (nombreLignesAffectees > 0) {
                        System.out.println("Soldat supprimé avec succès !");
                    } else {
                        System.out.println("Aucun soldat trouvé avec le numéro d'identification spécifié.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

package com.postgresqltutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionPostgreSQL {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String url = "jdbc:postgresql://localhost:5432/Base Millitaire";
        String utilisateur = "postgres";
        String motDePasse = "Epsilon94";

        // Établir la connexion
        try (Connection connexion = DriverManager.getConnection(url, utilisateur, motDePasse)) {
            System.out.println("Connexion réussie !");
            // Ici, vous pouvez effectuer des opérations sur la base de données
        } catch (SQLException e) {
            System.err.println("Erreur de connexion : " + e.getMessage());
        }
    }
}

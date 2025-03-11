import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        // Informations de connexion à la base de données
        String url = "jdbc:postgresql://localhost:5432/tp_big_data"; // Remplace par le vrai nom de ta base
        String user = "postgres"; // Ton utilisateur PostgreSQL
        String password = "Volerovia13"; // Ton mot de passe PostgreSQL

        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Connexion réussie à PostgreSQL !");

            // 🔹 Création de l'objet DAO pour les employés
            EmpDAO empDAO = new EmpDAO(connection);

            // 🔹 Tester moveDepartment() : Déplacer l'employé 7839 vers le département 20
            boolean moved = empDAO.moveDepartment(7839, 20);
            if (moved) {
                System.out.println("✅ Employé déplacé avec succès !");
            } else {
                System.out.println("❌ Échec du déplacement de l'employé !");
            }

        } catch (SQLException e) {
            System.out.println("❌ Erreur SQL !");
            e.printStackTrace();
        }
    }
}
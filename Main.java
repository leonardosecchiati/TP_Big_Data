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
        try {
            // Charger explicitement le driver PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Connexion à la base de données
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connexion réussie à PostgreSQL !");

            // Exécuter une requête SQL
            String sql = "SELECT * FROM department";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            // Afficher les résultats
            while (resultSet.next()) {
                int id = resultSet.getInt("deptNo");
                String name = resultSet.getString("dname");
                String location = resultSet.getString("location");
                System.out.println("ID: " + id + " | Nom: " + name + " | Lieu: " + location);
            }

            // Fermer les ressources
            resultSet.close();
            statement.close();
            connection.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL non trouvé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erreur SQL !");
            e.printStackTrace();
        }
    }
}

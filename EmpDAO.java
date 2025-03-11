import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpDAO extends DAO<Emp> {
    public EmpDAO(Connection connect) {
        super(connect);
    }

    @Override
    public Emp find(int id) {
        return null; // On remplira cette méthode plus tard
    }

    @Override
    public boolean create(Emp emp) {
        return false; // À implémenter plus tard
    }

    @Override
    public boolean update(Emp emp) {
        return false; // À implémenter plus tard
    }

    @Override
    public boolean delete(Emp emp) {
        return false; // À implémenter plus tard
    }

    // 🔹 Méthode pour changer le département d'un employé
    public boolean moveDepartment(int empno, int newDeptno) {
        try {
            String sql = "UPDATE emp SET deptNo = ? WHERE empNo = ?";
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.setInt(1, newDeptno);
            statement.setInt(2, empno);

            int rowsUpdated = statement.executeUpdate();
            statement.close();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

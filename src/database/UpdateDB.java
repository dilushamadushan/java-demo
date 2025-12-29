package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDB {
    public static void main(String[] args) {
        Connection connection = Config.getConfig();
        String id  = "admin123";
        String sql = "UPDATE users SET  username = ?, role = ? WHERE u_id = ?";
        PreparedStatement pst = null;

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, "Dilusha");
            pst.setString(2, "admin");
            pst.setString(3, id);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

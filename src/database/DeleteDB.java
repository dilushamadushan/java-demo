package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDB {
    public static void main(String[] args) {
        Connection con = Config.getConfig();
        String id  = "admin123";
        String sql = "DELETE FROM users WHERE u_id = ?";
        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, id);
            pst.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

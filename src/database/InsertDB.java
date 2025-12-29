package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDB {
    public static void main(String[] args) {
        Connection con = Config.getConfig();
        String sql = "INSERT INTO users(u_id,username,role) VALUES(?,?,?)";

        PreparedStatement pst = null;

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "admin123");
            pst.setString(2, "admin");
            pst.setString(3, "admin");
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

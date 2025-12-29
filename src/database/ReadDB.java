package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDB {

    public static void main(String[] args) {

        Connection con = Config.getConfig();

        String sql = "SELECT * FROM users";

        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            if(!rs.next()) System.out.println("No data found");

            while (rs.next()) {
                String uId = rs.getString("u_id");
                String username = rs.getString("username");
                String role = rs.getString("role");

                System.out.println(uId + "\t" + username + "\t" + role);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Config {
    private static final String _url = "jdbc:mysql://localhost:3306/student";
    private static final String _user = "root";
    private static final String _password = "1234";

    private static Connection con =  null;

    public static Connection getConfig(){
        if(con == null){
            try {
                con = DriverManager.getConnection(_url,_user,_password);
            }catch (SQLException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        return con;
    }
}

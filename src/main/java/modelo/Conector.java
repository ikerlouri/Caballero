package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
        final String URL = "jdbc:mysql://localhost/caballero";
        final String USERNAME = "root";
        final String PASSWORD = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        
        return con;
    }
}

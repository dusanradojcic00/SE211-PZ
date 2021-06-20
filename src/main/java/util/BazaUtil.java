package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BazaUtil {

    private static Connection conn = null;

    //&useSSL=false
    static {
        String url = "jdbc:mysql://localhost:3306/se211";
        String user = "root";
        String pass = "dusanr123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Properties prop = new Properties();
            prop.setProperty("user", user);
            prop.setProperty("password", pass);
            prop.setProperty("useSSL", "false");
            conn = DriverManager.getConnection(url, prop);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }


}

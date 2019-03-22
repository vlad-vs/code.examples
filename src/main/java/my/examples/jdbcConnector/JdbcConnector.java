package my.examples.jdbcConnector;



import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Component
public class JdbcConnector {

    private final static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private final static String DB_CONNECTION = "jdbc:mysql://localhost:3306/myTestDb";
    private final static String DB_USER = "root";
    private final static String DB_PASSWORD = "root";

    public static Connection getDBConnection() {
        Connection dbConnection = null;
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }
    
}

package jdbc;

import java.sql.*;

public class ManagerJDBC {

    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String DATABASE_URL = "jdbc:mysql://localhost:3306/dbfortest?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

    private static String DB_USER = "root";
    private static String DB_PASSWORD = "root";

    public static Connection getDBConnection() {
        Connection dbConnection = null;
//        try {
//            Class.forName(DRIVER);
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            dbConnection = DriverManager.getConnection(DATABASE_URL, DB_USER, DB_PASSWORD);
            return dbConnection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return dbConnection;
    }

    public static Statement getStatment(Connection dbConnection) {
        Statement statement = null;
        try {
            statement = dbConnection.createStatement();
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public static void createTable(String sql, Statement statement) {
        try {
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeStatementAndConnection(Statement statement, Connection dbConnection) {
        try {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

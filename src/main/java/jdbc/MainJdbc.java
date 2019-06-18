package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class MainJdbc {

    public static void main(String[] args) {
        String s = "CREATE TABLE DBUSER(USERNAME text NULL, CREATED_BY text NULL)";
//        String s = "DROP TABLE DBUSER";

        Connection dbConnection = ManagerJDBC.getDBConnection();
        Statement statment = ManagerJDBC.getStatment(dbConnection);
        ManagerJDBC.createTable(s,statment);
        ManagerJDBC.closeStatementAndConnection(statment, dbConnection);


    }

}

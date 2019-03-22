package my.examples.spring;


import my.examples.configReader.ConfigReader;
import my.examples.jdbcConnector.JdbcConnector;
import my.examples.myOrm.Orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Application {


    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/configs/springConfig/app-context.xml");
        final ConfigReader bean = (ConfigReader) context.getBean("configReader");
        System.out.println("   app configs === > " + bean.getConfigs());

        final Orm orm = (Orm) context.getBean("orm");
        orm.createTables();

        final Connection dbConnection = JdbcConnector.getDBConnection();
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            statement = dbConnection.createStatement();
            resultSet = statement.executeQuery("select * from branch");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("bm_BRNMH") + " : " + resultSet.getString("bm_BRNM"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (resultSet != null)
                try {
                    resultSet.close();
                } catch (SQLException ignore) {
                }
            if (statement != null)
                try {
                    statement.close();
                } catch (SQLException ignore) {
                }
            if (dbConnection != null)
                try {
                    dbConnection.close();
                } catch (SQLException ignore) {
                }
        }

    }
}
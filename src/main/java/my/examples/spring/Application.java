package my.examples.spring;


import my.examples.configReader.ConfigReader;
import my.examples.jdbcConnector.JdbcConnector;
import my.examples.myOrm.Orm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Application {
    

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/configs/springConfig/app-context.xml");
        final ConfigReader bean = (ConfigReader) context.getBean("configReader");
        System.out.println("   app configs === > " + bean.getConfigs());

        final Orm orm = (Orm) context.getBean("orm");
        orm.createTables();

        final Connection dbConnection = JdbcConnector.getDBConnection();


    }
}
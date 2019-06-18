package myOrm;

import com.google.common.collect.Lists;
import jdbc.ManagerJDBC;
import myOrm.creators.ClassGetter;
import myOrm.creators.SqlCrudService;
import myOrm.creators.SqlTableCreatorService;

import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class mainOrm {

    private static List<String> tables;
    //1) получить пути всех классов (наименование)
    //2) по ним найти все аннотации
    //3) из наннотаций получить инфу по полю
    //4) создать sql
    //5) сделать компонент для работы с запросами в бд (КРУД)
    // статический метод на входе получает Obgect под капотом получает его класс и аннотации
    // после  формирует на основании аннотаций sql
    //
    public static void main(String[] args) {

        tables = getTables();
//      List<String> strings = Lists.newArrayList("MyOrm.pojo.Person");
        closeCtreateTable();


    }

    private static void closeCtreateTable() {
        List<String> classNames = getClassNames();
        try {
            Map<String, String> tableNameAndSqlCreation = SqlTableCreatorService.createTables(classNames);
            System.out.println("SQL : " + tableNameAndSqlCreation);

            Connection dbConnection = ManagerJDBC.getDBConnection();
            Statement statment = ManagerJDBC.getStatment(dbConnection);
            List<String> upCaseTubles = tables.stream().map(String::toUpperCase).collect(Collectors.toList());

            tableNameAndSqlCreation.forEach((tableName, sql) -> {
                if (!upCaseTubles.contains(tableName.toUpperCase())) {
                    ManagerJDBC.createTable(sql, statment);
                    System.out.println("Table " + tableName + " added in base");
                } else {
                    System.out.println("Table " + tableName + " exist in base");
                }
            });
            ManagerJDBC.closeStatementAndConnection(statment, dbConnection);
        } catch (ClassNotFoundException e) {
            System.out.println("Path not found");
        }
    }

    private static List<String> getClassNames() {
//        Package aPackage = Package.getPackage("MyOrm");
//        List<Class<?>> classesForPackage = ClassGetter.getClassesForPackage(aPackage);
//        List<String> collect = classesForPackage.stream().map(aClass -> aClass.getName()).collect(Collectors.toList());

        String path = "C:\\_code\\java\\progects\\code.examples\\src\\main\\java\\myOrm\\dto";
        String pag = "myOrm.dto";

        List<Class<?>> myOrm = ClassGetter.processDirectory(new File(path), pag);
        return myOrm.stream().map(Class::getName).collect(Collectors.toList());
    }


    public static List<String> getTables() {
        ArrayList<String> res = Lists.newArrayList();
        Connection dbConnection = ManagerJDBC.getDBConnection();
        Statement statment = ManagerJDBC.getStatment(dbConnection);
        String allTablesNamesSql = SqlTableCreatorService.getAllTablesNamesSql();
        try {
            ResultSet resultSet = statment.executeQuery(allTablesNamesSql);
            while (resultSet.next()) {
                String tableName = resultSet.getString(1);
                res.add(tableName);
//                    System.out.println(tableName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ManagerJDBC.closeStatementAndConnection(statment, dbConnection);
        return res;
    }
}

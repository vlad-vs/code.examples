package myOrm.creators;

import com.google.common.collect.Maps;
import myOrm.annotations.Column;
import myOrm.annotations.Table;
import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

public class SqlTableCreatorService {

    public static String getAllTablesNamesSql(){
        String  getAllTablesSql = "SHOW TABLES";
        return getAllTablesSql;
    }

    public static Map<String, String> createTables(List<String> classes) throws ClassNotFoundException {
        Map<String, String> sql = Maps.newTreeMap();
        String creationPartOne = "CREATE TABLE ";
        String creationPartTwo = "(";
        String creationPartTree = ");";

        for (String className : classes) {
            Class<?> cl = Class.forName(className);
            final Table annotationTable = cl.getAnnotation(Table.class);
            if (annotationTable == null) {
                System.out.println("Annotation not found");
                continue;
            }

            String tableName = annotationTable.name().toUpperCase();
            if (tableName.isEmpty()) {
                tableName = cl.getName().toUpperCase();
            }

            final List<String> columnsRes = Lists.newArrayList();
            final Field[] declaredFields = cl.getDeclaredFields();
            for (Field field : declaredFields) {
                final Column annotationColumn = field.getAnnotation(Column.class);
                final String colName = annotationColumn.name().toUpperCase();
                final String type = annotationColumn.valueType().getSql();
                String type1 = annotationColumn.typeOne().getType();
                String type2 = annotationColumn.typeTwo().getType();
                String type3 = annotationColumn.typeTree().getType();
                String type4 = annotationColumn.typeFor().getType();
                columnsRes.add(colName + " " + type + " " + type1 + " " + type2 + " " + type3 + " " + type4);
                columnsRes.add(", ");
            }
            // удаление последней запятой
            final int size = columnsRes.size();
            columnsRes.remove(size - 1);

            String colomns = masToStr(columnsRes);
            String txtSql = add(creationPartOne, tableName, creationPartTwo, colomns, creationPartTree);

            String simpleTableName = cl.getSimpleName();

            sql.put(simpleTableName, txtSql);
//            System.out.println(add);
        }
        return sql;
    }

    private static String add(String... args) {
        List<String> strings = Lists.newArrayList(args);
        return masToStr(strings);
    }

    private static String masToStr(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        strings.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

}

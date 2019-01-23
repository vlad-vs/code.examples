package myOrm.creators;

import myOrm.annotations.Column;
import myOrm.annotations.Table;
import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.List;

public class TableCreator {

    public static String createTables(List<String> classes) throws ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        String creationPartOne = "CREATE TABLE ";
        String creationPartTwo = "(";
        String creationPartTree = ");";

        for (String className : classes) {
            Class<?> cl = Class.forName(className);
            final Table annotationTable = cl.getAnnotation(Table.class);
            if (annotationTable==null) {
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
                final String type = annotationColumn.type().getSql();
                columnsRes.add(colName + " " + type + " null");
                columnsRes.add(", ");
            }
            // удаление последней запятой
            final int size = columnsRes.size();
            columnsRes.remove(size - 1);
            String colomns = masToStr(columnsRes);
            builder.append(add(creationPartOne, tableName, creationPartTwo, colomns, creationPartTree));
//            System.out.println(add);
        }
        return builder.toString();
    }
    private static String add(String... args){
        List<String> strings = Lists.newArrayList(args);
        return masToStr(strings);
    }

    private static String masToStr(List<String> strings){
        StringBuilder stringBuilder = new StringBuilder();
        strings.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

}

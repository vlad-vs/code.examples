package MyOrm.creators;

import MyOrm.annotations.Column;
import MyOrm.annotations.Table;
import MyOrm.pojo.ColumnType;
import com.google.common.collect.Lists;

import java.lang.reflect.Field;
import java.util.List;

public class TableCreator {

    public void createTables(List<String> classes) throws ClassNotFoundException {

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
                final ColumnType type = annotationColumn.type();
                columnsRes.add(colName + " " + type + " ");
                columnsRes.add(",");
            }
            // удаление последней запятой
            final int size = columnsRes.size();
            columnsRes.remove(size);

//            add(creationPartOne,tableName,creationPartTwo,columnsRes,creationPartTree);


        }

    }
    private String add(String[] args){
        StringBuffer sql = new StringBuffer();
        for (String arg : args) {
            sql.append(arg);
        }
        final String s = sql.toString();
        return s;
    }

}

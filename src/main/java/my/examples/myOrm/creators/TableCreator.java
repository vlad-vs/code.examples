package my.examples.myOrm.creators;

import my.examples.myOrm.annotations.Column;
import my.examples.myOrm.annotations.ColumnAnnotations.ColumnUnique;
import my.examples.myOrm.annotations.Table;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.List;


@Component
public class TableCreator {

    public static String createTables(List<String> classes) throws ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        String creationPartOne = "CREATE TABLE ";
        String firstGap = "(";
        String secondGap = ")";
        String end = ";";
        String bottomLine = "_";
        String dot = ".";

        for (String className : classes) {
            Class<?> cl = Class.forName(className);
            final Table annotationTable = cl.getAnnotation(Table.class);
            if (annotationTable==null) {
                System.out.println("Annotation in class " + cl + " not found");
                continue;
            }

            String tableName = annotationTable.name().toUpperCase();
            if (tableName.isEmpty()) {
                tableName = cl.getSimpleName().toUpperCase();
            }

            final List<String> columnsRes = Lists.newArrayList();
            final List<Field> fieldsWithAnnotationColumnUnique = Lists.newArrayList();
            final List<Field> fieldsWithAnnotationColumn = Lists.newArrayList();

            final Field[] declaredFields = cl.getDeclaredFields();
            for (Field field : declaredFields) {
                final Column annotationColumn = field.getAnnotation(Column.class);
                if (annotationColumn!=null) {
                    fieldsWithAnnotationColumn.add(field);
                }
                final ColumnUnique columnUnique = field.getAnnotation(ColumnUnique.class);
                if (columnUnique!=null) {
                    fieldsWithAnnotationColumnUnique.add(field);
                }
            }

            if (!fieldsWithAnnotationColumn.isEmpty()) {
                for (Field field : fieldsWithAnnotationColumn) {
                    final Column annotation = field.getAnnotation(Column.class);
                    final String colName = annotation.name().toUpperCase();
                    final String type = annotation.type().getSql();
                    columnsRes.add(colName + " " + type + " null");
                    columnsRes.add(", ");
                }
            }

//            if (fieldsWithAnnotationColumnUnique.size()>1) {
//                final List<String> values = Lists.newArrayList();
//                final String s = "CREATE INDEX " + tableName;
//                StringBuilder buld = new StringBuilder();
//                buld.append("table_");
//                buld.append(tableName);
//                for (Field unique : fieldsWithAnnotationColumnUnique) {
//                    final ColumnUnique annotation = unique.getAnnotation(ColumnUnique.class);
//                    final String value = annotation.value();
//                    values.add(value);
//                }
//                for ()
//                "table_name_id_name_index ON ts.table_name (id, name);";
//            }
            // удаление последней запятой
            final int size = columnsRes.size();
            if (size>1) {
                columnsRes.remove(size - 1);
            }
            String colomns = masToStr(columnsRes);
            builder.append(add(creationPartOne, tableName, firstGap, colomns, secondGap,end));
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

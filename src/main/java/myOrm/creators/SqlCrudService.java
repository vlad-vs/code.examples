package myOrm.creators;

import com.google.common.collect.Lists;
import myOrm.annotations.Column;
import myOrm.annotations.Table;
import myOrm.pojo.ColumnValueType;

import java.lang.reflect.Field;
import java.util.List;

public class SqlCrudService <T extends Object> {

    static String selectFrom = "Select * FROM ";
    static String dbName = "animal_table ";
    static String where = " WHERE name = '";
    static String end = "'";

    static String insert = "insert into ";
    static String open = " ( ";
    static String close = " ) ";
    static String values = " values ";

//    INSERT INTO table_name (column1, column2, column3, ...)
//    VALUES (value1, value2, value3, ...);

    public static String selectItem(String tableName){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(selectFrom);

        return stringBuilder.toString();
    }

    public static void deleteItem(Object item){

    }

    public void insertItem(T obj) throws IllegalAccessException {

        Class<? extends Object> aClass = obj.getClass();
        String tableName = aClass.getSimpleName().toUpperCase();

        final Table annotationTable = aClass.getClass().getAnnotation(Table.class);
        if (annotationTable != null) {
            tableName = annotationTable.name().toUpperCase();
        }

        final List<String> columnsRes = Lists.newArrayList();
        final List<String> valRes = Lists.newArrayList();
        final Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field : declaredFields) {
            final Column annotationColumn = field.getAnnotation(Column.class);
            final String colName = annotationColumn.name().toUpperCase();
            columnsRes.add(colName);
            columnsRes.add(", ");

            String java = annotationColumn.valueType().getJava();
            if(!field.isAccessible()){
                field.setAccessible(true);
            }
            if (java.equalsIgnoreCase(ColumnValueType.integer.getJava())) {
                Class fieldType = field.getType();
                Integer anInt = field.getInt(obj);
                valRes.add(anInt.toString());
            }
            if (java.equalsIgnoreCase(ColumnValueType.text.getJava())) {
                Class fieldType = field.getType();
                Object o =  field.get(obj);
                String s = (String)o;
                valRes.add("'" + s + "'");
            }
            valRes.add(",");

        }

        // удаление последней запятой
        final int size = columnsRes.size();
        columnsRes.remove(size - 1);
        valRes.remove(size - 1);

        String colomns = masToStr(columnsRes);
        String val = masToStr(valRes);
        String txtSql = add(insert,tableName,open,colomns,close,values,open,val,close);

        System.out.println(txtSql);

    }
    private String add (String...args){
        List<String> strings = Lists.newArrayList(args);
        return masToStr(strings);
    }

    private String masToStr(List<String> strings) {
        StringBuilder stringBuilder = new StringBuilder();
        strings.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

}

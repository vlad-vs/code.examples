package my.examples.myOrm.annotations.ColumnAnnotations;

public @interface ColumnUnique {

//    CREATE UNIQUE INDEX table_name_id_uindex ON ts.table_name (id);
    //CREATE INDEX table_name_id_name_index ON ts.table_name (id, name);
    String value() default "";
}

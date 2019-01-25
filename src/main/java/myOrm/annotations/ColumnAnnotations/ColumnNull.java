package myOrm.annotations.ColumnAnnotations;

public @interface ColumnNull {
    String value() default "Null";
}

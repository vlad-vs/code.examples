package my.examples.myOrm.annotations.ColumnAnnotations;

public @interface ColumnNotNull {
    String value() default "NotNull";
}

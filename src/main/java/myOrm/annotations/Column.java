package myOrm.annotations;

import myOrm.pojo.ColumnType;
import myOrm.pojo.ColumnValueType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    String name() default "";

    ColumnValueType valueType();

    ColumnType typeOne() default ColumnType.defoult;
    ColumnType typeTwo() default ColumnType.defoult;
    ColumnType typeTree() default ColumnType.defoult;
    ColumnType typeFor() default ColumnType.defoult;

}

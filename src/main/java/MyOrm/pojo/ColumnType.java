package MyOrm.pojo;

public enum ColumnType {

    text("text","varchar"), integer("int","number");

    String java;
    String sql;

    ColumnType(String java, String sql) {
        this.java = java;
        this.sql = sql;
    }



}

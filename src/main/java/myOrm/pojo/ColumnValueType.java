package myOrm.pojo;

public enum ColumnValueType {

    text("string","text"),
    integer("int","int");

    String java;
    String sql;

    ColumnValueType(String java, String sql) {
        this.java = java;
        this.sql = sql;
    }

    public String getJava() {
        return java;
    }

    public String getSql() {
        return sql;
    }
}

package my.examples.myOrm.pojo;

public enum ColumnType {

    text("text","varchar"), integer("int","number");

    String java;
    String sql;

    ColumnType(String java, String sql) {
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

package myOrm.pojo;

public enum ColumnType {

    defoult(""),
    nullType("null"),
    notNullType(""),
    prmKeyType("");


    String type;

    ColumnType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


}

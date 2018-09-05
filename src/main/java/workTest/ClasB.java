package workTest;

public class ClasB implements WorkInterface, Comparable<ClasB> {

    private int id;

    private String name;

    public ClasB(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(ClasB o) {
        return 0;
    }
}

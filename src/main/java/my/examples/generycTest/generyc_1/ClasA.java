package my.examples.generycTest.generyc_1;

public class ClasA implements WorkInterface, Comparable<ClasA>{

    private int id;

    private String name;

    public ClasA(int id, String name) {
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
    public int compareTo(ClasA o) {
        return 0;
    }
}

package my.examples.regularExpres;

import java.io.Serializable;

public class PojoForTest implements Serializable {

    private String name;

    private SecondLevel secondLevel;

    int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecondLevel getSecondLevel() {
        return secondLevel;
    }

    public void setSecondLevel(SecondLevel secondLevel) {
        this.secondLevel = secondLevel;
    }

    @Override
    public String toString() {
        return "PojoForTest{" +
                "name='" + name + '\'' +
                ", secondLevel=" + secondLevel +
                '}';
    }
}

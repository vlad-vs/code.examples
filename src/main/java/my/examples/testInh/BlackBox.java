package my.examples.testInh;

import java.util.Objects;

public class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB){
        this.varA = varA;
        this.varB = varB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox blackBox = (BlackBox) o;

        if (varA != blackBox.varA) return false;
        return varB == blackBox.varB;
    }

    @Override
    public int hashCode() {
        int result = varA;
        result = 31 * result + varB;
        return result;
    }

}

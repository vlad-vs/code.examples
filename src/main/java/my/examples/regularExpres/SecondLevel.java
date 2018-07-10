package my.examples.regularExpres;

import java.io.Serializable;

public class SecondLevel implements Serializable {
    String cartNumber;

    public SecondLevel(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public SecondLevel() {
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    @Override
    public String toString() {
        return "SecondLevel{" +
                "cartNumber='" + cartNumber + '\'' +
                '}';
    }
}

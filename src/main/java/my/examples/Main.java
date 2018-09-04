package my.examples;

import my.examples.enums.Coffe;

public class Main {

    String s;
    String m;

    public static void main(String[] args) {
        Coffe coffe = new Coffe();

        Coffe.CoffeSize.MEDIUM.getMll();


        GeozoneExistsType isExists = GeozoneExistsType.IS_EXISTS;
        System.out.println(isExists.b);

        System.out.println(isExists.isExist());
    }

    public enum GeozoneExistsType {

        IS_EXISTS (true, "The current zone is open to the user"),
        NOT_EXIST (false, "The current zone is closed to the user");

        private boolean b;
        private String res;

        GeozoneExistsType(boolean b, String res) {
            this.b = b;
            this.res = res;
        }

        public boolean isExist(){
            return b;
        }
    }


}

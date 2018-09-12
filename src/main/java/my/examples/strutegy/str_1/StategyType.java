package my.examples.strutegy.str_1;

public enum StategyType {

    stratA(1),
    stratB(2);

    private int n;

    StategyType(int n) {
        this.n = n;
    }

    int getStratType() {
        return n;
    }


//    stratA(1, new OneStr()),
//    stratB(2, new TwoStr());
//
//    private ContractInterface strategy;
//    private int n;
//
//    StategyType(int n, ContractInterface s) {
//        this.strategy = strategy;
//        this.n = n;
//    }
//
//
//
//    int getStratType(){
//        return n;
//    }
//
//    ContractInterface getStrategy(){
//        return strategy;
//    }
}

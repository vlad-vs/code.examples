package my.examples.strutegy.str_1;

public class TwoStr extends PartContractAbstract implements ContractInterface {

    @Override
    public StategyType getStr() {
        return StategyType.stratB;
    }

    @Override
    public void play() {
        System.out.println("play from Strategy - 2");
    }
}

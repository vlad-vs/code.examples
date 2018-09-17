package my.examples.strutegy.str_1;

public class OneStr extends PartContractAbstract implements ContractInterface {

    @Override
    public StategyType getStr() {
        return StategyType.stratA;
    }

    @Override
    public void play() {
        System.out.println("play from Strategy - 1");
    }

}

package my.examples.strutegy.str_1;

public class StrMain {

    public static void main(String[] args) {

        Wrapper wrapper = new Wrapper("wrap_1");

        StratProvaider stratProvaider = new StratProvaider();
        ContractInterface strategy = stratProvaider.getStrategy(1);

        strategy.play();
        System.out.println(strategy.getStr());
        System.out.println(strategy.getStr().getStratType());
        strategy.say(wrapper);

    }
}

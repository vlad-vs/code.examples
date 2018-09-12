package my.examples.strutegy.str_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StratProvaider {

    private Map<Integer, ContractInterface> strategies = new HashMap<>();


    //**********spring***************
//    @Autowired
//    public void initStrategies(Set<ContractInterface> strategiesSet) {
//
//        // не может быть больше 2-ух (true/false)
//        assert (strategiesSet.size() == 2);
//
//        for (ContractInterface strategy : strategiesSet) {
//            strategies.put(strategy.getStr().getStratType(), strategy);
//        }
//    }

//    public ContractInterface getStrategy(int i) {
//        return strategies.get(i);
//
//    }
    //*********************************

    public ContractInterface getStrategy(int i) {

        StategyType.stratA.getStratType();

        ContractInterface strategy;
        if (i==1){
            strategy = new OneStr();
        } else {
            strategy = new TwoStr();
        }
        return strategy;
    }

}

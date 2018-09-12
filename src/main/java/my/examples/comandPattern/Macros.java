package my.examples.comandPattern;

import java.util.ArrayList;
import java.util.List;

public class Macros {

    private final List<Action> actions;


    private Macros() {
        this.actions = new ArrayList<>();
    }

    public void add(Action action){
        actions.add(action);
    }

    public void run(){
        actions.forEach(Action::doAcrion);
    }
}

package _1_factory;

import _1_factory.factoryes.CppDeveloperFactory;
import _1_factory.factoryes.DeveloperFactory;
import _1_factory.factoryes.JavaDeveloperFactory;

public class Provider {

    public DeveloperFactory getFactory(String factoryName){
        if (factoryName.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (factoryName.equalsIgnoreCase("cpp")){
            return new CppDeveloperFactory();
        } else {
            throw new RuntimeException(factoryName + " фабрика не найдена");
        }
    }

}

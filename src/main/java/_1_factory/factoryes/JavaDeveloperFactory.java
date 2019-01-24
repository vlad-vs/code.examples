package _1_factory.factoryes;

import _1_factory.pojoOfFactories.Developer;
import _1_factory.pojoOfFactories.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

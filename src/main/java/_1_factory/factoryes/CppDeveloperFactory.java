package _1_factory.factoryes;

import _1_factory.pojoOfFactories.CppDeveloper;
import _1_factory.pojoOfFactories.Developer;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}

package _1_factory;

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

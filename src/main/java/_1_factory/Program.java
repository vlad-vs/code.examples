package _1_factory;

import _1_factory.factoryes.DeveloperFactory;

public class Program {

    public static void main(String[] args) {

        Provider provider = new Provider();
        DeveloperFactory java = provider.getFactory("java");
        java.createDeveloper().vriteCode();


        Integer integer = 0;

        boolean b = (integer != 0);
        System.out.println(b);

//        DeveloperFactory developerFactory1 = getFactory("java");
//        developerFactory1.createDeveloper().vriteCode();
//
//        DeveloperFactory developerFactory2 = getFactory("cpp");
//        developerFactory2.createDeveloper().vriteCode();
//
//        DeveloperFactory developerFactory3 = getFactory("bb");
//        developerFactory3.createDeveloper().vriteCode();
    }

//    static DeveloperFactory getFactory(String factoryName){
//        if (factoryName.equalsIgnoreCase("java")) {
//            return new JavaDeveloperFactory();
//        } else if (factoryName.equalsIgnoreCase("cpp")){
//            return new CppDeveloperFactory();
//        } else {
//            throw new RuntimeException(factoryName + " фабрика не найдена");
//        }
//    }

}

package _3_singleton;

public class MainSingleton {
    public static void main(String[] args) {
        System.out.println(ProgramStaticLogger.getInstance());
        System.out.println(ProgramStaticLogger.getInstance());
        System.out.println(ProgramStaticLogger.getInstance());

        System.out.println("---------------------");

        ProgramStaticLogger.getInstance().setLog("add - 1");
        ProgramStaticLogger.getInstance().setLog("add - 2");
        ProgramStaticLogger.getInstance().setLog("add - 3");
        ProgramStaticLogger.getInstance().readLog();


        System.out.println("songleton2---------------");

        System.out.println(ProgramSingleton.getInstance());
        System.out.println(ProgramSingleton.getInstance());
        System.out.println(ProgramSingleton.getInstance());

        ProgramSingleton.getInstance().setLog("Log-1");
        ProgramSingleton.getInstance().setLog("Log-2");
        ProgramSingleton.getInstance().setLog("Log-3");

        ProgramSingleton.getInstance().getLog();
    }
}

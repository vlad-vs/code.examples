package _3_singleton;

public class ProgramSingleton {
    private static volatile ProgramSingleton programSingleton;

    private ProgramSingleton() {
    }

    private static String log = "Log: " + "\n";

    public static ProgramSingleton getInstance() {
        if (programSingleton == null) {
            synchronized (ProgramSingleton.class) {
                if (programSingleton == null) {
                    programSingleton = new ProgramSingleton();
                }
            }
        }
        return programSingleton;
    }

    public void getLog() {
        System.out.println(log);
    }

    public void setLog(String logInfo) {
        log += logInfo + "\n";
    }
}

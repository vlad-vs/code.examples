package _3_Singleton;

class ProgramStaticLogger {
    private static ProgramStaticLogger ourInstance = new ProgramStaticLogger();
    private static String log = "Log: \n\n";

    public static synchronized ProgramStaticLogger getInstance() {
        return ourInstance;
    }

    private ProgramStaticLogger() {
    }

    public void setLog(String logInfo){
        log+=logInfo + "\n";
    }
    public void readLog(){
        System.out.println(log);
    }
}

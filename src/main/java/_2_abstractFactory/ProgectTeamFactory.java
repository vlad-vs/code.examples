package _2_abstractFactory;

public interface ProgectTeamFactory {

    Developer getDeveloper();
    PmManager getProgectManager();
    QAtester getQaQAtester();

}

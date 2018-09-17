package _2_abstractFactory.factories;

import _2_abstractFactory.Developer;
import _2_abstractFactory.PmManager;
import _2_abstractFactory.QAtester;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    PmManager getProgectManager();
    QAtester getQaQAtester();

}

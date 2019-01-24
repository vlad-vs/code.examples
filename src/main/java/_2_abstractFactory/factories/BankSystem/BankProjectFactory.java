package _2_abstractFactory.factories.BankSystem;

import _2_abstractFactory.Developer;
import _2_abstractFactory.PmManager;
import _2_abstractFactory.factories.ProjectTeamFactory;
import _2_abstractFactory.QAtester;

public class BankProjectFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public PmManager getProgectManager() {
        return new ManagerBankProject();
    }

    @Override
    public QAtester getQaQAtester() {
        return new Tester();
    }
}

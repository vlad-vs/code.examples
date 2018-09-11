package _2_abstractFactory.BankSystem;

import _2_abstractFactory.Developer;
import _2_abstractFactory.PmManager;
import _2_abstractFactory.ProgectTeamFactory;
import _2_abstractFactory.QAtester;

public class BankProgectFactory implements ProgectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public PmManager getProgectManager() {
        return new ManagerBankProgect();
    }

    @Override
    public QAtester getQaQAtester() {
        return new Tester();
    }
}

package _2_abstractFactory.webProgect;

import _2_abstractFactory.Developer;
import _2_abstractFactory.PmManager;
import _2_abstractFactory.ProgectTeamFactory;
import _2_abstractFactory.QAtester;

public class WebTeamFactory implements ProgectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDev();
    }

    @Override
    public PmManager getProgectManager() {
        return null;
    }

    @Override
    public QAtester getQaQAtester() {
        return new TestPhpCode();
    }
}

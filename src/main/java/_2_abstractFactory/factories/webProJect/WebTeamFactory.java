package _2_abstractFactory.factories.webProJect;

import _2_abstractFactory.Developer;
import _2_abstractFactory.PmManager;
import _2_abstractFactory.factories.ProjectTeamFactory;
import _2_abstractFactory.QAtester;

public class WebTeamFactory implements ProjectTeamFactory {
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

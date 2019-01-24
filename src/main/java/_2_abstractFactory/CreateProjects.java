package _2_abstractFactory;

import _2_abstractFactory.factories.BankSystem.BankProjectFactory;
import _2_abstractFactory.factories.ProjectTeamFactory;
import _2_abstractFactory.factories.webProJect.WebTeamFactory;

public class CreateProjects {

    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankProjectFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        QAtester qaQAtester = projectTeamFactory.getQaQAtester();
        PmManager progectManager = projectTeamFactory.getProgectManager();

        developer.writrCode();
        qaQAtester.testCode();
        progectManager.manageProgect();

        System.out.println("-----------------------------------");

        ProjectTeamFactory projectTeamFactoryWeb = new WebTeamFactory();
        Developer developer1 = projectTeamFactoryWeb.getDeveloper();
        QAtester qaQAtester1 = projectTeamFactoryWeb.getQaQAtester();
        developer1.writrCode();
        qaQAtester1.testCode();

    }
}

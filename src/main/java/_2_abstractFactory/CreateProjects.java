package _2_abstractFactory;

import _2_abstractFactory.BankSystem.BankProgectFactory;
import _2_abstractFactory.webProgect.WebTeamFactory;

public class CreateProjects {

    public static void main(String[] args) {
        ProgectTeamFactory progectTeamFactory = new BankProgectFactory();
        Developer developer = progectTeamFactory.getDeveloper();
        QAtester qaQAtester = progectTeamFactory.getQaQAtester();
        PmManager progectManager = progectTeamFactory.getProgectManager();

        developer.writrCode();
        qaQAtester.testCode();
        progectManager.manageProgect();

        System.out.println("-----------------------------------");

        ProgectTeamFactory progectTeamFactoryWeb = new WebTeamFactory();
        Developer developer1 = progectTeamFactoryWeb.getDeveloper();
        QAtester qaQAtester1 = progectTeamFactoryWeb.getQaQAtester();
        developer1.writrCode();
        qaQAtester1.testCode();

    }
}

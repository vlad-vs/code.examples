package _2_abstractFactory.factories.BankSystem;

import _2_abstractFactory.PmManager;

public class ManagerBankProject implements PmManager {

    @Override
    public void manageProgect() {
        System.out.println("manage bank project");
    }
}

package _2_abstractFactory.factories.BankSystem;

import _2_abstractFactory.PmManager;

public class ManagerBankProgect implements PmManager {

    @Override
    public void manageProgect() {
        System.out.println("manage bank project");
    }
}

package my.examples.reflection;

public class DbFinanceInfoBuilder implements FinanceInfoBuilder {

    @Override
    public FinanceInformation buildFinacneInformation() {
        System.out.println("Вызов метода для объекта DbFinanceInfoBuilder");
        return new FinanceInformation();
    }
}

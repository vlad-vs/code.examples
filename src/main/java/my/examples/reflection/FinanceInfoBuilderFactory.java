package my.examples.reflection;

public class FinanceInfoBuilderFactory {

    public static FinanceInfoBuilder getFinanceInfoBuilder() {
        // Обратите внимание, что здесь мы ВЫНУЖДЕНЫ писать реальный класс
        // Хорошо, что это мы делаем только в одном месте, ане в каждой
        // строке, где нам потребуется обращение к FinanceInfoBuilder
        return new DbFinanceInfoBuilder();
    }

}

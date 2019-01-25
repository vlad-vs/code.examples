package _7_proxy;

public class ProxyMain {

//      Применимость: Паттерн Заместитель применяется в Java коде тогда, когда надо заменить настоящий объект
//      его суррогатом, причём незаметно для клиентов настоящего объекта. Это позволит выполнить какие-то добавочные
//      поведения до или после основного поведения настоящего объекта.

//      Признаки применения паттерна: Класс заместителя чаще всего делегирует всю настоящую работу
//      своему реальному объекту. Заместители часто сами следят за жизненным циклом своего реального объекта.

    public static void main(String[] args) {
        StringCreator proxyStringCreator = new ProxyStringCreatorImpl();
        StringCreator stringCreator = new StringCreatorImpl();

        proxyStringCreator.createStr("proxy");
        System.out.println("=======================");
        stringCreator.createStr("creator");
    }
}

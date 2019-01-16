package _4_builder;

public class Runner {


    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new EnterpriceWebsiteBuilder());

        WebSite webSite = director.buldWebSite();

        System.out.println(webSite);

    }
}

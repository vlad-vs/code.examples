package _4_builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buldWebSite(){
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();
        return webSite;
    }
}

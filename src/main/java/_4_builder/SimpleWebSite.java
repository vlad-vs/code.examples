package _4_builder;

public class SimpleWebSite extends WebSiteBuilder {

    @Override
    void buildName() {
        webSite.setName("SimpleSite");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.WORDPRESS);

    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}

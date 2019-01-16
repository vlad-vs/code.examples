package _4_builder;

public class EnterpriceWebsiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("EnterpriseWebSite");
    }

    @Override
    void buildCms() {
        webSite.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10_000);
    }
}

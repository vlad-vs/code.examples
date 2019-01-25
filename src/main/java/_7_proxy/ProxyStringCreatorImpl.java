package _7_proxy;

public class ProxyStringCreatorImpl implements StringCreator {

    private StringCreator creator = new StringCreatorImpl();

    @Override
    public String createStr(String s) {
        System.out.println("from proxy " + s);
        final String str = creator.createStr(s);
        return str;
    }
}

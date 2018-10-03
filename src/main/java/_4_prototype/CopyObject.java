package _4_prototype;

public class CopyObject implements Copyable {

    private String someStr;

    @Override
    public Copyable copy() {
        return new CopyObject();
    }

    public CopyObject() {
    }

    public CopyObject(String someStr) {
        this.someStr = someStr;
    }

    public String getSomeStr() {
        return someStr;
    }

    public void setSomeStr(String someStr) {
        this.someStr = someStr;
    }

    @Override
    public String toString() {
        return "CopyObject{" +
                "someStr='" + someStr + '\'' +
                '}';
    }
}

package my.examples.testInh;

public class PolImpl implements Pol {


    public String delChar(String s, char del) {
        String nStr="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != del) {
                nStr = nStr + c;
            }
        }
        return nStr;
    }

    @Override
    public void paint() {
        System.out.println("paint_1");
    }
}

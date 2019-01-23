package _fastJSON;

import com.alibaba.fastjson.JSON;

public class FastjsonMain {

    public static void main(String[] args) {
        Auto auto = new Auto(100,"BMW");
        final String s1 = JSON.toJSON(auto).toString();
        final String s2 = JSON.toJSONString(auto);
        System.out.println(s1);
        System.out.println(s2);

        final Auto parse = JSON.parseObject(s1, Auto.class);
        System.out.println(parse);
    }

    static class Auto{
        private int pover;
        private String name;

        public Auto() {
        }

        @Override
        public String toString() {
            return JSON.toJSON(this).toString();
        }

        public Auto(int pover, String name) {
            this.pover = pover;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPover() {
            return pover;
        }

        public void setPover(int pover) {
            this.pover = pover;
        }
    }
}

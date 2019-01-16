package my.examples.rundom;

import com.google.common.collect.Lists;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class RamdomMain {


    public static void main(String[] args) {

//        LatLng latLng = new LatLng(49.057905d, 33.402199d);
//        System.out.println(JsonUtil.toPrettyJson(latLng));
//
//        BigDecimal bdLat = new BigDecimal(49.057905d);
//        bdLat = bdLat.setScale(6, RoundingMode.HALF_UP);
//        BigDecimal bdLng = new BigDecimal(33.402198999999996d);
//        bdLng = bdLng.setScale(6, RoundingMode.HALF_UP);
//
//
//        LatLng latLng2 = new LatLng(bdLat.doubleValue(), bdLng.doubleValue());
//        System.out.println(JsonUtil.toPrettyJson(latLng2));
//        System.out.println(latLng.equals(latLng2));

        List<Double> list = getDoubles();
        List<Double> fin = Lists.newArrayList();


        list.forEach(aDouble -> {
            BigDecimal bdLat = new BigDecimal(aDouble);
            bdLat = bdLat.setScale(6, RoundingMode.HALF_UP);
            fin.add(bdLat.doubleValue());
        });
        System.out.println(list);
        System.out.println(fin);
    }

    private static List<Double> getDoubles() {

        int max = 10;
        int i = 0;

        List<Double> list = Lists.newArrayList();
        while (i<max){
            double v = Math.random() * 100;
            list.add(v);

            i++;
        }
        return list;
    }


}

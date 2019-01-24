package _0_java8_solutions.java_8.toMap;

import com.google.common.collect.Maps;
import com.google.inject.internal.util.Lists;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ToMap {

    public static void main(String[] args) {


        List<String> list = Lists.newArrayList("A","B","C");


        Map<String,String> map = Maps.newHashMap();
        map.put("1","A");
        map.put("1","B");
        System.out.println(list.get(0));


        LatLeng latLeng1 = new LatLeng(11.11,22.22);
        LatLeng latLeng2 = new LatLeng(11.11,22.22);
        LatLeng latLeng3 = new LatLeng(11.11,22.22);
        LatLeng latLeng4 = new LatLeng(33.11,22.22);

        GeoCoord coord1 = new GeoCoord(1,latLeng1);
        GeoCoord coord2 = new GeoCoord(1,latLeng2);
        GeoCoord coord3 = new GeoCoord(1,latLeng3);
        GeoCoord coord4 = new GeoCoord(1,latLeng4);



        List<LatLeng> latLengList = Lists.newArrayList(latLeng1,latLeng2,latLeng3,latLeng4);
        List<GeoCoord> geoCoordList = Lists.newArrayList(coord1,coord2,coord3);

        TreeMap<Double, Double> collect = latLengList.stream().collect(Collectors.toMap(
                l -> l.lat,
                l -> l.leng,
                (u, v) -> v,
                TreeMap::new
        ));
        System.out.println(collect);

        Map<Double, List<LatLeng>> collect1 = latLengList.stream().collect(Collectors.groupingBy(LatLeng::getLat, Collectors.toList()));
        Map<LatLeng, List<GeoCoord>> collect2 = geoCoordList.stream().collect(Collectors.groupingBy(GeoCoord::getLatLeng, Collectors.toList()));

        System.out.println(collect2.keySet().size());
        System.out.println(collect2);


//
//        Map<Integer, String> treeMap02 = Stream.of("4a", "3b", "1d", "2c","2e")
//                .collect(Collectors.toMap(
//                        p -> Integer.valueOf(p.substring(0, 1)),
//                        p -> p.substring(1, 2),
//                        (u, v) -> { throw new IllegalStateException(String.format("Duplicate key %s val %s", u,v)); },
//                        TreeMap::new));
//
//        System.out.println(treeMap02);


//        Map<Integer, String>
//
//                treeMap02 =
//                Stream
//                        .of("4a", "3b", "1d", "2c")
//                        .collect(
//                                Collectors
//                                        .toMap(
//                                                p -> Integer.valueOf(p.substring(0, 1)),
//                                                p -> p.substring(1, 2),
//                                                (u, v) -> { throw new IllegalStateException(String.format("Duplicate key %s", u)); },
//                                                TreeMap::new))
    }
}

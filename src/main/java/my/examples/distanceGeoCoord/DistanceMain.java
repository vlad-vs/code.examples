package my.examples.distanceGeoCoord;

public class DistanceMain {

//32744534	e	2018-11-20 09:03:44.000000	1	ATM	47.84146	35.13505	CAZA4996	473121******9964	10.55.1.83	2
//
    public static void main(String[] args) {

        HaversineAlgorithm algorithm = new HaversineAlgorithm();

        algorithm.HaversineInM(47.84146, 35.13505, 47.841928, 35.136641);

    }


    public static class HaversineAlgorithm {

        final double EARTH_RADIUS = 6378.1370D;
        final double DEGREE_TO_RADIAN_K = (Math.PI / 180D);

        public int HaversineInM(double lat1, double long1, double lat2, double long2) {
            final int dist = (int) (1000D * HaversineInKM(lat1, long1, lat2, long2));
            System.out.println("DistInMetr = " + dist);
            return dist;
        }

        public double HaversineInKM(double lat1, double long1, double lat2, double long2) {
            double dlong = (long2 - long1) * DEGREE_TO_RADIAN_K;
            double dlat = (lat2 - lat1) * DEGREE_TO_RADIAN_K;
            double a = Math.pow(Math.sin(dlat / 2D), 2D) + Math.cos(lat1 * DEGREE_TO_RADIAN_K) * Math.cos(lat2 * DEGREE_TO_RADIAN_K)
                    * Math.pow(Math.sin(dlong / 2D), 2D);
            double c = 2D * Math.atan2(Math.sqrt(a), Math.sqrt(1D - a));
            double d = EARTH_RADIUS * c;

            System.out.println("DistInKm = " + d);
            return d;
        }

    }

}

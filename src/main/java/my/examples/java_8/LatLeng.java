package my.examples.java_8;

import java.util.Objects;

public class LatLeng {

    double lat;

    double leng;

    public LatLeng(double lat, double leng) {
        this.lat = lat;
        this.leng = leng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLeng() {
        return leng;
    }

    public void setLeng(double leng) {
        this.leng = leng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LatLeng latLeng = (LatLeng) o;
        return Double.compare(latLeng.lat, lat) == 0 &&
                Double.compare(latLeng.leng, leng) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lat, leng);
    }

    @Override
    public String toString() {
        return "LatLeng{" +
                "lat=" + lat +
                ", leng=" + leng +
                '}';
    }
}

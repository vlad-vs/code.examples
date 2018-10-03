package _0_java8_solutions.java_8.toMap;

import java.util.Objects;

public class GeoCoord {

    int id;

    LatLeng latLeng;

    public GeoCoord(int id, LatLeng latLeng) {
        this.id = id;
        this.latLeng = latLeng;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LatLeng getLatLeng() {
        return latLeng;
    }

    public void setLatLeng(LatLeng latLeng) {
        this.latLeng = latLeng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeoCoord geoCoord = (GeoCoord) o;
        return id == geoCoord.id &&
                Objects.equals(latLeng, geoCoord.latLeng);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, latLeng);
    }

    @Override
    public String toString() {
        return "GeoCoord{" +
                "id=" + id +
                ", latLeng=" + latLeng +
                '}';
    }
}

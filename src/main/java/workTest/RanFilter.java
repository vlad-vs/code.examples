package workTest;

public class RanFilter extends GeoZoneAbstractFilter{

    private int i;
    private String s;

    private GeoZoneFilter geoZoneFilter;
    private FrmFilter frmFilter;


    private static RanFilter run(Integer integer){
        if (integer.equals(1)) {
            return GeoZoneFilter.create();
        } else return FrmFilter.create();

    }

    @Override
    void run() {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public GeoZoneFilter getGeoZoneFilter() {
        return geoZoneFilter;
    }

    public void setGeoZoneFilter(GeoZoneFilter geoZoneFilter) {
        this.geoZoneFilter = geoZoneFilter;
    }

    public FrmFilter getFrmFilter() {
        return frmFilter;
    }

    public void setFrmFilter(FrmFilter frmFilter) {
        this.frmFilter = frmFilter;
    }
}

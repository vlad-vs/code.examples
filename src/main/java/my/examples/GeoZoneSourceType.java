package my.examples;

import java.util.ArrayList;
import java.util.List;

public enum  GeoZoneSourceType {
    P48((byte) 0),

    RP((byte) 1),

    APP((byte) 2);


    GeoZoneSourceType(int idType) {
        this.idType = idType;
    }

    int idType;


    private static final List<GeoZoneSourceType> typeById =
            new ArrayList<GeoZoneSourceType>(GeoZoneSourceType.values().length) {
                {
                    GeoZoneSourceType[] enumValues = GeoZoneSourceType.values();
                    for (GeoZoneSourceType value : enumValues) {
                        add(value);
                    }
                }
            };


    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public static GeoZoneSourceType getById(byte id) {
        GeoZoneSourceType type = typeById.get(id);
        if (type == null) {
            throw new TypeNotPresentException(String.valueOf(id), null);
        }
        return type;
    }
}

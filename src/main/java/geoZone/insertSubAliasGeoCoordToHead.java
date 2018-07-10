//package geoZone;
//
//import java.util.List;
//
//public class insertSubAliasGeoCoordToHead {
//
//private void insertSubAliasGeoCoordToHead(GeoCoord gc) {
//    // проверка на флаг
//        if (gc.isMain()) {
//        List<Integer> headZoneId = gzMapper.getHeadAliasGeoZone(gc.getZoneId());
//        if (headZoneId.isEmpty()) {
//            log.warn("У данной геозоны {} нет родителей !!! Вставка не произойдет.", headZoneId);
//        }
//        for (Integer zoneId : headZoneId) {
//            try {
//                gzMapper.setGeoZoneGeoCoord(zoneId, gc.getLatLng().getLatitude(), gc.getLatLng().getLongitude(), false);
//            } catch (RuntimeException e) {
//                log.warn("Инсерт координаты {} в существующие координаты хэд зоны!!!{}",gc.toString() ,e );
//            }
//        }
//    } else log.warn("Попытка вставки коррдинрат {} без признака главной координаты", gc.toString());
//
////        List<Integer> headZoneId = gzMapper.getHeadAliasGeoZone(gc.getZoneId());
////        for (Integer zoneId : headZoneId) {
////            try {
////                gzMapper.setGeoZoneGeoCoord(zoneId, gc.getLatLng().getLatitude(), gc.getLatLng().getLongitude(), false);
////            } catch (RuntimeException e) {
////                log.warn("Скорее всего попытка заинсертить новые координаты зоны в существующие координаты хэд зоны...",
////                        e);
////            }
////        }
//}
//}

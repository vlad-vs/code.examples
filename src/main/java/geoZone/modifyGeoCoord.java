//package geoZone;
//
//import java.util.List;
//
//public class modifyGeoCoord {
//
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void modifyGeoCoord(GeoCoord gc) {
//        log.info("Начало => modifyGeoCoord, координата {}", gc.toString());
//        GeoZone geoZone = getGeoZone(gc.getZoneId());
//        List<GeoCoord> geoCoords = geoZone.getGeoCoords();
//
////        if (geoCoords.contains(gc)) {
////            for (GeoCoord coord : geoCoords) {
////                if (coord.isMain()) {
////                    modifyGeoCoordMapper(coord.getZoneId(), coord.getLatLng().getLatitude(),
////                            coord.getLatLng().getLongitude(), false);
////                }
////            }
////            modifyGeoCoordMapper(gc.getZoneId(), gc.getLatLng().getLatitude(),
////                    gc.getLatLng().getLongitude(), true);
////            //      Добавление координат ко всем подключенным алиасам
////            insertSubAliasGeoCoordToHead(gc);
////=================================================================================================
//        // java 8
//        if (geoCoords.contains(gc)) {
//            log.info("Очистка главных координат => modifyGeoCoord");
//            geoCoords.stream()
//                    .filter(GeoCoord::isMain)
//                    .forEach(coord -> modifyGeoCoordWrapper(coord.getZoneId(), coord.getLatLng().getLatitude(),
//                            coord.getLatLng().getLongitude(), false));
//
//            log.info("Установка главной координаты => modifyGeoCoord");
//            modifyGeoCoordWrapper(gc.getZoneId(), gc.getLatLng().getLatitude(),
//                    gc.getLatLng().getLongitude(), true);
//            //      Добавление координат ко всем подключенным алиасам
//            insertSubAliasGeoCoordToHead(gc);
//        } else {
//            log.warn("Геозона {} не найдена!!!", gc.toString());
//        }
////=================================================================================================
//
////=====================old=========================================================================
////        GeoZone geoZone = getGeoZone(gc.getZoneId());
////
////
////        List<GeoCoord> geoCoords = geoZone.getGeoCoords();
////        if (geoCoords.contains(gc)) {
////            //      удаление координаты с подключенным по карте(branch_map) алиасов
////            removeCoordFromAllHeadAlias(gc.getZoneId());
////            for (GeoCoord coord : geoCoords) {
////                if (coord.isMain()) {
////                    gzMapper.modifyGeoCoord(coord.getZoneId(), coord.getLatLng().getLatitude(),
////                            coord.getLatLng().getLongitude(), false);
////                    break;
////                }
////            }
////
////            gzMapper.modifyGeoCoord(gc.getZoneId(), gc.getLatLng().getLatitude(),
////                    gc.getLatLng().getLongitude(), true);
////            //      Добавление координат ко всем подключенным алиасам
////            insertSubAliasGeoCoordToHead(gc);
////        }
//        log.info("Конец => modifyGeoCoord, координата {}", gc.toString());
//    }
//}

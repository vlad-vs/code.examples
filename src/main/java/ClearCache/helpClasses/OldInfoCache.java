//package ClearCache.helpClasses;
//
//import java.util.Map;
//
//public class OldInfoCache {
//
//    @RequestMapping("info/cache")
//    @ResponseBody
//    @EhCacheTransactional
//    public Map<String, Object> ehcaheInfo(
//            @RequestParam(value = "name", required = false) String cacheName,
//            @RequestParam(value = "live", required = false) boolean onlyLiveKeys) throws Throwable {
//
//        return cacheHandlerComponent.getCacheInfo(cacheName,onlyLiveKeys);
//
////        // сущность кеш-менеджера
////        CacheManager instance = CacheManager.getInstance();
////
////        // итоговый ответ
////        Map<String, Object> model = Maps.newHashMap();
////
////        // информация о существующих в приложении кешах и кол-ве ключей в них
////        if (cacheName == null) {
////            String[] cacheNames = instance.getCacheNames();
////            Arrays.sort(cacheNames);
////            LOGGER.info("*** Чтение всех Кешей приложения.");
////            for (String cache : cacheNames) {
////                Cache cacheElem = instance.getCache(cache);
////                List keys;
////                if (onlyLiveKeys) {
////                    keys = cacheElem.getKeysWithExpiryCheck();
////                } else {
////                    keys = cacheElem.getKeys();
////                }
////                model.put(cache, keys.size());
////            }
////            return model;
////        }
////
////        // Детальная информация о конкретном кеше
////        Cache cache = instance.getCache(cacheName);
////        LOGGER.info("*** Чтение содержимого Кеша '{}'. Текущие значения ключей - {}.", cache.getName(),
////                cache.getKeysWithExpiryCheck());
////        model.put("Keys in cache: ", cache.getKeys());
////        model.put("Keys With Expiry Check in cache: ", cache.getKeysWithExpiryCheck());
////        model.put("cacheSize", (float) cache.calculateInMemorySize() / 1024.f);
////        model.put("cacheDiskSize", (float) cache.calculateOnDiskSize() / 1024.f);
////
////        // информация о значении кеша по конкретному ключу
////        List<Map<String, Object>> contexts = Lists.newArrayList();
////        for (Object k : cache.getKeysWithExpiryCheck()) {
////            Map<String, Object> contextInfo = Maps.newHashMap();
////            final Element element = cache.get(k);
////            if (element != null) {
////                contextInfo.put("key: ", element.getKey());
////                contextInfo.put("value: ", element.getObjectValue());
////                contextInfo.put("timeToLive: ", element.getTimeToLive());
////                contextInfo.put("isExpired: ", element.isExpired());
////                contextInfo.put("isEternal: ", element.isEternal());
////                contextInfo.put("last cr_up_T: ", element.getLatestOfCreationAndUpdateTime());
////                contexts.add(contextInfo);
////            }
////        }
////        model.put("Entry: ", contexts);
////        return model;
//    }
//}

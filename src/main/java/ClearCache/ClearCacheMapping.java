//package ClearCache;
//
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//public class ClearCacheMapping {
//
//    /**
//     * очистка кэша
//     */
//    @RequestMapping("clear/cache")
//    @ResponseBody
//    public Map<String, Serializable> clearCache(@RequestParam(value = "name", required = true) String name,
//                                                @RequestParam(value = "part", required = false) Integer partSize,
//                                                @RequestParam(value = "timeout", required = false) Integer timeOut) {
//        Map<String, java.io.Serializable> model = Maps.newHashMap();
//        CacheManager instance = CacheManager.getInstance();
//        int size = 1000;
//        if (partSize != null && partSize > 0) {
//            size = partSize;
//        }
//
//        int curTimeout = instance.getTransactionController().getDefaultTransactionTimeout();
//        if (timeOut != null && timeOut > curTimeout){
//            curTimeout = timeOut;
//
//        }
//        LOGGER.info("Чистим кеш - {}, размер удаляемой пачки - {} элементов, таймаут - {} сек.", name, size, curTimeout);
//        Cache cache = instance.getCache(name);
//        if (cache != null) {
//            instance.getTransactionController().begin(curTimeout);
//            List keys = cache.getKeys();
//            instance.getTransactionController().commit();
//            final int allKeysCount = keys.size();
//            LOGGER.info("В кеше найдено {} ключ(-а, -ей) по методу cache.getKeys()", allKeysCount);
//            model.put("Keys in cache before", allKeysCount);
//            List<Object> keyse = new ArrayList<>();
//            keyse.addAll(keys);
//            List<List<Object>> partition = Lists.partition(keyse, size);
//
//            int iterCount = 0;
//            for (List<Object> part : partition) {
//                instance.getTransactionController().begin(curTimeout);
//                cache.removeAll(part);
//                instance.getTransactionController().commit();
//                LOGGER.info("Удалил ~{} из {} элементов из кеша {}", iterCount * part.size(), allKeysCount, name);
//                iterCount++;
//            }
//            LOGGER.info("Кеш {} очищен! Текущеее состояние:" + cache, name);
//        } else {
//            model.put("error", "Cache " + name + " not found");
//        }
//        model.put("OK", "OK");
//        return model;
//    }
//
//}

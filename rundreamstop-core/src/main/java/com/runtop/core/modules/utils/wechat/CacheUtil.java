package com.runtop.core.modules.utils.wechat;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * 追忆寻梦
 * rundreams.net
 * <p>
 * 通过key 获取到缓存值的时候 关注expired 这个字段  是否为过期
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
@Slf4j
public class CacheUtil {

    private static HashMap<String, Object> cacheMap = new HashMap<String, Object>();

    // 单实例构造方法
    private CacheUtil() {

    }

    private synchronized static Cache getCache(String key) {
        return (Cache) cacheMap.get(key);
    }

    private synchronized static boolean hasCache(String key) {
        return cacheMap.containsKey(key);
    }

    public synchronized static void invalidateAll() {
        cacheMap.clear();
    }

    public synchronized static void invalidate(String key) {
        cacheMap.remove(key);
    }

    private synchronized static void putCache(String key, Cache object) {
        cacheMap.put(key, object);
    }

    /**
     * 通过key 获取缓存 Cache
     *
     * @param key
     * @return
     */
    public static Cache getContent(String key) {
        if (hasCache(key)) {
            Cache cache = getCache(key);
            if (cacheExpired(cache)) {
                cache.setExpired(true);
            }
            return cache;
        } else {
            return null;
        }
    }

    /**
     * 通过key 获取缓存的值,如果值不存在或者过期 返回 null
     *
     * @param key
     * @return
     */
    public static Object getValues(String key) {
        if (hasCache(key)) {
            Cache cache = getCache(key);
            if (cacheExpired(cache)) {
                return null;
            } else {
                return cache.getValue();
            }
        } else {
            return null;
        }
    }

    /**
     * @param key     缓存key
     * @param content 缓存 值
     * @param time    超时时间  以秒为单位
     */
    public static void putContent(String key, Object content, long time) {
        Cache cache = new Cache();
        cache.setKey(key);
        cache.setValue(content);
        cache.setTimeOut(time * 1000 + System.currentTimeMillis());
        cache.setExpired(false);
        log.info("time putContent={}", cache.getTimeOut());
        putCache(key, cache);
    }

    /**
     * @param key     缓存key
     * @param content 缓存 值
     */
    public static void putContent(String key, Object content) {
        Cache cache = new Cache();
        cache.setKey(key);
        cache.setValue(content);
        cache.setTimeOut(31536000 * 1000 + System.currentTimeMillis());
        cache.setExpired(false);
        log.info("过期时间为1年putContent={}", cache.getTimeOut());
        putCache(key, cache);
    }

    /**
     * 验证缓存过期时间
     *
     * @param cache
     * @return
     */
    private static boolean cacheExpired(Cache cache) {
        if (cache == null) {
            return false;
        }
        long milisNow = System.currentTimeMillis();
        long milisExpire = cache.getTimeOut();
        if (milisExpire < 0) { // Cache never expires
            return false;
        } else if (milisNow >= milisExpire) {
            return true;
        } else {
            return false;
        }
    }
}

package com.runtop.core.modules.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;


/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class HashMapToObjectUtil {

    private static Logger logger = LoggerFactory
            .getLogger(HashMapToObjectUtil.class);

    /**
     * HashMap->Object
     *
     * @param map
     * @param obj
     */
    public static void setObject(Map<String, String> map, Object obj) {
        if (map != null) {
            for (Entry<String, String> entry : map.entrySet()) {
                try {
                    setFieldValue(entry.getKey(), obj, entry.getValue());
                } catch (Exception e) {
                    logger.warn("hash to object fail", e);
                }
            }
        }
    }

    /**
     * 反映获取指定字段值
     *
     * @param fieldName
     * @param obj
     * @return
     */
    public static String getFieldValue(String fieldName, Object obj)
            throws Exception {
        try {
            String methodName = getMethodName("get", fieldName);
            Method method = getDeclaredMethod(obj, methodName, new Class[0]);
            if (method != null) {
                method.setAccessible(true);
                return defaultObject(method.invoke(obj, new Object[0]));
            }
        } catch (Exception ex) {
            logger.error("获取对象值失败:", ex);
            throw new Exception("获取对象值失败!");
        }
        return "";
    }

    /**
     * 反映设置指定字段值
     *
     * @param fieldName
     * @param obj
     * @param fieldValue
     */
    public static void setFieldValue(String fieldName, Object obj,
                                     Object fieldValue) throws Exception {
        try {
            String methodName = getMethodName("set", fieldName);
            Method method = getDeclaredMethod(obj, methodName,
                    fieldValue.getClass());
            if (method != null) {
                method.setAccessible(true);
                method.invoke(obj, new Object[]{fieldValue});
            }
        } catch (Exception ex) {
            logger.error("设置对象值失败:", ex);
            throw new Exception("设置对象值失败!");
        }
    }

    /**
     * 获取方法名称
     *
     * @param prefix
     * @param fieldName
     * @return
     */
    private static String getMethodName(String prefix, String fieldName) {
        return prefix + fieldName.substring(0, 1).toUpperCase()
                + fieldName.substring(1);
    }

    /**
     * 查找方法
     *
     * @param object
     * @param methodName
     * @param parameterTypes
     * @return
     */
    private static Method getDeclaredMethod(Object object, String methodName,
                                            Class<?>... parameterTypes) {
        Method method = null;
        for (Class<?> clazz = object.getClass(); clazz != Object.class; clazz = clazz
                .getSuperclass()) {
            try {
                method = clazz.getDeclaredMethod(methodName, parameterTypes);
                return method;
            } catch (Exception e) {
            }
        }
        return null;
    }

    /**
     * 设置默认值
     *
     * @param obj
     * @return
     */
    private static String defaultObject(Object obj) {
        if (obj == null) {
            return "";
        } else {
            return String.valueOf(obj);
        }
    }

}

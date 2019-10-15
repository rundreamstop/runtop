package com.runtop.core.modules.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

public class MapUtil {

    private static Logger logger = LoggerFactory.getLogger(MapUtil.class);

    /**
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String, Object> introspect(Object obj) {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            BeanInfo info = Introspector.getBeanInfo(obj.getClass());
            for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
                Method reader = pd.getReadMethod();
                Object Object = reader.invoke(obj);
                String name = pd.getName();
                if (reader != null)
                    if (Object != null && !name.equals("class")) {
                        result.put(name, Object);
                    }
            }
        } catch (Exception e) {
            logger.warn("Object转Map出错: obj={}", obj);
            logger.warn("Object转Map出错", e);
        }

        return result;
    }

}

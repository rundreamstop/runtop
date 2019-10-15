package com.runtop.core.modules.template.base;

import java.io.Serializable;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class ApplicationContextHolder implements Serializable {
    private static final long serialVersionUID = -3709425800955774451L;

    /**
     * 应用上下文, 所在ThreadLocal.
     */
    private static InheritableThreadLocal<ApplicationContext<?, ?, ?>> contextLocal = new InheritableThreadLocal<ApplicationContext<?, ?, ?>>();

    /**
     * 获取上下文.
     */
    @SuppressWarnings("unchecked")
    public static <REQUEST, DOMAIN, RESPONSE> ApplicationContext<REQUEST, DOMAIN, RESPONSE> get() {
        return (ApplicationContext<REQUEST, DOMAIN, RESPONSE>) contextLocal.get();
    }

    /**
     * 赋予上下文.
     */
    public static <REQUEST, DOMAIN, RESPONSE> void set(ApplicationContext<REQUEST, DOMAIN, RESPONSE> context) {
        contextLocal.set(context);
    }

    /**
     * 清理充值上下文.
     */
    public static void clear() {
        contextLocal.set(null);
    }
}

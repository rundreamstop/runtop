package com.runtop.core.modules.test.tomcat;

import org.springframework.core.env.AbstractEnvironment;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2018/8/16
 */
public class Profiles {

    public static final String ACTIVE_PROFILE = AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME;

    public static final String DEFAULT_PROFILE = AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME;

    // 生成环境
    public static final String PRO = "pro";

    // 预发布环境
    public static final String PRE = "pre";

    // 测试环境
    public static final String TEST = "test";

    // 开发环境
    public static final String DEV = "dev";

    // 单元测试 【方便加载相应服务】
    public static final String UNIT_TESTING = "unit_testing";


    /**
     * 在Spring启动前, 设置profile的环境变量.
     */
    public static void setProfileAsSystemProperty(String profile) {
        System.setProperty(ACTIVE_PROFILE, profile);
    }

}

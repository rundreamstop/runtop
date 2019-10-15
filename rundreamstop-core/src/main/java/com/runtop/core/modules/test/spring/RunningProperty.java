package com.runtop.core.modules.test.spring;

import ch.qos.logback.core.PropertyDefinerBase;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2018/11/13
 */

public class RunningProperty extends PropertyDefinerBase {

    public String getPropertyValue() {
        String springProfiles = System.getProperty("spring.profiles.active");
        System.out.println("当前日志环境springProfiles=" + springProfiles);
        return springProfiles;
    }
}

package com.runtop.core.modules.utils.wechat;

import lombok.Getter;
import lombok.Setter;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2019/5/11 0011
 */
@Setter
@Getter
public class Cache {

    /**
     * 缓存的key
     */
    private String key;

    /**
     * 缓存的值
     */
    private Object value;

    /**
     * 超时时间 以 秒为 单位
     */
    private long timeOut;

    /**
     * 是否过期
     */
    private boolean expired;

    public Cache() {
        super();
    }

    public Cache(String key, String value, long timeOut, boolean expired) {
        this.key = key;
        this.value = value;
        this.timeOut = timeOut;
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Cache{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", timeOut=" + timeOut +
                ", expired=" + expired +
                '}';
    }

}

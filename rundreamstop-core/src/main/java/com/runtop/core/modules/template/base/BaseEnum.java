package com.runtop.core.modules.template.base;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
@JsonSerialize(using = EnumSerializer.class)
public interface BaseEnum<E extends Enum<?>, T> {

    /**
     * 值.
     */
    T getValue();

    /**
     * 显示值.
     */
    String getDisplayName();

    /**
     * 根据value获取枚举.
     */
    E getEnum(T value);

    /**
     * 获取枚举Map, key为value, val为enum.
     */
    Map<T, E> getAllValueMap();

}

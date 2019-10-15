package com.runtop.core.modules.template.base;


import com.runtop.core.modules.template.services.BaseResponseDTO;

/**
 * 简单的模板方法
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public interface SimpleExecutor<POJO> {

    /**
     * 前置处理.
     */
    POJO before();

    /**
     * 业务处理.
     */
    void process(POJO pojo);

    /**
     * 转换.
     */
    void conver(POJO pojo, BaseResponseDTO response);
}

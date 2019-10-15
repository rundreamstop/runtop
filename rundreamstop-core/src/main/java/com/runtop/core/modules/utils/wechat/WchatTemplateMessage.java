package com.runtop.core.modules.utils.wechat;

import lombok.Data;

import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zhangzihao rundreams@yeah.net  @Time:2019\5\17 0017
 */

@Data
public class WchatTemplateMessage {


    private String template_id;

    /**
     * oepnid
     */
    private String touser;

    /**
     * 跳转链接
     */
    private String url;

    /**
     * 消息模封装
     */
    private Map<String, TemplateData> data;
}

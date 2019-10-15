package com.runtop.core.modules.utils.wechat;

import lombok.Data;

import java.io.Serializable;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zhangzihao rundreams@yeah.net  @Time:2019\5\17 0017
 */

@Data
public class TemplateData implements Serializable {

    private String value;

    private String color = "#173177";

    public final static String defaultColor = "#173177";
}

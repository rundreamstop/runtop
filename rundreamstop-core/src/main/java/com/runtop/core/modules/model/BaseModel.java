package com.runtop.core.modules.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class BaseModel implements Serializable {

    private static final long serialVersionUID = -8365266282922157793L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

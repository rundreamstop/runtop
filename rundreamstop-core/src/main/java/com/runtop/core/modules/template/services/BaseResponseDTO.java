package com.runtop.core.modules.template.services;

import com.deao.modules.template.enums.ResponseCodeEnums;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

@Setter
@Getter
public  class BaseResponseDTO implements Serializable {

    private static final long serialVersionUID = 7971104209433980436L;

    /**
     * id.
     */
    private Long id;

    /**
     * 请求是否接收成功.
     */
    private boolean success;

    /**
     * 业务是否执行成功.
     */
    private boolean executed;

    /**
     * 应答码.
     */
    private ResponseCodeEnums responseCode;

    /**
     * 返回信息.
     */
    private String message;

    /**
     * 内部消息
     */
    private String insideMessage;

    /**
     * 扩展信息.
     */
    private String extend;

    public BaseResponseDTO() {
        responseCode = ResponseCodeEnums.UNKNOWN_EXCEPTION;
    }

      @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}

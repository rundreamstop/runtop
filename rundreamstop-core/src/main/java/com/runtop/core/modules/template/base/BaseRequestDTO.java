package com.runtop.core.modules.template.base;


import com.deao.modules.template.constants.FacadeConstants;
import com.deao.modules.template.validate.BeanValidators;
import com.deao.modules.template.validate.groups.GidGroup;
import com.deao.modules.template.validate.groups.OperatorGroup;
import com.deao.modules.utils.StringUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;
import java.io.Serializable;


/**
 * Request DTO基类.
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

@Getter
@Setter
public abstract class BaseRequestDTO implements Serializable {

    private static final long serialVersionUID = -4276711652688970474L;
    /**
     * 全局流水号.
     */
    @NotBlank(groups = GidGroup.class)
    @Size(min = FacadeConstants.GID_LENGTH, max = FacadeConstants.GID_LENGTH, groups = GidGroup.class)
    private String gid;

    /**
     * 操作人用户ID.
     */
    @NotNull(groups = {OperatorGroup.class})
    private Long operatorId;

    /**
     * 操作人用户名.
     */
    @NotBlank(groups = {OperatorGroup.class})
    private String operator;

    /**
     * 操作人机构ID.
     */
    @NotBlank(groups = {OperatorGroup.class})
    private String operatorOrgId;

       /**
     * 是否校验gid, 业务场景决定.
     */
    protected abstract boolean isValidGid();

    /**
     * 校验RequestDTO.
     * <p>
     * 提供给外部调用.
     */
    public abstract void valid();

    /**
     * JSR303校验.
     */
    protected final void validate(Object object, Class<?>... groups) {

        if (0 == groups.length) {
            groups = ArrayUtils.add(groups, Default.class);
        }

        // gid.
        if (isValidGid()) {
            groups = ArrayUtils.add(groups, GidGroup.class);
        }

        // 校验.
        String errorMessages = BeanValidators.validateWithString(object, groups);
        System.out.println("303校验返回信息errorMessages=" + errorMessages);

        // 有错误信息则抛出IllegalArgumentException异常.
        if (StringUtil.isNotBlank(errorMessages)) {
            throw new IllegalArgumentException(errorMessages);
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
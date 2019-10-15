package com.runtop.core.modules.utils.wechat;

import lombok.Data;

import java.io.Serializable;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2019/5/11 0011
 */

@Data
public class WechatUserInfo implements Serializable{

    private static final long serialVersionUID = 660725993456289963L;

    private String openid;

    private String nickname;

    private String sex;

    private String headimgurl;

    private String unionid;

    private String province;

    private String city;
}

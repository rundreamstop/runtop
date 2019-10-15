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
public class WechatConstans implements Serializable {

    // 这个就是自己要保管好的私有Key了（切记只能放在自己的后台代码里，不能放在任何可能被看到源代码的客户端程序中）
    // 每次自己Post数据给API的时候都要用这个key来对所有字段进行签名，生成的签名会放在Sign这个字段，API收到Post数据的时候也会用同样的签名算法对Post过来的数据进行签名和验证
    // 收到API的返回的时候也要用这个key来对返回的数据算下签名，跟API的Sign数据进行比较，如果值不一致，有可能数据被第三方给篡改
    public static String app_secret = "5509fc76c6965bffc288cc4067d9de6c";

    // 微信分配的公众号ID（开通公众号之后可以获取到）
    public static String appid = "wxc8730ef3b31ca674";

    // 微信重定向地址
    public String wechat_redirect_uri;

    // 微信支付分配的商户号ID（开通公众号的微信支付功能之后可以获取到）
    public static String mchid;

    // 微信支付 设置API密钥.
    public static String wechat_key;

    // wechat token
    public static String wechat_token = "zhibeizhen";

    // 微信支付异步通知地址
    public String notify_url;

    // 微信号
    public String dev_wechat_name;

    // 编码
    public static String CHARSET = "utf-8";

    // MD5
    public static String MD5 = "MD5";
}

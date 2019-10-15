package com.runtop.core.modules.template.base;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class ApplicationContext<REQUEST, DOMAIN, RESPONSE> implements Serializable {
    private static final long serialVersionUID = 8125182009158328901L;

    /**
     * Request.
     */
    private REQUEST request;

    /**
     * Domain.
     */
    private DOMAIN domain;

    /**
     * Response
     */
    private RESPONSE response;

    /**
     * 冗余字段, 用于系统流转.
     */
    private Map<String, Object> attribute = new HashMap<String, Object>();

    public ApplicationContext(REQUEST request, DOMAIN domain, RESPONSE response) {
        this.request = request;
        this.domain = domain;
        this.response = response;
    }

    public REQUEST getRequest() {
        return request;
    }

    public void setRequest(REQUEST request) {
        this.request = request;
    }

    public DOMAIN getDomain() {
        return domain;
    }

    public void setDomain(DOMAIN domain) {
        this.domain = domain;
    }

    public RESPONSE getResponse() {
        return response;
    }

    public void setResponse(RESPONSE response) {
        this.response = response;
    }

    public Map<String, Object> getAttribute() {
        return attribute;
    }

    public void setAttribute(Map<String, Object> attribute) {
        this.attribute = attribute;
    }

    public void addAttribute(String key, Object value) {
        attribute.put(key, value);
    }

    public void addAttributes(Map<String, Object> params) {
        attribute.putAll(params);
    }

    public Object getAttribute(String key) {
        Object value = null;
        if (attribute.containsKey(key)) {
            value = attribute.get(key);
        }
        return value;
    }
}

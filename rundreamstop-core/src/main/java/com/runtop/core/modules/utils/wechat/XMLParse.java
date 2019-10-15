package com.runtop.core.modules.utils.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.Date;

/**
 * XMLParse class
 * <p>
 * 提供提取消息格式中的密文及生成回复消息格式的接口.
 */
public class XMLParse {

    private static final Logger logger = LoggerFactory.getLogger(XMLParse.class);

    /**
     * 提取出xml数据包中的加密消息
     *
     * @param xmltext 待提取的xml字符串
     * @return 提取出的加密消息字符串
     */
    public static Object[] extract(String xmltext) {
        Object[] result = new Object[3];
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            StringReader sr = new StringReader(xmltext);
            InputSource is = new InputSource(sr);
            Document document = db.parse(is);

            Element root = document.getDocumentElement();
            NodeList nodelist1 = root.getElementsByTagName("Encrypt");
            NodeList nodelist2 = root.getElementsByTagName("ToUserName");
            result[0] = 0;
            result[1] = nodelist1.item(0).getTextContent();
            result[2] = nodelist2.item(0).getTextContent();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 生成xml消息
     *
     * @param encrypt   加密后的消息密文
     * @param signature 安全签名
     * @param timestamp 时间戳
     * @param nonce     随机字符串
     * @return 生成的xml字符串
     */
    public static String generate(String encrypt, String signature, String timestamp,
                                  String nonce) {

        String format = "<xml>\n" + "<Encrypt><![CDATA[%1$s]]></Encrypt>\n"
                + "<MsgSignature><![CDATA[%2$s]]></MsgSignature>\n"
                + "<TimeStamp>%3$s</TimeStamp>\n" + "<Nonce><![CDATA[%4$s]]></Nonce>\n"
                + "</xml>";
        return String.format(format, encrypt, signature, timestamp, nonce);

    }

    /**
     * 提取出xml数据包中的加密消息
     *
     * @param xmltext 待提取的xml字符串
     * @return 提取出的加密消息字符串
     */
    public static String[] getEventTypeAndOpenId(String xmltext) {
        String openId = "";
        String event = "";
        String platformId = "";
        String[] ret = new String[3];
        logger.info("xml={}", xmltext);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            StringReader sr = new StringReader(xmltext);
            InputSource is = new InputSource(sr);
            Document document = db.parse(is);

            Element root = document.getDocumentElement();
            NodeList nodelist1 = root.getElementsByTagName("FromUserName");
            NodeList nodelist2 = root.getElementsByTagName("Event");
            NodeList nodelist3 = root.getElementsByTagName("ToUserName");
            openId = nodelist1.item(0).getTextContent();
            event = nodelist2.item(0).getTextContent();
            platformId = nodelist3.item(0).getTextContent();
            ret[0] = openId;
            ret[1] = event;
            ret[2] = platformId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 简易的被动回复xml构建，有新的了，这个只是欢迎信息调用，以后有机会请换为下面buildNegativeResponseTextXml这个方法
     *
     * @param toUser
     * @param fromUser
     * @param createTime
     * @param msgType
     * @param content
     * @return
     */
    public static String buildXml(String toUser, String fromUser, String createTime, String msgType,
                                  String content) {
        StringBuffer sb = new StringBuffer();

        sb.append("<xml>");
        sb.append("<ToUserName><![CDATA[");
        sb.append(toUser);
        sb.append("]]></ToUserName>");
        sb.append("<FromUserName><![CDATA[");
        sb.append(fromUser);
        sb.append("]]></FromUserName>");
        sb.append("<CreateTime>");
        sb.append(createTime);
        sb.append("</CreateTime>");
        sb.append("<MsgType><![CDATA[");
        sb.append(msgType);
        sb.append("]]></MsgType>");
        sb.append("<Content><![CDATA[");
        sb.append(content);
        sb.append("]]></Content>");
        sb.append("</xml>");
        return sb.toString();
    }

    /**
     * 用户发送消息到公众号，微信服务器发送给我们服务器的XML数据其格式为：
     * <xml> <ToUserName><![CDATA[gh_680bdefc8c5d]]></ToUserName>
     * <FromUserName><![CDATA[oIDrpjqASyTPnxRmpsS9O_ruZGsfk]]></FromUserName>
     * <CreateTime>1359028446<CreateTime> <MsgType><![CDATA[text]]></MsgType>
     * <Content><![CDATA[?]]></Content>
     * <MsgId>5836982729904121631</MsgId> </xml>
     * <p>
     * 其中？就是用户发送的内容
     *
     * @param xmltext
     * @return
     */
    public static String[] getMessageInfo(String xmltext) {
        String openId = "";
        String wechatId = "";
        String content = "";
        String[] ret = new String[3];
        logger.error("xml：" + xmltext);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            StringReader sr = new StringReader(xmltext);
            InputSource is = new InputSource(sr);
            Document document = db.parse(is);

            Element root = document.getDocumentElement();
            NodeList nodelist1 = root.getElementsByTagName("FromUserName");
            NodeList nodelist3 = root.getElementsByTagName("ToUserName");
            NodeList nodelist2 = root.getElementsByTagName("Content");
            openId = nodelist1.item(0).getTextContent();
            wechatId = nodelist3.item(0).getTextContent();
            content = nodelist2.item(0).getTextContent();
            ret[0] = openId;
            ret[1] = wechatId;
            ret[2] = content;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * 创建被动回复文本类型(text)消息的XML字符串
     *
     * @param toUser
     * @param fromUser
     * @param createTime
     * @param content
     * @return
     */
    public static String buildNegativeResponseTextXml(String toUser, String fromUser,
                                                      String content) {
        StringBuffer str = new StringBuffer(
                "<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]></FromUserName><CreateTime>createTime</CreateTime><MsgType><![CDATA[text]]></MsgType><Content><![CDATA[content]]></Content></xml>");
        str.replace(str.indexOf("toUser"), str.indexOf("toUser") + "toUser".length(), toUser);
        str.replace(str.indexOf("fromUser"), str.indexOf("fromUser") + "fromUser".length(),
                fromUser);
        str.replace(str.indexOf("createTime"), str.indexOf("createTime") + "createTime".length(),
                new Date().getTime() + "");
        str.replace(str.indexOf("content"), str.indexOf("content") + 7, content);
        return str.toString();
    }
}

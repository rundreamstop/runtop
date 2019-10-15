
package com.runtop.core.modules.aop;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class PasswordUtil {
    private static Logger logger = LoggerFactory.getLogger(PasswordUtil.class);

    public static String shadowPassword(Object original) {
        return shadowPassword(ToStringBuilder.reflectionToString(original));
    }

    public static String shadowPassword(String original) {
        String replacedString = null;

        if (original == null) {
            return null;
        }

        replacedString = shadowIt(original, "Password=.+?,", "Password=******,");

        return replacedString;
    }

    /**
     * @param original
     */
    private static String shadowIt(String original, String regx, String replaceStr) {
        String replacedString = null;

        try {
            Pattern pattern = Pattern.compile(regx);
            Matcher matcher = pattern.matcher(original);
            if (matcher.find()) {
                replacedString = matcher.replaceAll(replaceStr);
            } else {
                return original;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return original;
        }
        return replacedString;
    }

    public static String decrypt(HttpServletRequest request, String encryptedPassword) {
        HttpSession session = request.getSession();
        String key = (String) session.getAttribute(session.getId());
        AESEncrypt aesEncrypt = new AESEncrypt();
        aesEncrypt.setIvParameter(key);
        aesEncrypt.setsKey(key);

        try {
            return aesEncrypt.decrypt(encryptedPassword);
        } catch (Exception e) {
            logger.error("解密密码失败", e);
            return "";
        }
    }

}

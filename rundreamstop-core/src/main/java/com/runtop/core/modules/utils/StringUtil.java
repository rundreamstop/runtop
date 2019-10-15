package com.runtop.core.modules.utils;

import org.apache.commons.codec.binary.Base64;

import java.util.Collection;
import java.util.Map;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

public class StringUtil {

    /**
     * 将以逗号分隔的字符串转换成字符串数组
     *
     * @param valStr
     * @return String[]
     */
    public static String[] StrList(String valStr) {
        int i = 0;
        String TempStr = valStr;
        String[] returnStr = new String[valStr.length() + 1 - TempStr.replace(",", "").length()];
        valStr = valStr + ",";
        while (valStr.indexOf(',') > 0) {
            returnStr[i] = valStr.substring(0, valStr.indexOf(','));
            valStr = valStr.substring(valStr.indexOf(',') + 1, valStr.length());

            i++;
        }
        return returnStr;
    }

    /**
     * 获取字符串编码
     *
     * @param str
     * @return
     */
    public static String getEncoding(String str) {
        String encode = "GB2312";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s = encode;
                return s;
            }
        } catch (Exception exception) {
        }
        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s1 = encode;
                return s1;
            }
        } catch (Exception exception1) {
        }
        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s2 = encode;
                return s2;
            }
        } catch (Exception exception2) {
        }
        encode = "GBK";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s3 = encode;
                return s3;
            }
        } catch (Exception exception3) {
        }
        return "";
    }

    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0;
    }

    public static boolean isNotEmpty(Object pObj) {
        if (pObj == null || "".equals(pObj)) {
            return false;
        }
        if (pObj instanceof String) {
            if (((String) pObj).trim().length() == 0) {
                return false;
            }
        } else if (pObj instanceof Collection<?>) {
            if (((Collection<?>) pObj).size() == 0) {
                return false;
            }
        } else if (pObj instanceof Map<?, ?>) {
            if (((Map<?, ?>) pObj).size() == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return false;
                }
            }

            return true;
        } else {
            return true;
        }
    }

    public static boolean isNotBlank(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            for (int i = 0; i < length; ++i) {
                if (!Character.isWhitespace(str.charAt(i))) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public static boolean hasBlank(String... str) {
        if (str == null) {
            return true;
        } else {
            for (int i = 0; i < str.length; ++i) {
                if (isBlank(str[i])) {
                    return true;
                }
            }

            return false;
        }
    }

    public static String defaultIfNull(String str) {
        return str == null ? "" : str;
    }

    public static String defaultIfNull(String str, String defaultStr) {
        return str == null ? defaultStr : str;
    }

    public static String defaultIfEmpty(String str) {
        return str == null ? "" : str;
    }

    public static String defaultIfEmpty(String str, String defaultStr) {
        return str != null && str.length() != 0 ? str : defaultStr;
    }

    public static String defaultIfBlank(String str) {
        return isBlank(str) ? "" : str;
    }

    public static String defaultIfBlank(String str, String defaultStr) {
        return isBlank(str) ? defaultStr : str;
    }

    public static String trim(String str) {
        return trim(str, (String) null, 0);
    }

    public static String trim(String str, String stripChars) {
        return trim(str, stripChars, 0);
    }

    public static String trimStart(String str) {
        return trim(str, (String) null, -1);
    }

    public static String trimStart(String str, String stripChars) {
        return trim(str, stripChars, -1);
    }

    public static String trimEnd(String str) {
        return trim(str, (String) null, 1);
    }

    public static String trimEnd(String str, String stripChars) {
        return trim(str, stripChars, 1);
    }

    public static String trimToNull(String str) {
        return trimToNull(str, (String) null);
    }

    public static String trimToNull(String str, String stripChars) {
        String result = trim(str, stripChars);
        return result != null && result.length() != 0 ? result : null;
    }

    public static String trimToEmpty(String str) {
        return trimToEmpty(str, (String) null);
    }

    public static String trimToEmpty(String str, String stripChars) {
        String result = trim(str, stripChars);
        return result == null ? "" : result;
    }

    private static String trim(String str, String stripChars, int mode) {
        if (str == null) {
            return null;
        } else {
            int length = str.length();
            int start = 0;
            int end = length;
            if (mode <= 0) {
                if (stripChars == null) {
                    while (start < end && Character.isWhitespace(str.charAt(start))) {
                        ++start;
                    }
                } else {
                    if (stripChars.length() == 0) {
                        return str;
                    }

                    while (start < end && stripChars.indexOf(str.charAt(start)) != -1) {
                        ++start;
                    }
                }
            }

            if (mode >= 0) {
                if (stripChars == null) {
                    while (start < end && Character.isWhitespace(str.charAt(end - 1))) {
                        --end;
                    }
                } else {
                    if (stripChars.length() == 0) {
                        return str;
                    }

                    while (start < end && stripChars.indexOf(str.charAt(end - 1)) != -1) {
                        --end;
                    }
                }
            }

            return start <= 0 && end >= length ? str : str.substring(start, end);
        }
    }

    public static boolean equals(String str1, String str2) {
        return str1 == null ? str2 == null : str1.equals(str2);
    }

    public static boolean notEquals(String str1, String str2) {
        return str1 == null ? str2 == null : !str1.equals(str2);
    }


    public static String strUpp(String s) {
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            sb.append(Character.toUpperCase(str[i].charAt(0))).append(str[i].substring(1));
            sb.append(" ");
        }
        return sb.toString();
    }


    /**
     * BASE64解码
     *
     * @param str
     * @return
     */
    public static String decode(String str) {
        byte[] bytes = str.getBytes();
        return new String(Base64.decodeBase64(bytes));
    }

    /**
     * BASE64编码
     *
     * @param str
     * @return
     * @throws Exception
     */
    public static String encode(String str) {
        byte[] bytes = str.getBytes();
        return new String(Base64.encodeBase64(bytes));
    }

    /**
     * 是否包含字符串
     *
     * @param str 验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inStringIgnoreCase(String str, String... strs)
    {
        if (str != null && strs != null)
        {
            for (String s : strs)
            {
                if (str.equalsIgnoreCase(trim(s)))
                {
                    return true;
                }
            }
        }
        return false;
    }
}

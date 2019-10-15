package com.runtop.core.modules.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

public class ValidateUtil {

    // 保存每个月的天数
    private static final int[] DAYS_OF_MONTH = {31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};
    // 日历的起始年份
    public static final int START_YEAR = 1900;

    // 日历的结束年份
    public static final int END_YEAR = 2100;

    /**
     * 验证是否为手机号
     *
     * @param mobileNo
     * @return
     */
    public static boolean isValidMobileNo(String mobileNo) {
        // 1、(13[0-9])|(15[02789])|(18[679])|(17[0-9]) 13段 或者15段 18段17段的匹配
        // 2、\\d{8} 整数出现8次
        boolean flag = false;
        Pattern p = Pattern.compile("^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-9]))\\d{8}$");
        Matcher match = p.matcher(mobileNo);
        if (mobileNo != null) {
            flag = match.matches();
        }
        return flag;
    }


    /**
     * 验证是否为正确的邮箱号
     *
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        // 1、\\w+表示@之前至少要输入一个匹配字母或数字或下划线 \\w 单词字符：[a-zA-Z_0-9]
        // 2、(\\w+\\.)表示域名. 如新浪邮箱域名是sina.com.cn
        // {1,3}表示可以出现一次或两次或者三次.
        String reg = "\\w+@(\\w+\\.){1,3}\\w+";
        Pattern pattern = Pattern.compile(reg);
        boolean flag = false;
        if (email != null) {
            Matcher matcher = pattern.matcher(email);
            flag = matcher.matches();
        }
        return flag;
    }

    public static boolean isValidIdCard(String cardStr) {
        boolean flag = false;
        Pattern pEighteen = Pattern.compile("^\\d{17}(\\d{1}|x)$");// 18位身份证号码
        // 包括末尾是“x”的校验码
        Pattern pFifteen = Pattern.compile("^\\d{15}$");// 15位身份证号码
        if (cardStr != null) {
            if (pEighteen.matcher(cardStr).matches()) // 18位身份证号码验证通过
            {
                if (isValidDate(cardStr.substring(6, 14)))// 18位身份证号码
                // 出生年月日验证通过
                {
                    flag = true;
                }
            }
            if (pFifteen.matcher(cardStr).matches()) // 15位身份证号码验证通过
            {
                if (isValidDay(cardStr.substring(6, 12))) // 15位身份证出身年月日的验证
                {
                    flag = true;
                }
            }
        }
        return flag;

    }

    /**
     * 检查天数是否在有效的范围内
     * 因为天数会根据年份和月份的不同而不同 所以必须依赖年份和月份进行检查
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static boolean isValidDay(int year, int month, int day) {
        if (month == 2 && isLeapYear(year))// 闰年且是2月份
        {
            return day >= 1 && day <= 29;
        }
        return day >= 1 && day <= DAYS_OF_MONTH[month - 1];// 其他月份
    }

    /**
     * 判断是否是闰年
     *
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    /**
     * 匹配日期格式 yyyyMMdd 并验证日期是否合法
     *
     * @param date
     * @return
     */
    public static boolean isValidDate(String date) {
        // 1、 \\d{4} 年，\\d{2}月，\\d{2}日匹配
        Pattern p = Pattern.compile("^\\d{4}\\d{2}\\d{2}$");
        Matcher match = p.matcher(date);
        if (date != null) {
            if (match.matches()) // 格式验证通过 yyyyMMdd
            {
                int year = Integer.parseInt(date.substring(0, 4)); // 年
                int month = Integer.parseInt(date.substring(4, 6)); // 月
                int day = Integer.parseInt(date.substring(6, 8)); // 日
                if (!isValidYear((year))) {
                    return false; // 年份不在有效年份中
                }
                if (!isValidMonth(month)) {
                    return false; // 月份不合法
                }
                if (!isValidDay(year, month, day)) {
                    return false; // 日期不合法
                }
                return true;
            }

            return false;
        } else {
            return false;
        }
    }

    /**
     * 检查year是否在有效的年份范围内 此处验证大于1900年 小于2101年
     *
     * @param year
     * @return
     */
    public static boolean isValidYear(int year) {
        return year >= START_YEAR && year <= END_YEAR;
    }

    /**
     * 验证月份是否在有效月份内
     *
     * @param month
     * @return
     */
    public static boolean isValidMonth(int month) {
        return month >= 1 && month <= 12;
    }


    /**
     * 并验证日期是否合法 此方法忽略了闰年的验证 用于15位身份证出生日期的验证
     *
     * @param dayStr
     * @return
     */
    public static boolean isValidDay(String dayStr) {
        Pattern p = Pattern.compile("^\\d{2}\\d{2}\\d{2}$");
        Matcher match = p.matcher(dayStr);
        if (dayStr != null) {
            if (match.matches()) // 格式验证通过 yyMMdd
            {
                int month = Integer.parseInt(dayStr.substring(2, 4)); // 月
                int day = Integer.parseInt(dayStr.substring(4, 6)); // 日
                if (!isValidMonth(month)) {
                    return false; // 月份不合法
                }
                if (!(day >= 1 && day <= DAYS_OF_MONTH[month - 1])) {
                    return false; // 日期不合法
                }
                return true;
            }

            return false;
        } else {
            return false;
        }
    }


    /**
     * 验证字符串是否有效
     *
     * @param str 被验证的字符串
     * @return 有效返回true，否则返回false
     */
    public static Boolean isValidate(String str) {
        if (null == str || "".equals(str.trim())) {
            return false;
        }
        return true;
    }

    /**
     * 验证字符串的长度是否有效
     *
     * @param str       被验证的字符串
     * @param minLength 最小长度
     * @param maxLength 最大长度
     * @return  如果字符串在指定的长度之间返回true，否则返回false
     */
    public static Boolean isLength(String str, int minLength, int maxLength) {
        if(!ValidateUtil.isValidate(str)){
            return false;
        }
        if (str.trim().length() < minLength || str.trim().length() > maxLength) {
            return false;
        }
        return true;
    }


    /**
     * 正则验证字符串
     *
     * @param str   被验证的字符串
     * @param regex 校验的正则表达示
     * @return      如果校验成功则返回true，否则返回false
     */
    public static Boolean regexValidate(String str, String regex){
        if(!ValidateUtil.isValidate(str)){
            return false;
        }
        return str.matches(regex);
    }

    /**
     * 获取字符串的长度
     *
     * @param str 被操作的字符串
     * @return 返回指定长度的字符串
     */
    public static int getLength(String str) {
        if (null != str && str.trim().length() > 0) {
            return str.trim().length();
        }
        return 0;
    }

    /** 去除script、style、html代码  */
    public static String HtmltoText(String inputString) {
        String htmlStr = inputString;
        String textStr = "";
        Pattern p_script;
        Matcher m_script;
        Pattern p_style;
        Matcher m_style;
        Pattern p_html;
        Matcher m_html;

        try {
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
            String regEx_html = "<[^>]+>";

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签

            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll(""); // 过滤style标签

            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
            m_html = p_html.matcher(htmlStr);
            htmlStr = m_html.replaceAll(""); // 过滤html标签

            textStr = htmlStr;
        } catch (Exception e) {
        }
        return textStr;// 返回文本字符串
    }

    /** 去除script、style、html和空格代码  */
    public static String HtmltoText2(String inputString) {
        String htmlStr = inputString;
        String textStr = "";
        Pattern p_script;
        Matcher m_script;
        Pattern p_style;
        Matcher m_style;
        Pattern p_html;
        Matcher m_html;
        Pattern p_ba;
        Matcher m_ba;

        try {
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
            String regEx_html = "<[^>]+>";
            String patternStr = "\\s+";

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签

            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll(""); // 过滤style标签

            p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
            m_html = p_html.matcher(htmlStr);
            htmlStr = m_html.replaceAll(""); // 过滤html标签

            p_ba = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
            m_ba = p_ba.matcher(htmlStr);
            htmlStr = m_ba.replaceAll(""); // 过滤空格

            textStr = htmlStr;
        } catch (Exception e) {
        }
        return textStr;// 返回文本字符串
    }

    /** 去除script和style代码  */
    public static String HtmltoText3(String inputString) {
        String htmlStr = inputString;
        String textStr = "";
        Pattern p_script;
        Matcher m_script;
        Pattern p_style;
        Matcher m_style;

        try {
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
            String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签

            p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
            m_style = p_style.matcher(htmlStr);
            htmlStr = m_style.replaceAll(""); // 过滤style标签

            textStr = htmlStr;
        } catch (Exception e) {
        }
        return textStr;// 返回文本字符串
    }

    /** 去除script代码  */
    public static String HtmltoText4(String inputString) {
        String htmlStr = inputString;
        String textStr = "";
        Pattern p_script;
        Matcher m_script;

        try {
            String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";

            p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
            m_script = p_script.matcher(htmlStr);
            htmlStr = m_script.replaceAll(""); // 过滤script标签

            textStr = htmlStr;
        } catch (Exception e) {
        }
        return textStr;// 返回文本字符串
    }

    /**
     * 精确截取字符串的长度，字符串编码格式为UTF-8
     *
     * @param srcStr     被截取的字符串
     * @param byteIndex  要截取的长度，UTF-8一个中文字占3位,如果要显示10个字符串，那长度就为30
     * @param flag       是否在超过字数后显示...，值为true显示，值为false不显示
     * @return
     * @throws Exception
     */
    public static String getSubString(String srcStr, int byteIndex, boolean flag) {
        try {
            if (srcStr.getBytes("UTF-8").length < byteIndex) {
                return srcStr;
            }
            String temp = srcStr;
            for (int i = 0; i < srcStr.length(); i++) {
                if (temp.getBytes("UTF-8").length <= byteIndex) {
                    break;
                }
                temp = temp.substring(0, temp.length() - 1);
            }
            if(flag){
                return temp + "...";
            }
            return temp;
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 获取文件扩展名——带点
     * @param fileName 文件名
     * @return         返回文件扩展名
     */
    public static String getExt(String fileName) {
        if(fileName == null || "".equals(fileName)) return "";
        return fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
    }

    /**
     * 获取文件扩展名——不带点
     * @param fileName 文件名
     * @return         返回文件扩展名
     */
    public static String getExt2(String fileName) {
        if(fileName == null || "".equals(fileName)) return "";
        return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
    }

}

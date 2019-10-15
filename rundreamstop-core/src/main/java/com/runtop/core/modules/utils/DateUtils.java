package com.runtop.core.modules.utils;


import com.runtop.core.constants.DateFormatConstants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class DateUtils {


    /**
     * 得到当前时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 得到当前时间的Long
     *
     * @return
     */
    public static Long getNowStr() {
        return System.currentTimeMillis();
    }


    /**
     * 时间格式化
     *
     * @param date
     * @return
     */
    public static final String simpleFormat(Date date) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(DateFormatConstants.JSON_DATETIME_FORMAT);
            String strDate = df.format(date);
            return strDate;
        }
        return null;
    }


    /**
     * 时间格式化成字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static final String simpleFormat(Date date,String format) {
        if (date != null) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            String strDate = df.format(date);
            return strDate;
        }
        return null;
    }


    /**
     * 得到格式化当前时间 字符串
     *
     * @return
     */
    public static final String nowStrFormat() {
        if (now() != null) {
            SimpleDateFormat df = new SimpleDateFormat(DateFormatConstants.JSON_DATETIME_FORMAT);
            String strDate = df.format(now());
            return strDate;
        }
        return null;
    }


    /**
     * 得到格式化当前时间 字符串
     *
     * @param format
     * @return
     */
    public static final String getNowStrFormat(String format) {
        if (now() != null) {
            SimpleDateFormat df = new SimpleDateFormat(format);
            String strDate = df.format(now());
            return strDate;
        }
        return null;
    }


    /**
     * 得到两个时间的差值
     *
     * @param dBefor
     * @param dAfter
     * @return
     */
    public static final long getDateBetween(Date dBefor, Date dAfter) {
        long lBefor = 0L;
        long lAfter = 0L;
        long lRtn = 0L;
        lBefor = dBefor.getTime();
        lAfter = dAfter.getTime();
        lRtn = lAfter - lBefor;
        return lRtn;
    }

    /**
     * 日期格式（yyyyMMdd格式）
     *
     * @return
     */
    public static String nowStr() {
        return shortDate(new Date());
    }

    /**
     * 返回短日期格式（yyyyMMdd格式）
     *
     * @return
     * @throws ParseException
     */
    public static final String shortDate(Date Date) {
        if (Date == null) {
            return null;
        }
        return getFormat(DateFormatConstants.JSON_DATE_FORMAT_SHORT).format(Date);
    }

    /**
     * 获取格式
     *
     * @param format
     * @return
     */
    public static final DateFormat getFormat(String format) {
        return new SimpleDateFormat(format);
    }

    public static String getNewFormatDateString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat(DateFormatConstants.JSON_DATETIME_FORMAT);
        return getDateString(date, dateFormat);
    }

    /**
     * 得到当前年份
     *
     * @return
     */
    public static String getNowYear() {
        DateFormat dateFormat = new SimpleDateFormat(DateFormatConstants.JSON_YEAR_FORMAT);
        return getDateString(now(), dateFormat);
    }

    public static String getDateString(Date date, DateFormat dateFormat) {
        if (date == null || dateFormat == null) {
            return null;
        }
        return dateFormat.format(date);
    }


    /**
     * String  to date
     *
     * @param str
     * @return
     */
    public static Date getDateFormatStr(String str,String dateFormat) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            date = sdf.parse(str);
        } catch (Exception e) {
        }
        return date;
    }



    /**
     * String  to date
     *
     * @param str
     * @return
     */
    public static Date getStringDate(String str) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DateFormatConstants.JSON_DATETIME_FORMAT);
            date = sdf.parse(str);
        } catch (Exception e) {
        }
        return date;
    }


    /**
     * 把时间根据时、分、秒转换为时间段
     *
     * @param StrDate
     */
    public static String getTimes(String StrDate) {
        String resultTimes = "";

        SimpleDateFormat df = new SimpleDateFormat(DateFormatConstants.JSON_DATETIME_FORMAT);
        Date now;

        try {
            now = new Date();
            Date date = df.parse(StrDate);
            long times = now.getTime() - date.getTime();
            long day = times / (24 * 60 * 60 * 1000);
            long hour = (times / (60 * 60 * 1000) - day * 24);
            long min = ((times / (60 * 1000)) - day * 24 * 60 - hour * 60);
            long sec = (times / 1000 - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60);

            StringBuffer sb = new StringBuffer();
            //sb.append("发表于：");
            if (hour > 0) {
                sb.append(hour + "小时前");
            } else if (min > 0) {
                sb.append(min + "分钟前");
            } else {
                sb.append(sec + "秒前");
            }

            resultTimes = sb.toString();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return resultTimes;
    }

    public static Date getDateAddSubMin(long min, Date date) {
        long times = min * 60 * 1000;
        Date dates = new Date(date.getTime() + times);
        return dates;
    }


    /**
     * 两个相同时间，将结束时间加一天
     *
     * @param startTime
     * @param endTime
     * @return
     */
    public static Date isSameDate(Date startTime, Date endTime) {
        //当两个时间相同时，则将结束日期+1
        if (org.apache.commons.lang.time.DateUtils.isSameDay(startTime, endTime)) {
            Calendar c = Calendar.getInstance();
            c.setTime(endTime);
            c.add(Calendar.DATE, 1);
            endTime = c.getTime();
        }
        return endTime;
    }

    /**
     * 获取月日  MM月dd日
     *
     * @param dateString
     * @return
     */
    public static String getMonthDay(String dateString) {
        String dateString1 = "";
        try {
            dateString1 = DateUtils.getDateString(DateUtils.getFormat(DateFormatConstants.JSON_DATE_FORMAT_SHORT).parse(dateString), DateUtils.getFormat(DateFormatConstants.JSON_MONTH_DAY_FORMAT));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dateString1;
    }

    /**
     * 获取当前月日   MMdd
     *
     * @return
     */
    public static String getNowMonthDay() {
        return getDateString(new Date(), getFormat(DateFormatConstants.JSON_MONTH_DAY_FORMAT2));
    }

    public static void main(String[] args) {
        String date = "2019-08-14";
        String time = "08:30-09:30";
        int index = time.indexOf("-");
        String startTime = time.substring(0,index);
        String endTime = time.substring(index+1);


        System.out.println("开始时间："+startTime);
        System.out.println("结束时间："+endTime);
        System.out.println("开始时间："+ date + " " + startTime);
        System.out.println("结束时间："+ date + " " + endTime);
        System.out.println("转换后开始时间："+ getDateFormatStr((date  + " "  + startTime),DateFormatConstants.JSON_DATEMINUTE_FORMAT));
        System.out.println("转换后结束时间："+ getDateFormatStr((date  + " "  + endTime),DateFormatConstants.JSON_DATEMINUTE_FORMAT));
    }

}

package com.runtop.core.modules.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */

public class RandomNoUtil {

    public static String getNoByLength(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer(
                new SimpleDateFormat("yyyyMMdd").format(new Date()));
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getNumberByLen(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer(
                new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getNumByLen(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getNoByLengthNo(int length) {
        String base = "0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer(
                new SimpleDateFormat("yyyyMMdd").format(new Date()));
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static int randomLen(int i) {
        return (int) (Math.random() * i + 1);
    }

    /**
     * 快捷生成java.util.UUID字符串
     * <br /> 返回格式,无-号
     *
     * @return
     * @author <ul>
     * <li>张强 2014年9月22日 新增</li>
     * </ul>
     */
    public synchronized static String generateUUID() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 随机生成六位数验证码
     *
     * @return
     */
    public static int getRandomNum() {
        Random r = new Random();
        return r.nextInt(900000) + 100000;//(Math.random()*(999999-100000)+100000)
    }

    /**
     * 生成3位长度的随机整数
     *
     * @return 返回生成的随机整数
     */
    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(1000)+100;
    }

    /**
     * 得到随机生成的32位订单号
     *
     * @return
     */
    public static String getOutNo() {
        return getNumberByLen(18);
    }

    public static String getOutNo25() {
        return getNumberByLen(11);
    }

    public static void main(String[] args) {

        System.out.println(getOutNo25());
    }
}

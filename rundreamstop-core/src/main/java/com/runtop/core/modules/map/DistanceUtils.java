package com.runtop.core.modules.map;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class DistanceUtils {

    private static double EARTH_RADIUS = 6378.137;// 地球半径

    /**
     * 根据经纬度计算两点之前的直线距离（单位米）
     *
     * @param lat1 A点纬度
     * @param lng1 A点经度
     * @param lat2 B点纬度
     * @param lng2 B点经度
     * @return
     */
    public static double GetDistance(double lat1, double lng1, double lat2, double lng2) {
        double radLat1 = radians(lat1);
        double radLat2 = radians(lat2);
        double a = radLat1 - radLat2;
        double b = radians(lng1) - radians(lng2);

        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        s = Math.round(s * 10000) / 10000.0 * 1000;
        return s;
    }

    /**
     * 角度转成弧度
     *
     * @param d
     * @return
     */
    private static double radians(double d) {
        return d * Math.PI / 180.0;
    }
}

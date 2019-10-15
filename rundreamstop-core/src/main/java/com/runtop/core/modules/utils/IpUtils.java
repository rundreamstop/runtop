package com.runtop.core.modules.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.*;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2017/8/29
 */
public class IpUtils {

    private static final Logger LOG = LoggerFactory.getLogger(IpUtils.class);

    private static final String LOOP_BACK = "127.0.0.1";

    private static String firstNoLoopbackIPV4Address = null;

    private static Collection<InetAddress> allHostIPV4Address = null;

    /**
     * 获取客户端IP地址.
     */
    public static String getClientIpAddr(HttpServletRequest request) {
        String ip = getIp(request.getHeader("X-Forwarded-For"));
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = getIp(request.getHeader("Proxy-Client-IP"));
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = getIp(request.getHeader("WL-Proxy-Client-IP"));
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = getIp(request.getHeader("HTTP_CLIENT_IP"));
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = getIp(request.getHeader("HTTP_X_FORWARDED_FOR"));
        }
        if (null == ip || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = getIp(request.getRemoteAddr());
        }

        return ip;
    }

    public static String getIp(String ip) {
        if (ip != null && !"".equals(ip)) {
            String[] ips = ip.split(",");
            if (ips.length > 0) {
                return ips[0];
            }
        }
        return null;
    }

    /**
     * 将ip转为整形.
     */
    public static long toLong(String ip) {

        // 暂只支持ipv4.
        if (IPAddressUtil.isIPv4LiteralAddress(ip)) {
            String[] ipSections = StringUtils.split(ip, ".");

            return (NumberUtils.toLong(ipSections[0]) << 24) + (NumberUtils.toLong(ipSections[1]) << 16)
                    + (NumberUtils.toLong(ipSections[2]) << 8) + NumberUtils.toLong(ipSections[3]);
        }

        return -1;
    }


    /**
     * 获取所有本机ipv4地址.
     */
    public static Collection<InetAddress> getAllHostIPV4Address() {
        if (null == allHostIPV4Address) {

            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                Collection<InetAddress> addresses = new ArrayList<InetAddress>();

                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterface = networkInterfaces.nextElement();
                    Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddress = inetAddresses.nextElement();

                        if (inetAddress instanceof Inet4Address) {
                            addresses.add(inetAddress);
                        }
                    }
                }

                allHostIPV4Address = addresses;

            } catch (SocketException e) {

                LOG.error("获取ip失败", e);

                throw new RuntimeException(e.getMessage(), e);
            }

        }

        return allHostIPV4Address;
    }

    /**
     * 获取所有本机非loopback ipv4地址.
     */
    public static Collection<String> getAllNoLoopbackIPV4Addresses() {
        Collection<String> noLoopbackAddresses = new ArrayList<String>();
        Collection<InetAddress> allInetAddresses = getAllHostIPV4Address();

        for (InetAddress address : allInetAddresses) {
            if (!address.isLoopbackAddress()) {
                noLoopbackAddresses.add(address.getHostAddress());
            }
        }

        return noLoopbackAddresses;
    }

    /**
     * 获取ipv4地址, 如果有多个网卡的情况, 获取第一个非loopback ip地址.
     */
    public static String getFirstNoLoopbackIPV4Address() {
        if (null != firstNoLoopbackIPV4Address) {

            return firstNoLoopbackIPV4Address;
        }

        Collection<String> allNoLoopbackAddresses = null;

        try {

            allNoLoopbackAddresses = getAllNoLoopbackIPV4Addresses();

        } catch (Exception e) {

            LOG.error("获取ip失败", e);

            return LOOP_BACK;
        }

        if (allNoLoopbackAddresses.isEmpty()) {

            return LOOP_BACK;
        }

        return firstNoLoopbackIPV4Address = allNoLoopbackAddresses.iterator().next();
    }

    public static void main(String[] args) {
        System.out.println(getFirstNoLoopbackIPV4Address());
    }

}
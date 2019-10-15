package com.runtop.core.modules.test.tomcat;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.apache.tomcat.util.scan.StandardJarScanner;

import javax.servlet.ServletException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2018/8/16
 */
public class EmbeddedTomcatHelper {

    /**
     * 端口  环境   默认访问url
     *
     * @param port
     * @param profile
     * @param url
     */
    public void start(int port, String profile, String url) {

        if (profile == null || profile == "") {
            profile = Profiles.DEV;
        }

        if (url == null || url == "") {
            url = "/";
        }

        try {
            // 设定Spring的profile.
            Profiles.setProfileAsSystemProperty(profile);
            long e = System.currentTimeMillis();
            Tomcat tomcat = new Tomcat();
            this.configTomcat(tomcat, port);
            tomcat.start();
            long end = System.currentTimeMillis();
            this.log(end - e, port, url);

            while (true) {
                char c;
                do {
                    c = (char) System.in.read();
                } while (c != 10);
                e = System.currentTimeMillis();
                System.out.println("重启tomcat...");
                tomcat.stop();
                tomcat.start();
                end = System.currentTimeMillis();
                this.log(end - e, port, url);
            }
        } catch (Exception var7) {
            System.err.println("非常抱歉，貌似启动挂了...");
            var7.printStackTrace();
        }
    }

    private void configTomcat(Tomcat tomcat, int port) throws ServletException {
        tomcat.setBaseDir("target");
        tomcat.setPort(port);
        Connector connector = new Connector("HTTP/1.1");
        connector.setPort(port);
        connector.setURIEncoding("utf-8");
        tomcat.setConnector(connector);
        tomcat.getService().addConnector(connector);
        String webappPath = this.getWebappsPath();
        System.out.println("webapp目录：" + webappPath);
        Context ctx = tomcat.addWebapp("/", webappPath);
        StandardJarScanner scanner = (StandardJarScanner) ctx.getJarScanner();
        tomcat.setSilent(true);
        System.setProperty("org.apache.catalina.SESSION_COOKIE_NAME", "JSESSIONID" + port);
    }

    private void log(long time, int port, String url) throws UnknownHostException {
        String host = InetAddress.getLocalHost().getHostAddress();
        System.out.println("********************************************************");
        System.out.println("启动成功: http://" + host + ":" + port + url + "   in:" + time + "ms");
        System.out.println("您可以直接在console里敲回车，重启tomcat,just have a try");
        System.out.println("********************************************************");
    }

    public String getWebappsPath() {
        String file = this.getClass().getClassLoader().getResource(".").getFile();
        return file.substring(0, file.indexOf("target")) + "src/main/webapp";
    }
}

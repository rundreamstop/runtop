
package com.runtop.core.modules.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * rundreams.net by rundreams.top
 *
 * @Author: rundreams@yeah.net  @Time:2019\10\15 0015
 */
public class LoggerUtil {

    private static Logger perfLogger = LoggerFactory.getLogger("PERFORMANCE_LOG");
    private static Marker TOO_LONG_MARKER = MarkerFactory.getMarker("EXE_TIME_TOO_LONG");

    /**
     * 打印性能日志
     *
     * @param format
     * @param executeTime
     * @param args
     */
    public static void logPerfomance(String format, long executeTime, Object... args) {
        if (executeTime > 1000) {
            // 如果超过1s，则打印超时标志
            perfLogger.info(TOO_LONG_MARKER, format + " - 超时日志-耗时: {}ms", args, executeTime);
        } else {
            perfLogger.info(format + " - 耗时: {}ms", args, executeTime);
        }
    }

    public static boolean isPerformanceLogEnabled() {
        return perfLogger.isInfoEnabled();
    }
}

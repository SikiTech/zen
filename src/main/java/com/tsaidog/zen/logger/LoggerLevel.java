/**
 * projectName: spring-boot-in-action
 * fileName: LoggerDemo.java
 * packageName: com.sikiapp.redis.logger
 * date: 2019-05-14 下午8:23
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.tsaidog.zen.logger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @title: LoggerLevel
 * @package com.sikiapp.wxdj.logger
 * @description: 日志等级
 * @author: Robert
 * @date: 2019/6/12 上午11:47
 * @version: V1.0
*/
@Slf4j
@Component
public class LoggerLevel {

    public LoggerLevel() {
        log.trace("日志输出 trace");
        log.debug("日志输出 debug");
        log.info("日志输出 info");
        log.warn("日志输出 warn");
        log.error("日志输出 error");
    }
}
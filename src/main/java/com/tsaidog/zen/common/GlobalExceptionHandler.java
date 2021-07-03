/**
 * projectName: spring-boot-in-action
 * fileName: GlobalExceptionHandler.java
 * packageName: com.sikiapp.redis.exception
 * date: 2019-05-25 上午3:32
 * copyright(c) 2018-2028 深圳识迹科技有限公司
 */
package com.tsaidog.zen.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @className: GlobalExceptionHandler
 * @packageName: com.sikiapp.redis.exception
 * @description: 全局异常处理类
 * @author: Robert
 * @data: 2019-05-25 上午3:32
 * @version: V1.0
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     *@description: Runtime异常处理类
     * 可以定义多个，也可以使用if(e instanceof xxxException)
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity runtimeExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        log.error("未知的Runtime异常", e);
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    /**
     *@description: Runtime异常处理类
     * 可以定义多个，也可以使用if(e instanceof xxxException)
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity exceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        log.error("未知的Runtime异常", e);
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
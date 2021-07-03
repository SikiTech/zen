package com.tsaidog.zen.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用响应体
 * @author robert
 */
@Data
public class ResultDTO<T extends Serializable> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public ResultDTO() {
    }

    public ResultDTO(T data) {
        this.data = data;
    }

    public ResultDTO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <E extends Serializable> ResultDTO<E> success(E data) {
        return new ResultDTO<E>(0, "success", data);
    }

}

package com.pjb.config;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
public class BussinessException extends Exception {
    private static final long serialVersionUID = 1L;
    private String message;
    private String type;
    private int code;

    public BussinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BussinessException() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static long getSerialversionuid() {
        return 1L;
    }

    public BussinessException(String message, String type, int code) {
        this.message = message;
        this.type = type;
        this.code = code;
    }

    public BussinessException(int code) {
        this.message = "此处有异常,异常码为：" + code;
        this.code = code;
    }
}

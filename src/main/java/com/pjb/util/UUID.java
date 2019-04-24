package com.pjb.util;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/25
 **/
public class UUID {
    public static String genUUID() {
        return java.util.UUID.randomUUID().toString().replaceAll("-", "");
    }
}

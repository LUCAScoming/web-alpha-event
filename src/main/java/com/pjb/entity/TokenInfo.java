package com.pjb.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Calendar;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/10
 **/
@Data
@Component
public class TokenInfo {
    /**
     * token秘钥，请勿泄露，请勿随便修改 backups:JKKLJOoasdlfj
     */
    public static final String SECRET = "JKKLJOoasdlfj";
    /**
     * token 过期时间: 10天
     */
    public static final int calendarField = Calendar.DATE;
    public static final int calendarInterval = 10;
    public String SECRETKEY="xtuwuyeguanlixitong";

}

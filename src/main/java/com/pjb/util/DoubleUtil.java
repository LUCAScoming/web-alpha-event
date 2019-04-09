package com.pjb.util;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * @author:Lucas
 * @description:
 * @Date:2019/4/9
 **/
public class DoubleUtil {
    /**
     * 四舍五入取整
     *
     * @param p_double
     * @return
     */
    public static int round(double p_double) {
        DecimalFormat df = new DecimalFormat("###");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return new Integer(df.format(p_double));
    }

    /**
     * @param @param  p_double
     * @param @return
     * @return double    返回类型
     * @throws
     * @Title: roundTwoDecimal
     * @Description: 保留二位小数并 四舍五入取整
     */
    public static double roundTwoDecimal(double p_double) {
        DecimalFormat df = new DecimalFormat("###.00");
        df.setRoundingMode(RoundingMode.HALF_UP);
        return new Double(df.format(p_double));
    }

    /**
     * @param @param  p_double
     * @param @return
     * @return double    返回类型
     * @throws
     * @Title: roundTwoDecimal
     * @Description: 保留二位小数
     */
    public static double twoDecimal(double p_double) {
        DecimalFormat df = new DecimalFormat("###.00");
        return new Double(df.format(p_double));
    }

}

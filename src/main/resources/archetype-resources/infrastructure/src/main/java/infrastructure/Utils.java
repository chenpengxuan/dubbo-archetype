/*
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/). All rights reserved.
 */
package ${package}.infrastructure;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import org.apache.commons.lang3.StringUtils;
import org.bson.types.ObjectId;

/**
 * @author tuwenjie 2016年5月7日 下午4:17:39
 *
 */
public class Utils {

    public static String uuid() {
        return new ObjectId().toHexString();
    }

    public static String trimAndLeft(String src, int n) {
        return StringUtils.left(StringUtils.trim(src), n);
    }

    /**
     * 根据权重平摊一个数额
     * 
     * @param total
     * @param weights
     * @return
     */
    public static BigDecimal[] apportionByWeights(BigDecimal total, BigDecimal[] weights) {

        assert total.compareTo(BigDecimal.ZERO) >= 0 && weights != null && weights.length > 0;

        BigDecimal totalWeight = BigDecimal.ZERO;

        for (BigDecimal weight : weights) {
            totalWeight = totalWeight.add(weight);
        }

        BigDecimal[] result = new BigDecimal[weights.length];

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < weights.length - 1; i++) {

            // MathContext.DECIMAL32 参数用于防止无限循环小数导致的异常
            result[i] = weights[i].divide(totalWeight, MathContext.DECIMAL32)
                    .multiply(total)
                    // 小数点后2位的直接舍去
                    .setScale(2, RoundingMode.DOWN);
            sum = sum.add(result[i]);
        }

        result[weights.length - 1] = total.subtract(sum);

        return result;

    }

}

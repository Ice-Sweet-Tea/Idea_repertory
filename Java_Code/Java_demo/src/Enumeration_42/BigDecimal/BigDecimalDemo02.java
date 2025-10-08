package Enumeration_42.BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
    除法的注意事项
    public BigDecimal divide (另一个BigDecimal对象，精确纪委，舍入模式)
        RoundingMode.UP：进一法
        RoundingMode.FLOOR：去尾法
        RoundingMode.HALF_UP：四舍五入
 */
public class BigDecimalDemo02 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("3.0");

        System.out.println(bd1.divide(bd2,2, RoundingMode.UP));
        System.out.println(bd1.divide(bd2,2, RoundingMode.FLOOR));
        System.out.println(bd1.divide(bd2,2, RoundingMode.HALF_UP));

    }
}

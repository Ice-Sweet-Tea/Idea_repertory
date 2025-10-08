package Enumeration_42.BigDecimal;

import java.math.BigDecimal;

/*
    基本使用
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(0.1 - 0.2);
        System.out.println(0.1 * 0.2);
        System.out.println(0.1 / 0.2);

        System.out.println("---------");

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2));

    }
}

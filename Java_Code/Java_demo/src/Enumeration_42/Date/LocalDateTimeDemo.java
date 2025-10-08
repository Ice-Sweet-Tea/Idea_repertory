package Enumeration_42.Date;

import java.time.LocalDateTime;

/*
    没有构造方法，常用下面两个静态方法获取时间：
        public static LocalDateTime now()
            从默认时区的系统时钟获取当前日期时间

        public static LocalDateTime of(int year, int month, int dayOdMonth, int hour, int minute, int second)
            从年,月,日,小时,分钟和秒获得LocalDateTime的实例，将纳秒设置为零
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //public static LocalDateTime now()
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //public static LocalDateTime of(int year, int month, int dayOdMonth, int hour, int minute, int second)
        LocalDateTime of = LocalDateTime.of(2025,10,8,9,32,30);
        System.out.println(of);
    }
}

package Enumeration_42.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    格式化：使用指定的格式化程序格式化此日期时间
        String format(DateTimeFormatter formatter)

    解析：使用特定格式化程序从文本字符串中获取 LocalDateTime的实例
        static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)

    DateTimeFormatter：没看到构造方法，用下面的静态方法获取日期格式化对象
        public static DateTimeFormatter ofPattern(String pattern)：使用指定的模式创建格式化程序
 */
public class LocalDateTimeDemo02 {
    public static void main(String[] args) {
        //String format(DateTimeFormatter formatter)
//        LocalDateTime now = LocalDateTime.now();
//
//        //public static DateTimeFormatter ofPattern(String pattern)：使用指定的模式创建格式化程序
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String format = now.format(dateTimeFormatter);
//        System.out.println(format);

        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format); //2025-10-08 09:47:03

        //static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)
        String s = "2025-10-08 09:45:30";
        LocalDateTime parse = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse); //2025-10-08T09:45:30
    }
}

package Lambda_41.Stream;

import java.util.ArrayList;

/*
    Stream流的常见终结操作方法：
        void forEach (Consumer action),对此流的每个元素执行操作
            Consumer接口中的方法 void accept (T t)：对给定的参数执行此操作
        long count ()：返回此流中的元素数
 */
public class StreamDemo08 {
    public static void main(String[] args) {
        //创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        list.add("张三丰");
        list.add("赵云");
        list.add("张无忌");

        //需求1：把集合中的元素在控制台输出
        list.stream().forEach(System.out::println);
        //需求2：统计集合有个以张开头的元素，并把统计结果在控制台输出
        long count = list.stream().filter((String s) -> {
            return s.startsWith("张");
        }).count();
        System.out.println(count);
    }
}

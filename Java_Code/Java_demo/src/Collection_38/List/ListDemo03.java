package Collection_38.List;

import java.util.ArrayList;
import java.util.List;

/*
    1.我有一个集合：List<Stirng> list = new ArrayList<String>();
    2.里面有三个元素：list.add("hello");list.add("world");list.add("java");
    3.遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
    4.ConcurrentModificationException：并发修改异常
 */
public class ListDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaee");
                System.out.println(list);
            }

        }
    }
}
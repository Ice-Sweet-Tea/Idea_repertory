package Lambda_41.Stream;

import java.util.ArrayList;

/*
    需求：按照下面的要求完成集合的创建和遍历
        1：创建一个集合，存储多个字符串元素
        2：把集合中所有以"张"开头的元素存储到一个新的集合
        3：把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4：变了上一步得到的集合
 */
public class StreamDemo {
    public static void main(String[] args) {
        //1：创建一个集合，存储多个字符串元素
        ArrayList<String> list = new ArrayList<String>();

        list.add("刘备");
        list.add("关羽");
        list.add("张飞");
        list.add("张三丰");
        list.add("赵云");
        list.add("张无忌");

        //2：把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> zhangList = new ArrayList<String>();

//        for (String s:list){
//            if (s.startsWith("张")){
//                zhangList.add(s);
//            }
//        }
//        System.out.println(zhangList);

        //3：把"张"开头的集合中的长度为3的元素存储到一个新的集合
//        ArrayList<String> threeList = new ArrayList<String>();

        for (String s : list) {
            if (s.length() == 3 && s.startsWith("张")) {
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);

        //4：变了上一步得到的集合
        for (String s:zhangList){
            System.out.println(s);
        }

        System.out.println("----------");

        //Stream流来改写
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
        //方法引用流
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(System.out::println);
    }
}

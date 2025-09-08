package ArrayList_24;

import java.util.ArrayList;

/*
    ArrayList构造方法：
        public ArrayList ()：创建一个空的集合对象

    ArrayList添加方法：
        public boolean add(E e)：将指定的元素追加带此集合的末尾
        public void add(int index,E element)：在此集合中的指定位置插入指定的元素
 */
public class ArrayList_24_demo {
    public static void main(String[] args) {
        //创建一个空集合对象
        ArrayList<String> array = new ArrayList<>();

        //public boolean add(E e)：将指定的元素追加带此集合的末尾
        array.add("hello");
        array.add("world");
        array.add("java");

        //public void add(int index,E element)：在此集合中的指定位置插入指定的元素
        array.add(1,"c#");
        //输出集合
        System.out.println("array: "+array);
    }
}











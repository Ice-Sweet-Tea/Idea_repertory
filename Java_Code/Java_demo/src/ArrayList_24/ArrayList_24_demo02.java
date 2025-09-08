package ArrayList_24;

import java.util.ArrayList;

/*
    ArrayList常用方法：
        public boolean remove(Object o)：删除指定的元素，返回删除是否成功
        public E remove(int index)：删除指定索引处的元素，返回被删除的元素
        public E set(int index,E element)：修改指定索引处的元素，返回被修改的元素
        public E get(int index)：返回指定索引处的元素
        public int size()：返回集合中的元素个数
 */
public class ArrayList_24_demo02 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("java");

        //删除指定的元素
        array.remove("world");

        //删除指定索引处的元素
        array.remove(1);

        //修改指定索引处的元素
        array.set(0,"python");

        //添加元素
        array.add("numpy");
        array.add("pandas");
        array.add("数据分析");

        //返回指定索引处的元素
        String result = array.get(3);
        System.out.println("result: "+result);

        //返回集合个数
        int arr = array.size();
        System.out.println("arr："+arr);
        //输出集合
        System.out.println("array: "+array);
    }
}








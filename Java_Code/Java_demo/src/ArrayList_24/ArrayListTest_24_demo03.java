package ArrayList_24;

import java.util.ArrayList;

/*
    需求：
        创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合

    思路：
        1：创建集合对象
        2：往集合中添加字符串对象
        3：遍历集合，首先要能够获取到集合中的每一个元素，通过get(int index)方法实现
        4：遍历集合，其次要能够获取到集合的长度，通过size()方法实现
        5：遍历集合的通用格式
 */
public class ArrayListTest_24_demo03 {
    public static void main(String[] args) {
        //1：创建集合对象
        ArrayList<String> array = new ArrayList();
        //2：往集合中添加字符串对象
        array.add("java");
        array.add("c++");
        array.add("python");
        array.add("php");

        //5：遍历集合的通用格式
        //4：遍历集合，其次要能够获取到集合的长度，通过size()方法实现
        for (int i = 0;i<array.size();i++){
            //3：遍历集合，首先要能够获取到集合中的每一个元素，通过get(int index)方法实现
            String result = array.get(i);
            System.out.println(result);
        }


    }
}















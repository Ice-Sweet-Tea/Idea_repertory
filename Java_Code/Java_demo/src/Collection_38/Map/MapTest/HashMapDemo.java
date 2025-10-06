package Collection_38.Map.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学号(String),值是学生对象(Student)。存储三个键值对元素，并遍历

    思路：
        1.定义学生类
        2.创建HashMap集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合
            方式1：键找值
            方式2：键值对对象找键和值
*/
public class HashMapDemo {
    public static void main(String[] args) {

        //2.创建HashMap集合对象
        HashMap<String, Student> map = new HashMap<String, Student>();

        // 3.创建学生对象
        Student s1 = new Student("彭于晏", 25);
        Student s2 = new Student("吴彦祖", 26);
        Student s3 = new Student("谢霆锋", 27);



        //4.把学生添加到集合
        map.put("itheima001", s1);
        map.put("itheima002", s2);
        map.put("itheima003", s3);


        //5.遍历集合
        //方式1：键找值
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            Student values = map.get(key);
            System.out.println(key + "," + values.getName() + "," + values.getAge());
        }

        System.out.println("----------");

        //方式2：键值对对象找键和值
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            //3.根据键值对对象获取键和值
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}

package Collection_38.Map.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，键是学生对象(Student),值是居住地(String)。存储多个键值对元素，并遍历
        要求保证键的唯一性，如果学生对象的成员变量值相同，我们就认为是同一个对象

    思路：
        1.定义学生类
        2.创建HashMap集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.遍历集合
        6.在学生类中重写两个方法
            hashCode()
            equals()
 */
public class HashMapDemo02 {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> hm = new HashMap<Student, String>();

        //创建学生对象
        Student s1 = new Student("彭于晏", 25);
        Student s2 = new Student("吴彦祖", 26);
        Student s3 = new Student("谢霆锋", 27);
        Student s4 = new Student("谢霆锋", 27);

        //把学生添加到集合
        hm.put(s1, "武汉");
        hm.put(s2, "西安");
        hm.put(s3, "郑州");
        hm.put(s4, "郑州");


        //遍历集合
        Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
        for (Map.Entry<Student, String> me : entrySet) {
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName() + "," + key.getAge()+","+value);
        }

        System.out.println("---------");

        //第二种遍历方法
        //1.获取所有有键的集合，用keySet()方法实现
        Set<Student> keySet = hm.keySet();

        //2.遍历键的集合，获取到每一个键，用增强for实现
        for (Student key:keySet){
            //3.根据键去找值。用get(Object key)方法实现
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge()+","+value);
        }
    }
}

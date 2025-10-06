package Collection_38.Collections.CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    需求：
        ArrayList存储学生对象，使用Collections对ArrayList进行排序
        要求：按照年龄从小到大排序，年龄相同，按照姓名的字母排序

    思路：
        1.定义学生类
        2.创建ArrayList集合对象
        3.创建学生对象
        4.把学生添加到集合
        5.使用Collections对ArrayList集合排序
        6.遍历集合
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("liubei",25);
        Student s2 = new Student("zhangfe",27);
        Student s3 = new Student("guanyu",26);
        Student s4 = new Student("zhaoyun",28);
        Student s5 = new Student("zhaoyun",28);


        //把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);

        //使用Collections对ArrayList集合排序
        //sort(List<T> list,Comparator<? super T> c)
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //按照年龄从小到大排序，年龄相同，按照姓名的字母排序
                int num = s1.getAge() - s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        //遍历集合
        for (Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}

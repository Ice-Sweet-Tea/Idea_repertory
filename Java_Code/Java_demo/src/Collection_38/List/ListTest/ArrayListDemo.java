package Collection_38.List.ListTest;

import java.util.ArrayList;
import java.util.Iterator;

/*
    需求：
        创建一个储存学生对象的集合，存储3个学生对选哪个，使用程序实现在控制台遍历该集合

    思路：
        1:定义学生类
        2:创建ArrayList集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合
            迭代器：集合特有的遍历方式
            普通for：带有索引的遍历方式
            增强for：最方便的遍历方式
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 2:创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        // 3:创建学生对象
        Student s1 = new Student("王曼玉",25);
        Student s2 = new Student("王仙之",26);
        Student s3 = new Student("王安石",27);

        // 4:把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //5:遍历集合
        /*迭代器：集合特有的遍历方式*/
        Iterator<Student> iterator = array.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("---------");
        /*普通for：带有索引的遍历方式*/
        for (int i =0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("---------");
        /*增强for：最方便的遍历方式*/
        for (Student s:array){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}

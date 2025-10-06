package Collection_38.Set.TreeSetTest;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/*
    存储学生对象并遍历，创建集合使用无参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //创建学生对象
        Student s1 = new Student("wuyanzu",25);
        Student s2 = new Student("pengyuyan",26);
        Student s3 = new Student("liubei",27);
        Student s4 = new Student("guanyu",28);

        Student s5 = new Student("caocao",28);
        Student s6 = new Student("caocao",28);


        //把元素添加到集合内
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历
        for (Student s :ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}

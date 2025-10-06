package Collection_38.Set.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

/*
    需求：
        用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
        要求：按照总分从高到低出现

    西路：
        1.定义学生类
        2.创建TreeSet集合对选哪个，通过比较器排序进行排序
        3.创建学生对象
        4.把学生对象添加到集合
        5.遍历集合
 */
public class TreeSetDemo04 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student04> ts = new TreeSet<Student04>(new Comparator<Student04>() {
            @Override
            public int compare(Student04 s1, Student04 s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });


        //创建学生对象
        Student04 s1 = new Student04("张三", 90, 75);
        Student04 s2 = new Student04("李四", 70, 65);
        Student04 s3 = new Student04("王五", 100, 80);
        Student04 s4 = new Student04("老六", 60, 60);

        Student04 s5 = new Student04("周七", 80, 70);
        Student04 s6 = new Student04("李八", 75, 75);
        Student04 s7 = new Student04("仇九", 75, 75);


        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        ts.add(s7);

        //遍历
        for (Student04 s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath() + "," + s.getSum());
        }

    }
}

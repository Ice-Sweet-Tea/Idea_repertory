package Collection_38.Set.TreeSetTest;

import java.util.Comparator;
import java.util.TreeSet;

/*
    存储学生对象并遍历，创建TreeSet集合使用带参构造方法
    要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */
public class TreeSetDemo03 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student03> ts = new TreeSet<Student03>(new Comparator<Student03>() {
            @Override
            public int compare(Student03 s1, Student03 s2) {
                //this.age - s.age
                //s1,s2
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //创建学生对象
        Student03 s1 = new Student03("wuyanzu",25);
        Student03 s2 = new Student03("pengyuyan",26);
        Student03 s3 = new Student03("liubei",27);
        Student03 s4 = new Student03("guanyu",28);

        Student03 s5 = new Student03("caocao",28);
        Student03 s6 = new Student03("caocao",28);


        //把元素添加到集合内
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历
        for (Student03 s :ts){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}

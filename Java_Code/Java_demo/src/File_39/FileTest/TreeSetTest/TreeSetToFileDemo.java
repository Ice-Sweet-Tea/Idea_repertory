package File_39.FileTest.TreeSetTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/*
    需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
         格式：姓名,语文成绩,数学成绩,英语成绩 举例: 林青霞,98,99,100


    思路：
        1.定义学生类
        2.创建TreeSet集合，通过比较器排序进行排序
        3.创建录入学生数据
        4.创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
        5.把学生对象添加到TreeSet集合
        6.创建字符缓冲输出流对象
        7.遍历集合，得到每一个学生对象
        8.把学生对象的数据拼接成指定格式的字符串
        9.调用字符缓冲输出流对象的方法写数据
        10.释放资源
 */
public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 2.创建TreeSet集合，通过比较器排序进行排序
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 成绩总分从高到低
                int num = s2.getSum() - s1.getSum();
                // 次要条件
                num = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                num = num == 0 ? s1.getMath() - s2.getMath() : num;
                num = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num;
            }
        });

        // 3.键盘录入学生数据
        Scanner sc = new Scanner(System.in); // Scanner应该在循环外创建

        for (int i = 0; i < 5; i++) {
            System.out.println("请录入第" + (i + 1) + "个学生信息：");

            System.out.print("姓名：");
            String name = sc.next(); // 使用next()避免换行符问题

            System.out.print("语文成绩：");
            int chinese = sc.nextInt();

            System.out.print("数学成绩：");
            int math = sc.nextInt();

            System.out.print("英语成绩：");
            int english = sc.nextInt();

            // 4.创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            // 5.把学生对象添加到TreeSet集合
            ts.add(s);
        }

        sc.close(); // 关闭Scanner

        // 6.创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_demo\\File\\students.txt"));

        // 7.遍历集合，得到每一个学生对象
        for (Student student : ts) {
            // 8.把学生对象的数据拼接成指定格式的字符串
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append(",")
                    .append(student.getChinese()).append(",")
                    .append(student.getMath()).append(",")
                    .append(student.getEnglish());

            // 9.调用字符缓冲输出流对象的方法写数据
            bw.write(sb.toString());
            bw.newLine(); // 换行
            bw.flush();   // 刷新缓冲区
        }

        // 10.释放资源
        bw.close();

        System.out.println("学生信息已保存到文件，按总分排序完成！");
    }
}
package ArrayListTest_24_demo02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        // 1. 创建集合对象（在main方法中）
        ArrayList<Student> array = new ArrayList<>();

        // 2. 调用方法添加3个学生
        addStudent(array);
        addStudent(array);
        addStudent(array);

        // 3. 遍历集合（补充缺失的遍历代码）
        System.out.println("=== 所有学生信息 ===");
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println("学生" + (i + 1) + ": " +
                    student.getName() + ", " +
                    student.getAge() + "岁");
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        // 键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生名字: ");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄: ");
        String age = sc.nextLine();

        // 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        // 往集合中添加学生对象（使用参数传来的集合）
        array.add(s);
        System.out.println("学生添加成功！\n");
    }
}
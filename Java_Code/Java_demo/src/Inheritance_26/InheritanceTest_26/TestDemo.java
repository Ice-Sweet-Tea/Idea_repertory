package Inheritance_26.InheritanceTest_26;

/*
    测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();

        t1.setName("谢霆锋");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("林俊杰",25);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        System.out.println("--------");

        //创建学生类对象进行测试
        Student s1 = new Student();
        s1.setName("曹操");
        s1.setAge(38);
        System.out.println(s1.getName()+","+s1.getAge());
        s1.study();

        Student s2 = new Student("周杰伦",45);
        System.out.println(s2.getName()+","+s2.getAge());
        s1.study();
    }
}

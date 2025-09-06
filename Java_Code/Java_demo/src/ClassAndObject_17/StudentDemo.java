package ClassAndObject_17;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        System.out.println(s);

        //使用成员变量
        System.out.println(s.name);
        System.out.println(s.age);

        s.name="张三";
        s.age=13;

        System.out.println(s.name+","+s.age);

        //使用成员方法
        s.study();
        s.doHomework();

        System.out.println("------------------");

        //创建对象
        Student s2 = new Student();
        System.out.println(s2);

        //使用成员变量
        System.out.println(s2.name2);
        System.out.println(s.age2);

        s2.name2="李四";
        s2.age2=14;

        System.out.println(s2.name2+","+s2.age2);

        //使用成员方法
        s2.study2();
        s2.doHomework2();
    }
}

package ClassAndObject_17;

public class StudentDemo02 {
    public static void main(String[] args) {
        //创建第一个对象并使用
        Student s = new Student();

        s.name = "张三";
        s.age = 13;

        System.out.println(s.name + "," + s.age);

        //把第一个对象的地址赋值给第二个对象
        Student s2 = s;
        s2.name = "李四";
        s2.age = 14;

        System.out.println(s.name + "," + s.age);
        System.out.println(s2.name + "," + s2.age);

    }
}

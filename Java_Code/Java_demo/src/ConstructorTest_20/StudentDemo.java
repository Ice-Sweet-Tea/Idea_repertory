package ConstructorTest_20;
/*
    创建对象并为其成员变量赋值的两种方式
    1：无参构造方法创建对象后使用setXxx()赋值
    2：使用带参构造方法直接创建带有属性值的对象
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("周海涛");
        s.setAge(21);
        s.show();

        Student s2 = new Student("易丽莉",21);
        s2.show();
    }
}

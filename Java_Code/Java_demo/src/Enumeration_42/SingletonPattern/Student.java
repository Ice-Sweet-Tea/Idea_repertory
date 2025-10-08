package Enumeration_42.SingletonPattern;

public class Student {
    private Student() {
    }

    //为了让s能够在静态方法中使用，需要加static
    //为了不让外界修改这个值，加private
    private final static Student s = new Student();

    //为了让外界直接访问该方法，用static修饰
    public static Student getStudent(){
        return s;
    }
}

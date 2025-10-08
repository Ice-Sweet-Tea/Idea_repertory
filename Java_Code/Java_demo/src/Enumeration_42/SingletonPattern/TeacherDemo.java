package Enumeration_42.SingletonPattern;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = Teacher.getTeacher();
        Teacher t2 = Teacher.getTeacher();
        System.out.println(t1==t2);

        System.out.println(t1);
        System.out.println(t2);
    }
}

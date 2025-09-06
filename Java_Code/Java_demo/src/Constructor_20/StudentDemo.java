package Constructor_20;
/*
    测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show();
/*
        Student s2 = new Student("周海涛");
        s2.show();

        Student s3 = new Student(21);
        s3.show();

 */
        Student s4 = new Student("周海涛",21);
        s4.show();
    }
}

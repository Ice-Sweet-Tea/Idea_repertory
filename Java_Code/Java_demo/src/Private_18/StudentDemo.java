package Private_18;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //给成员变量赋值
        s.name = "易丽莉";
//        s.age = 21;
        s.setAge(21);

        //调用show方法
        s.show();
    }
}

package This_19;

public class Studentdemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("彭于晏");
        s.setAge(18);

        s.show();
        System.out.println(s.getName()+"---"+s.getAge());
    }
}

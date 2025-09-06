package Private_18;

/*
    学生测试类
 */
public class StudentDemo02 {
    public static void main(String[] args) {
        //创建对象
        Student_02 s = new Student_02();

        //使用set方法给成员变量赋值
        s.setName("周海涛");
        s.setAge(21);

        //调用show方法
        s.show();

        //使用get方法获取成员变量的值
        System.out.println(s.getName() + "---" + s.getAge());
    }
}

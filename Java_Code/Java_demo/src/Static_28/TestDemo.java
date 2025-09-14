package Static_28;
/*
    测试类
 */
public class TestDemo {
    public static void main(String[] args) {
        Student.university = "五道口职业技术学校";

        Student s = new Student();
        s.name = "彭于晏";
        s.age = 18;
//        s.university = "五道口职业技术学校";
        s.show();

        Student s2 = new Student();
        s2.name = "吴彦祖";
        s2.age = 20;
//        s2.university = "五道口职业技术学校";
        s2.show();
    }
}

package Api_21.ApiTest_demo02;

/*
    测试类
    public boolean equals(Object obj)：指示一些其他对象是否等于此
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("彭于晏");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setName("彭于晏");
        s2.setAge(18);

        System.out.println(s1);
        System.out.println(s2.toString());

        // 需求：比较两个对象的内容是否相同
//        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

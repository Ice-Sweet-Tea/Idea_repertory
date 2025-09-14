package Static_28;

/*
    static访问特点
 */
public class TestDemo02 {
    //非静态成员变量
    private String name = "吴彦祖";
    //静态成员变量
    private static String university = "五道口职业技术学校";

    //非静态成员方法
    public void show1() {
    }

    //非静态成员方法:可以访问静态、非静态的变量和方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员方法
    public static void show3() {
    }

    //静态成员方法：只能访问静态的成员变量、成员方法
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }

}

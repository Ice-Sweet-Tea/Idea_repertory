package Static_28;

public class Student {
    public String name;//姓名
    public int age;//年龄
    //    public String university;//学校
    /*static：1.被类的所有对象共享
    *         2.可以通过 对象名\类名访问*/
    public static String university;

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}

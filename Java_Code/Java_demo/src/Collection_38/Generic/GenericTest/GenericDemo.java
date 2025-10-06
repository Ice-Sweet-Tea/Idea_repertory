package Collection_38.Generic.GenericTest;
/*
    测试类
 */
public class GenericDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("易丽莉");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(21);
        System.out.println(t.getAge());

        System.out.println("---------");

        Generic<String> g1 = new Generic<String>();
        g1.setT("周海涛");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(21);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}

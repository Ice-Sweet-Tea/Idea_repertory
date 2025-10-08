package Enumeration_42.EnumerationDemo;

public class LightDemo {
    public static void main(String[] args) {
        Light r = Light.RED;
        System.out.println(r);  //Enumeration_42.EnumerationDemo.Light@14ae5a5
        System.out.println("--------");

        Light2 r2 = Light2.RED;
        System.out.println(r2);
        System.out.println(r2.getName());

        r2= Light2.YELLOW;
        System.out.println(r2);
        System.out.println(r2.getName());
        System.out.println("--------");

        Light3 r3 = Light3.RED;
        System.out.println(r3);
        System.out.println(r3.getName());
        r3.show();
    }
}

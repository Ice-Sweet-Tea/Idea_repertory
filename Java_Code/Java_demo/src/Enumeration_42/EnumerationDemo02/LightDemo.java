package Enumeration_42.EnumerationDemo02;

public class LightDemo {
    public static void main(String[] args) {
        Light r = Light.RED;
        System.out.println(r); //RED

        System.out.println("---------");

        Light2 r2 = Light2.RED;
        System.out.println(r2);
        System.out.println(r2.getName());
        r2 = Light2.YELLOW;
        System.out.println(r2);

        System.out.println("---------");

        Light3 r3 = Light3.RED;
        System.out.println(r3);
        System.out.println(r3.getName());
        r3.show();

        System.out.println("---------");

        Light light = Light.RED;

        switch (light) {
            case RED:
                System.out.println("红");
                break;
            case GREEN:
                System.out.println("绿");
                break;
            case YELLOW:
                System.out.println("黄");
                break;
//            case BULE:
//                System.out.println("蓝");
//                break;
        }
    }
}


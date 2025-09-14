package Interface_31.InterfaceTest_demo;

public class InterfaceTest {
    public static void main(String[] args) {
        Interface i = new InterfaceMpl();
        System.out.println(i.num);
        System.out.println(i.num2);
        System.out.println(Interface.num3);
    }
}

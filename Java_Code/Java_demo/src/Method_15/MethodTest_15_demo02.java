package Method_15;

public class MethodTest_15_demo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

}

package Exception_37;

/*
            异常
*/
public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int arr[] = {1, 2, 3};
        System.out.println(arr[1]);
        //System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
    }
}

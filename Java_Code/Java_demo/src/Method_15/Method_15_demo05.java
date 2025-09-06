package Method_15;

/*
    对于基本数据类型的参数，形参的改变，不影响实参的值
 */
public class Method_15_demo05 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);

        System.out.println("-----------------------------");

        int arr[] = {10,20,30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int number) {
        number = 20;
    }

/*
    对于引用类型的参数，形参的改变，影响实参的值
 */
    public static void change(int[] arr){
        arr[1] = 200;
    }
}

package Array_14;

/*
    单个数组
 */
public class Array_14_demo02 {
    public static void main(String[] args) {
        //定义一个数组
        int arr[] = new int[3];

        //输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //给数组中的元素赋值
        arr[0] = 100;
        arr[1] = 200;

        //再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

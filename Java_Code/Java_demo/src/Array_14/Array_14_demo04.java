package Array_14;

/*
    多个数组指向相同内存图
 */
public class Array_14_demo04 {
    public static void main(String[] args) {
        //定义一个数组
        int arr[] = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //定义第二个数组指向第一个数组
        int arr2[] = arr;
        arr[0] = 111;
        arr[1] = 222;
        arr[2] = 333;

        //输出两个数组的名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr2);
        System.out.println(arr2[0]);
    }
}

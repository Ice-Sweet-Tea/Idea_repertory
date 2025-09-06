package Array_14;

/*
    需求：
        已知：一个数组 arr = {19,28,37,46,50}; 用程序实现把数组中的元素值交换
 */
public class ArrayTest_14_demo05 {
    public static void main(String[] args) {
        int arr[] = {19, 28, 37, 46, 50};
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            }else{
                System.out.print(arr[x]+",");
            }
        }
        System.out.println("]");
    }
}

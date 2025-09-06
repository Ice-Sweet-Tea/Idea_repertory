package Method_15;

/*
    数组最大值
    需求：
        设计一个方法用于获取数组中的元素的最大值，调用方法并输出结果
 */
public class MethodTest_15_demo06 {
    public static void main(String[] args) {
        //定义一个数组，用静态初始化完成数组元素初始化
        int arr[] = {1, 56, 39, 48, 52, 62};
        int number = getMax(arr);
        System.out.println(number);
    }

    //定义一个方法，用来获取数组中的最大值
    /*
        两个明确：
            返回值类型: int
            参数: int[] arr
     */
    public static int getMax(int arr[]) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

}

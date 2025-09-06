package Array_14;

/*
    获取最值
        获取数组中的最大值、最小值
 */
public class ArrayTest_14_demo02 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {12, 45, 98, 73, 60};

        //定义一个变量，用于保存最大值
        //取数组中第一个数据作为变量的初始值
        int max = arr[0];
        //与数组汇总剩余的数据逐个对比，每次对比将最大值保存到变量中
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        //输出
        System.out.println("max：" + max);

    }
}

package Array_14;

/*
    遍历
        获取数组中的每一个元素输出在控制台
    获取数组元素
        数组名.length
 */
public class ArrayTest_14_demo {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        //遍历数组
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}

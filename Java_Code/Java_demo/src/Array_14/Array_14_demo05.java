package Array_14;

/*
    静态初始化：
        初始化时指定每个数组元素的初始值，由系统决定数组长度

        格式: 数据类型[] 变量名 = new 数据类型[]{数据1,数据2,数据3,......}
        简化格式: 数据类型[] 变量名 = {数据1,数据2,数据3,......}
 */
public class Array_14_demo05 {
    public static void main(String[] args) {
        //定义数组
        int arr[] = {1,2,3};

        //输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

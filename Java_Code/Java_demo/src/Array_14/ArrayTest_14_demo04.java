package Array_14;

import java.util.Scanner;

/*
    需求：已知一个数组arr={19,28,37,46,50};键盘录入一个数据，
         查找该数据在数组中的索引，并在控制台输出找到的索引值
 */
public class ArrayTest_14_demo04 {
    public static void main(String[] args) {

        int arr[] = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入要查找的数据: ");
        int number = sc.nextInt();

        int index = -1;

        for (int x = 0;x<arr.length;x++){
            if (arr[x]==number){
                index = x;
                break;
            }
        }
        System.out.println("index: "+index);
    }
}

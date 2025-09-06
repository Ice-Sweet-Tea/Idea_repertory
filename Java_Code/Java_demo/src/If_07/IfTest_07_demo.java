package If_07;

import java.util.Scanner;

public class IfTest_07_demo {
    public static void main(String[] args) {
        /*需求：任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，
               并在控制台输出该整数是奇数还是偶数。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("该数字是偶数:" + number);
        } else {
            System.out.println("该数字是奇数:" + number);
        }

    }
}

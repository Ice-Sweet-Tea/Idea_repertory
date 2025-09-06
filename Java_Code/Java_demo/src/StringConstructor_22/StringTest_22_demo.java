package StringConstructor_22;
/*
    需求：
        已知用户名密码，请用程序实现模拟用户登录。总共给三次机会，登录之后给出相应的提示

    思路：
        1:已知用户名和密码，定义两个字符串表示即可
        2:键盘录入要登录的用户名和密码，用Scanner实现
        3:拿键盘录入的用户名、密码和已知的用户名、密码进行比较，给出相应的提示。字符串的内容比较，
          用equals()方法实现
        4:用循坏实现多次机会，这里的次数明确，采用for循坏实现，并在登录成功的时候，使用break结束循坏
 */

import java.util.Scanner;

public class StringTest_22_demo {
    public static void main(String[] args) {
        String user = "zhangsan";
        String password = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("请输入账号: ");
            String u = sc.nextLine();
            System.out.println("请输入密码: ");
            String p = sc.nextLine();
            if (user.equals(u) && password.equals(p)) {
                System.out.println("登录成功！！！");
                break;
            } else {
                System.out.println("登录失败！！！,您还有"+(2-i)+"机会");
            }
        }
    }
}

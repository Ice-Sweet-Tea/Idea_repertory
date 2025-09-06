package Switch_08;/*
    执行流程：
        首先计算表达式的值。
        依次和case后面的值进行比较，如果有对应的值，就会执行相对应的语句，在执行的过程中，遇到break
        就会结束。
        如果所有的case后面的值和表达式的值都不匹配，就会执行default里面的语句体，然后程序结束。
 */
import java.util.Scanner;
public class Switch_08_demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期：");
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("一周就七天");
                break;
        }

    }
}

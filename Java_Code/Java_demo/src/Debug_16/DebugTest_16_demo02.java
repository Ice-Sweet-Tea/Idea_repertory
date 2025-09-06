package Debug_16;/*
    查看方法调用的执行流程
 */
import java.util.Scanner;
public class DebugTest_16_demo02 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个整数: ");
        int a = sc.nextInt();

        System.out.println("请输入第二个整数: ");
        int b = sc.nextInt();

        //调用方法
        int max = getMax(a,b);

        //输出
        System.out.println("较大值是："+max);
    }

    public static int getMax(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }

}

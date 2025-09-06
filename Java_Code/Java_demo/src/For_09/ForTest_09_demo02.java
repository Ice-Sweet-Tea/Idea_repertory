package For_09;

/*
    求和
    需求：
        求1~5之间的数据和，并把求和结果在控制台输出
 */
public class ForTest_09_demo02 {
    public static void main(String[] args) {
        //求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
        int sum = 0;
        //从1开始到5结束的数据，使用循坏结构完成
        for (int i = 1; i <= 5; i++) {
            //将反复进行的事情写入循坏结构内部，此处反复进行的事情是将数据 i 加到用与保存最终求和的变量sum中
            sum += i;
        }
        //当循环执行完毕时，将最终数据打印出来
        System.out.println(sum);

        System.out.println("------------------");

        /*
            需求：求1-100之间的偶数和，并把求和结果在控制台输出
         */
        int number = 0;
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                number += j;
            }
        }
        System.out.println("1-100之间的偶数和是："+number);
    }
}

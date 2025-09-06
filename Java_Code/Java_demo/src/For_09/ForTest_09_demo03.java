package For_09;

/*
    水仙花

    需求：
        在控制台输出所有的"水仙花数"
 */
public class ForTest_09_demo03 {
    public static void main(String[] args) {
        //输出所有的水仙花数必然要使用到循坏，变量所有的三位数，三位数从100，到999结束
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            //在计算之前获取三位数中每个位上的值
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            //判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较式否相等
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                count++;
            }
        }
        //打印输出最终结果
        System.out.println("水仙花共有：" + count + "个");


    }
}

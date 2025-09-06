package Debug_16;

/*
    查看循坏求偶数和的执行流程
 */
public class DebugTest_16_demo {
    public static void main(String[] args) {
        //定义求和变量
        int sum = 0;

        //循坏求偶数和
        for (int i = 1;i<=10;i++){
            if (i%2==0){
                sum+=i;
            }
        }

        //输出
        System.out.println(sum);
    }
}

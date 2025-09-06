package Operator_05;

public class OperatorTest_05_demo {
    public static void main(String[] args) {

        //1: 定义两个变量用于保存老虎的体重，单位为kg，这里仅仅体现数值既可。
        int a = 180;
        int b = 200;
        //2: 用三元运算符实现老虎体重的判断，体重相同，返回true，否者，返回false
        boolean result = a == b ? true : false;
        //3: 输出结果
        System.out.println("result:" + result);

    }
}

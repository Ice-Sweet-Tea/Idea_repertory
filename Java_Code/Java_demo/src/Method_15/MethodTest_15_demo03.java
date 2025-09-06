package Method_15;

public class MethodTest_15_demo03 {
    public static void main(String[] args) {
        int result = getMax(10,20);
        System.out.println(result);
    }
    //设计一个方法可以获取两个数的较大值，数据来自于参数
    public static int getMax(int a,int b) {
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}

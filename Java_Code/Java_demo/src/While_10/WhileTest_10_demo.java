package While_10;

/*
    珠穆朗玛峰

    需求：
        世界最高的山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，
        他的厚度是0.1毫米。请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 */
public class WhileTest_10_demo {
    public static void main(String[] args) {
        //定义一个计数器，初始值为0
        int count = 0;
        //定义纸张厚度
        double paper = 0.1;
        //折叠纸张厚度大于珠穆朗玛峰就停止
        while (paper <= 8844430) {
            //每次折叠厚度*2
            paper *= 2;
            //累加折叠次数
            count++;
        }
        //打印计数器的值
        System.out.println("需要折叠：" + count + "次");
    }
}

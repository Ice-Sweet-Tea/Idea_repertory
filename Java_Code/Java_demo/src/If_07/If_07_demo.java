package If_07;

/*
    if语句格式1
    格式：
        if (关系表达式) {
            语句体;
        }

    执行流程：
        1：首先计算关系表达式的值
        2：如果关系表达式的值为true就执行语句体
        3：如果关系表达式的值为false就不执行语句体
        4：继续执行后面的语句内容
 */
public class If_07_demo {
    public static void main(String[] args) {

        //定义两个变量
        int a = 10;
        int b = 20;

        //需求：判断a和b的值是否相等，如果相等，就在控制台输出：a等于b
        if (a == b) {
            System.out.println("相等");
        } else {
            System.out.println("不相等");
        }
        System.out.println("-----------------------");

        //需求：判断a和c的值是否相等，如果相等，就在控制台输出：a等于c
        int c = 10;
        if (a == c) {
            System.out.println("a等于c");
        }
        System.out.println("-----------------------");

        //需求：判断a是否大于b，如果是，在控制台输出：a的值大于b，如果不是：a的值不大于b
        if (a > b) {
            System.out.println("a的值大于b");
        } else {
            System.out.println("a的值小于b");
        }

    }
}

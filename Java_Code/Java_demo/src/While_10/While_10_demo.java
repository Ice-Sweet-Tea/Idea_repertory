package While_10;

/*
    while语句

    格式：
        初始化语句;
        while(条件判断语句) {
            循环体语句;
            条件控制语句;
        }
 */
public class While_10_demo {
    public static void main(String[] args) {
    //需求：在控制台输出5次"HelloWorld"
        int i = 1;
        while (i<=5) {
            i++;
            System.out.println("HelloWorld");
        }
    }
}

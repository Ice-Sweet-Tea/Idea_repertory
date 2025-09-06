package DoWhile_11;

/*
    do...while语句

    基本格式：
        初始化语句;
        do {
            循环体语句;
            条件控制语句;
        }while(条件判断语句);
 */
public class DoWhile_11_demo {
    public static void main(String[] args) {
        //需求：在控制台输出5次"HelloWorld"
        //for循坏实现
        for (int i = 1; i <= 5; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("------------------");

        //do...while循环实现
        int j = 1;
        do {
            System.out.println("HelloWorld");
            j++;
        }while (j<=5);
    }
}

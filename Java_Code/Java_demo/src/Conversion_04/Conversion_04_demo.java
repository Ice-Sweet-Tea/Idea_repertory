package Conversion_04;

/*
    类型转换
*/
public class Conversion_04_demo {
    public static void main(String[] args) {
        //自动类型转换
        double d = 10;
        System.out.println(d);

        //定义byte类型的变量
        byte b = 10;
        short c = b;
        int dd = b;

        //强制数据类型转换
        int k = (int)88.88;
        System.out.println(k);
    }
}

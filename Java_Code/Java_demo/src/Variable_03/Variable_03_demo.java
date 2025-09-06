package Variable_03;

/*
    变量定义格式:
        数据类型 变量名 = 变量值
     基本数据类型:
        byte、short、int、long、float、double、char、boolean
        1     2      4   8     4      8      2     1
 */
public class Variable_03_demo {
    public static void main(String[] args) {
        //定义变量
        int a = 10;

        //输出变量
        System.out.println(a);

        //修改变量
        a=20;
        System.out.println(a);

        System.out.println("--------------------");

/*
    变量使用的注意事项:
        名字不能重复
        变量未赋值,不能使用
        long类型的变量定义的时候,为了防止整数过大,后面加L
        float的变量定义的时候，为了防止类型不兼容，后面加F
 */
        //定义byte类型的变量
        byte b = 10;
        System.out.println(b);

        //定义short类型的变量
        short s = 100;
        System.out.println(s);

        //定义int类型的变量
        int i = 10000;
        System.out.println(i);

        //定义double类型的变量
        double d = 13.14;
        System.out.println(d);

        //定义char类型的变量
        char c = 'a';
        System.out.println(c);

        //定义boolean类型的变量
        boolean bb = true;
        System.out.println(bb);

        //定义long类型变量
        long l = 10000000000L;
        System.out.println(l);

        //定义float类型变量
        float f = 10.11F;
        System.out.println(f);

    }
}

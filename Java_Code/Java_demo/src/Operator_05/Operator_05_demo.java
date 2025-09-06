package Operator_05;

/*
    算数运算符
 */
public class Operator_05_demo {
    public static void main(String[] args) {
        //定义两个变量
        int a = 6;
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //除法得到的是商，取余得到是余数

        //整数相除只能得到整数，要想得到小数，必须有浮点数的参与
        System.out.println(6.0 / 4);

        System.out.println("-----------------------");

/*
    字符的"+"操作
 */
        //定义两个变量
        int i = 10;
        char c = 'A';   //'A'的值是65
        c = 'a';    //'a'的值是97
        c = '0';    //'0'的值是48
        System.out.println(i + c);

        //char ch = i + c;
        //char类型会被自动提升为int类型
        int j = i + c;
        System.out.println(j);

        //int k = 10+13.14;
        double d = 10 + 13.14;
        System.out.println(d);

        System.out.println("-----------------------");

/*
    字符串的"+"操作
 */
        System.out.println("it" + "heima");
        System.out.println("itheima" + 666);
        System.out.println(666 + "itheima");

        System.out.println("黑马" + 6 + 66);
        System.out.println(1 + 99 + "年黑马");

        System.out.println("-----------------------");

/*
    赋值运算符
 */
        //把10赋值给int类型的变量ii
        int ii = 10;
        System.out.println("ii:" + ii);

        // +=把左边和右边的数据做加法操作，结果赋值给左边
        ii += 20;
        // ii + ii + 20;
        System.out.println("ii:" + ii);

        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s = 10;
        s += 20;
        // s = (short) (s + 20);
        System.out.println("s:" + s);

        System.out.println("-----------------------");

/*
    自增自减运算符
 */
        //定义变量
        int z = 10;
        System.out.println("z:" + z);
        //单独使用
        //z++; 先用后加
        //++z; 先加后用

        //参与操作
        int h = z++;
        System.out.println("z:" + z);
        System.out.println("h:" + h);

        System.out.println("-----------------------");

/*
    关系运算符
 */
        //定义变量
        int o = 10;
        int p = 20;
        int q = 10;

        //==
        System.out.println(o == p);
        System.out.println(o == q);
        System.out.println("-----------------------");

        //!=
        System.out.println(o != p);
        System.out.println(o != q);
        System.out.println("-----------------------");

        System.out.println(o > p);
        System.out.println(o > q);
        System.out.println("-----------------------");

        System.out.println(o >= p);
        System.out.println(o >= q);
        System.out.println("-----------------------");

/*
    逻辑运算符
 */
        //& 有false则false
        System.out.println((o > p) & (o > q));   //false & false
        System.out.println((o < p) & (o > q));   //true & false
        System.out.println((o > p) & (o < q));   //false & true
        System.out.println((o < p) & (o < q));   //true & true
        System.out.println("-----------------------");

        //| 有true则true
        System.out.println((o > p) | (o > q));   //false | false
        System.out.println((o < p) | (o > q));   //true | false
        System.out.println((o > p) | (o < q));   //false | true
        System.out.println((o < p) | (o < q));   //true | true
        System.out.println("-----------------------");

        //^ 相同为false,不同为true
        System.out.println((o > p) ^ (o > q));   //false ^ false
        System.out.println((o < p) ^ (o > q));   //true ^ false
        System.out.println((o > p) ^ (o < q));   //false ^ true
        System.out.println((o < p) ^ (o < q));   //true ^ true
        System.out.println("-----------------------");

        //!
        System.out.println((o > p));  //false
        System.out.println(!(o > p));  //!false
        System.out.println(!!(o > p));  //!!false
        System.out.println(!!!(o > p));  //!!!false
        System.out.println("-----------------------");

/*
    短路逻辑运算符
 */
        //& 有false则false
        System.out.println((o > p) && (o > q));   //false && false
        System.out.println((o < p) && (o > q));   //true && false
        System.out.println((o > p) && (o < q));   //false && true
        System.out.println((o < p) && (o < q));   //true && true
        System.out.println("-----------------------");

        //| 有true则true
        System.out.println((o > p) || (o > q));   //false || false
        System.out.println((o < p) || (o > q));   //true || false
        System.out.println((o > p) || (o < q));   //false || true
        System.out.println((o < p) || (o < q));   //true || true
        System.out.println("-----------------------");

        //&&和& 如果左边为真,右边执行。如果左边为假,右边不执行。
        //        逻辑或为同理
        System.out.println((o++ > 100) && (p++ > 100));
        System.out.println("o:" + o);
        System.out.println("p:" + p);
        System.out.println("-----------------------");

/*
    三元运算符
 */
        //格式：
        //a > b ? a : b
        //执行流程：
        //首先计算关系表达式的值
        //如果值为true，表达式1的值就是运算结果
        //如果只为false，表达式2的值就是运算结果

        //定义两个变量
        int a1 = 10;
        int b1 = 20;

        //获取两个数据中的最大值
        int max = a1 > b1 ? a1 : b1;

        //输出结果
        System.out.println("max:" + max);

        System.out.println("-----------------------");
    }
}

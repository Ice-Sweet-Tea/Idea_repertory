package Collection_38.Generic.GenericTest05;

/*
    测试类
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
    }

    /*可变参数用法*/
    //这里的变量其实是一个数组
    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

    /*注意事项*/
    //如果一个方法有多个参数，包含可变参数，可变参数哟啊放在最后
//    public static int sum(int b,int... a){
//        return 0;
//    }
}

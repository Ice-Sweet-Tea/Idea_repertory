package Method_15;

/*
    带返回值方法的定义和调用

    定义格式：
        public static 数据类型 方法名(参数) {
            return 数据;
        }

    调用格式：
        1:方法名(参数);
        2:数据类型 变量名 = 方法名(参数);
 */
public class Method_15_demo03 {
    public static void main(String[] args) {
        boolean flag = isEvenNumber(39);
        System.out.println(flag);
    }

    //需求：定义一个方法，该方法接取一个参数，判断该数是否为偶数，并返回真假
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }
}

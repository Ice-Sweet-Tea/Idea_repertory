package PackagingClass_35.PackagingClassTest;
/*
    int和String的相互转换：
        int转换为String：
            public static String valueOf(int i)：返回int参数的字符串表示形式，该方法是String类中的方法
        String转换为int：
            public static int parseInt(String s)：将字符串解析为int类型，该方法是Integer类中的方法


 */
public class IntegerDemo {
    public static void main(String[] args) {
        // int --- String
        int number = 100;
        //方式1
        String s1 = "" + number;
        System.out.println(s1);

        //方法2
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("--------");


        //String --- int
        String s = "100";
        //方式1
        //String --- Integer --- int
        Integer i = Integer.valueOf(s);
        //public int intValue();
        int x = i.intValue();
        System.out.println(x);

        //方式2
        //public static int parseInt (String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}







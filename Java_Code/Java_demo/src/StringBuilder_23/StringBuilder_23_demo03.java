package StringBuilder_23;

/*
    StringBuilder 转换为 String:
        public String toString()：通过toString()就可以实现把 StringBuilder 转换为 String

    String 转换为 StringBuilder
        public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
 */
public class StringBuilder_23_demo03 {
    public static void main(String[] args) {
        //StringBuilder 转换为 String
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello");

        //String s = sb; //这个是错误的做法
        //public String toString()：通过toString()就可以实现把 StringBuilder 转换为 String
//        String s = sb.toString();
//        System.out.println(s);


        //String 转换为 StringBuilder
        String st = "abc";
        //public StringBuilder(String s)：通过构造方法就可以实现把 String 转换为 StringBuilder
        StringBuilder sb = new StringBuilder(st);

        System.out.println(sb);
    }
}

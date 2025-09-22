package Exception_37;

/*
    public String getMessage()：返回此 throwable 的纤细消息字符串
    public String toString()：返回此可抛出的简短描述
    public void printStackTrace()：把异常的错误信息输出在控制台
 */
public class ExceptionDemo04 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[3]);  //new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("你访问的数组索引不存在！");
//            e.printStackTrace();

            //public String getMessage()：返回此 throwable 的纤细消息字符串
           //System.out.println(e.getMessage());

            //public void printStackTrace()：把异常的错误信息输出在控制台
            System.out.println(e.toString());
        }

    }
}

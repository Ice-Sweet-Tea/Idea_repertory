package Collection_38.Generic.GenericTest05;

/*
    Arrays工具类中有一个静态方法
        public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表

    List接口中有一个静态方法：
        public static <E> List<E> of (E... elements)：返回包含任意数量元素的不可变列表

    Set接口中有一个静态方法：
        public static <E> Set<E> of (E... elements)：返回一个包含任意数量元素的不可变集合
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        //public static <T> List<T> asList (T... a)：返回由指定数组支持的固定大小的列表
//        List<String> list = Arrays.asList("hello", "world", "java");
////        list.add("javaee"); //UnsupportedOperationException
////        list.remove("world"); //UnsupportedOperationException
//        list.set(1,"javaee");
//        System.out.println(list);


        //public static <E> List<E> of (E... elements)：返回包含任意数量元素的不可变列表
        //这是 java9 中的静态方法，java8是没有的只能用asList替代
        //这个方法的 list.set()不能用 "UnsupportedOperationException"

        //public static <E> Set<E> Set (E... elements)：返回一个包含任意数量元素的不可变集合
        //这是 java9 中的静态方法，java8是没有的只能用asList替代
        //Set不能出现重复的元素、和of一样“增”、“删”、“改”都不能用
    }
}

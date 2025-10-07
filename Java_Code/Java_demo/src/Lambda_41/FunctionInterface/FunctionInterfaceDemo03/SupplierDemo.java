package Lambda_41.FunctionInterface.FunctionInterfaceDemo03;

import java.util.function.Supplier;

/*
    Supplier<T>：包含一个无参的方法
        T get():获得结果
        该方法不需要参数，它会按照某种实现逻辑(由Lambda表达式实现)返回一个数据
        Supplier<T>接口也被称为生产接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生成什么类型的数据提供

 */
public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> {
            return "吴彦祖";
        });
        System.out.println(s);

        int i = getInteger(() -> {
            return 100;
        });
        System.out.println(i);
    }

    //定义一个方法，返回一个整数数据
    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    //定义一个方法，返回一个字符串数据
    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}

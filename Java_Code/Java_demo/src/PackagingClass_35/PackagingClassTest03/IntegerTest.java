package PackagingClass_35.PackagingClassTest03;
/*
    装箱：把 基本数据类型 转换为对应的 包装类类型
    拆箱：把 包装类类型 转换对应的 基本数据类型
 */
public class IntegerTest {
    public static void main(String[] args) {
        //装箱：把 基本数据类型 转换为对应的 包装类类型
        Integer i = Integer.valueOf(100);
        Integer i2 = 100; //自动装箱 底层也做了Integer.valueOf(100);

        //拆箱：把 包装类类型 转换对应的 基本数据类型
//        int i2 = i2.intValue() + 200;
        i2 += 200;
        System.out.println(i2);

        Integer i3 = null;
        if (i3!=null){
            i3 += 300; //NullPointerException
        }

    }
}

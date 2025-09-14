package Interface_31.InterfaceTest_demo;

/*
    接口的成员特点：
        1.成员变量只能是常量。默认修饰符：public static final
        2.构造方法：接口没有构造方法，因为接口主要是对行为进行抽象的，
          是没有具体存在一个类如果没有父类，默认继承自Object类
        3.成员方法：只能是抽象方法，默认修饰符public abstract
*/

public interface Interface {
    public int num = 10;
    public final int num2 = 20;
//    public static final int num3 = 30;
    int num3 = 30;

//    public Interface{}

//    public void show(){}

    public abstract void method();

    /*前面public void 影藏了*/
    void show();
}

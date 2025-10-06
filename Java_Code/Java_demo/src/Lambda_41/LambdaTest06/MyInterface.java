package Lambda_41.LambdaTest06;

public interface MyInterface {
    void show1();

    void show2();
    //默认方法不是抽象方法，所以不强制被重写，但是可以被重写，重写的时候去掉default关键字
    //public可以省略,default不能省略
    public default void show3(){
        System.out.println("show3");
    }
}

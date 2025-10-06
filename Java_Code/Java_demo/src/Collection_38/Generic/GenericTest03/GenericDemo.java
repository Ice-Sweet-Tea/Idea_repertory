package Collection_38.Generic.GenericTest03;
/*
    测试类
    //泛型接口
 */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("易丽莉");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(30);
    }
}

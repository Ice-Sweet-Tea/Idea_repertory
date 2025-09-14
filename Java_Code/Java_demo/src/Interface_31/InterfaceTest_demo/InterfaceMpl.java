package Interface_31.InterfaceTest_demo;

//public class InterfaceMpl implements Interface{
/*  Object:
        1.如果一个类没有父类,Object就是它的父类(继父)
        2.如果一个类有父类，间接继承Object(小三)
*/
public class InterfaceMpl extends Object implements Interface{
    public InterfaceMpl(){
        //使用的是Object的构造方法
        super();
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}

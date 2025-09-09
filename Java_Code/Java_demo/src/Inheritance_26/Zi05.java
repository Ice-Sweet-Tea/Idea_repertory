package Inheritance_26;

public class Zi05 extends Fu05{
    public void method(){
        System.out.println("Zi中method()方法被调用");
    }

    public void show(){
        super.show();
        System.out.println("Zi中show()方法被调用");
    }
}

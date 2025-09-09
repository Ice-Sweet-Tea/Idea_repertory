package Inheritance_26;

public class Zi03 extends Fu03{
    public int age = 30;

    public void show() {
        int age = 25;
        System.out.println(age);
        //我要访问本类的成员变量，怎么办呢？
        System.out.println(this.age);
        //我要访问父类的成员变量，怎么办呢？
        System.out.println(super.age);
    }
}

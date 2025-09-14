package AbstractClass_30.AbstractClassTest_demo;

/* 1.抽象方法必须在抽象类中使用
   2.抽象类中也可以有非抽象方法
   3.抽象不能实例化，参考多态的方式，通过子类对象实例化，这叫抽象类多态
   4.抽象类的子类：要么重写抽象类中的所有抽象方法，要么是抽象类(Dog)
*/

public abstract class Animal {
    public abstract void eat();

    public void sleep() {
        System.out.println("睡觉");
    }
}

package Polymorphism_29.PolymorphismTest_demo02;
/*
    向上转型：
        从子到父
        父类引用指向子类对象

    向下转型：
        从父到子
        父类引用转为子类对象
 */
public class TestDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型  /*猫属于动物*/
        a.eat();

        //创建Cat类的对象
        /*
        Cat c = new Cat();
        c.eat();
        c.playGame();
         */

        //向下转型
        Cat c = (Cat) a;/*动物有猫*/
        c.eat();
        c.playGame();

        //向上转型
        a = new Dog();
        a.eat();

        //向下转型
        //ClassCastException 类型转换异常
//        Cat cc = (Cat) a;
//        cc.eat();
//        cc.eat();
    }
}

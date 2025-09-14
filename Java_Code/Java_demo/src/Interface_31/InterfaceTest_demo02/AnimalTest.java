package Interface_31.InterfaceTest_demo02;

import Test_demo02.DisplayElement;

/*
    测试类
 */
public class AnimalTest {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumping j = new Cat();
        j.jump();

        System.out.println("----------");

        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(2);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("胖次",3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        System.out.println("----------");

        Jumping k = new Dog();
        k.jump();

        Animal b = new Dog();
        b.setName("大花");
        b.setAge(6);
        b.eat();
        System.out.println(b.getName()+","+b.getAge());

        b = new Dog("小花",5);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();
    }
}

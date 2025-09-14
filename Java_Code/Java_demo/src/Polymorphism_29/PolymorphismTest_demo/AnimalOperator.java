package Polymorphism_29.PolymorphismTest_demo;

/*
    动物操作类
 */
public class AnimalOperator {
    /*
    public void useAnimal(Cat c) { //Cat c = new Cat();
        c.eat();
    }

    public void useAnimal(Dog d) { //Dog d = new Dog();
        d.eat();
    }
     */

    /*多态的好处:提高了程序的扩展性
    *           具体方法的时候，使用父类作为参数，将来在使用的时候，使用具体的子类型参与操作
    * 多态的弊端:不能使用子类的特有功能*/


    public void useAnimal(Animal a){
        //Animal a = new Cat();
        //Animal a = new Dog();
        a.eat();
        /*多态不能访问子类的功能*/
//        a.lookDoor();
    }
}

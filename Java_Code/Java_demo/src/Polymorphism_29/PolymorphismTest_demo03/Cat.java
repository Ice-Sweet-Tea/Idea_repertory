package Polymorphism_29.PolymorphismTest_demo03;

public class Cat extends Animal{
    public Cat(){}

    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

}

package Interface_31.InterfaceTest_demo02;

public class Cat extends Animal implements Jumping{
    public Cat(){}
    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("我家猫会后空翻");
    }

}

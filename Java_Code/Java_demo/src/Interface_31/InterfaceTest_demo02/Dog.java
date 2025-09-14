package Interface_31.InterfaceTest_demo02;

public class Dog extends Animal implements Jumping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void jump() {
        System.out.println("不要给我汪汪叫");
    }
}

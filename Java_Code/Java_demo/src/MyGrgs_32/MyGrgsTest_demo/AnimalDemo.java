package MyGrgs_32.MyGrgsTest_demo;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();
        a2.eat();

    }
}

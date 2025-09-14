package Polymorphism_29.PolymorphismTest_demo03;

/*
    测试类
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(4);
        System.out.println(a.getName() + "," + a.getAge() + "岁");
        a.eat();

        a = new Cat("加菲猫",4);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        System.out.println("------------");

        //对狗进行测试
        Animal b = new Dog();
        b.setName("大花");
        b.setAge(1);
        System.out.println(b.getName()+","+b.getAge()+ "岁");
        b.eat();

        b = new Dog("大花",1);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();



    }
}

package AbstractClass_30.AbstractClassTest_demo03;

/*
    测试类
 */
public class AnimalTest {
    public static void main(String[] args) {
        //创建对象，按照多态的方式
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(3);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();

        a = new Cat("加菲",5);
        System.out.println(a.getName()+","+a.getAge()+"岁");
        a.eat();

        System.out.println("---------------");

        Animal b = new Dog();
        b.setName("大花");
        b.setAge(5);
        System.out.println(b.getName()+","+b.getAge());
        b.eat();

        b = new Dog("大花",3);
        System.out.println(b.getName()+","+b.getAge()+"岁");
        b.eat();
    }
}

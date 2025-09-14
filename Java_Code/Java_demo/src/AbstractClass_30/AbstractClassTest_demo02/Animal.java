package AbstractClass_30.AbstractClassTest_demo02;
/*
    抽象类
        1.是可以有构造方法的
 */
public abstract class Animal {
    private int age = 20;
    private final String city = "北京";

    public Animal(){}
    public Animal(int age,String city){
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city = "上海";
        System.out.println(city);
    }

    public abstract void eat();
}

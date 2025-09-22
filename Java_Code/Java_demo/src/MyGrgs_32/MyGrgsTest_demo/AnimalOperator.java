package MyGrgs_32.MyGrgsTest_demo;

public class AnimalOperator {
    /*方法的形参是抽象类名，其实需要的是该抽象类的子类对象*/
    public void useAnimal(Animal a){ //Animal a = new Cat();
        a.eat();
    }

    /*方法的返回值是抽象类名，其实返回的是该抽象类的子类对象*/
    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }
}

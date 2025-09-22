package MyGrgs_32;

public class CatOperator {
    //类名作为形参(方法的形参是类名，其实需要的是该类的对象)
    public void useCat(Cat c) { //Cat c = new Cat();
        c.eat();
    }

    //类名作为返回值(方法的返回值是类名，其实返回的是该类的对象)
    public Cat getCat() {
        Cat c = new Cat();
        return c;
    }
}

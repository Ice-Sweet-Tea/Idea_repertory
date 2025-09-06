package This_19;

/*
    学生类
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        /*方法的形参没有与成员变量同名，不带this修饰的变量指的是成员变量*/
//        name = n;
//        name = name;
        /*方法的形参如果与成员变量同名，不带this修饰的变量值的是形参，而不是成员变量*/
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}

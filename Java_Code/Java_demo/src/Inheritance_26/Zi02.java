package Inheritance_26;

public class Zi02 extends Fu02 {
    //身高
    public int height = 185;
    //年龄
    /*如果成员变量有那么就不会去父类里面找*/
    public int age = 35;

    public void show(){
        /*如果方法里面有那么就不会去成员变量里找*/
        int age = 20;
        System.out.println(age);
        System.out.println(height);
    }
}

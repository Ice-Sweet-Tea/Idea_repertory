package Final_27;

public class FianlDemo {
    public static void main(String[] args) {
        //final修饰基本类型变量
        /*final修饰变量：表明该变量是常量，不能再次被赋值*/
        /*变量是基本类型：final修饰值的是基本类型的数据值不能发生改变*/
        final int age = 20;
//        age = 21;
        System.out.println(age);

        //final修饰引用类型变量
        /*fianl修饰了s的地址不能变，但是24是s里面的值是可以发生改变的*/
        /*变量是引用类型：final修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变的*/
        final Studeny s = new Studeny();
        s.age = 24;
        System.out.println(s.age);

//        s = new Studeny();
    }
}

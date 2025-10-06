package Lambda_41.LambdaTest05;

import sun.awt.windows.ThemeReader;

/*
    Lambda表达式和匿名内部类的区别
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        /*
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });
        */

        // Lambda---只有接口一个方法才可以使用
//        useStudent(()-> System.out.println("具体类"));
//
//        useAnimal(() -> System.out.println("抽象类"));

//        useInter(() -> System.out.println("接口"));

        //匿名内部类---接口多个方法可以使用内部类实现
        useInter(new Inter(){
            @Override
            public void show() {
                System.out.println("show1");
            }

            @Override
            public void show2() {
                System.out.println("show2");
            }
        });
    }


    private static void useStudent(Student s) {
        s.study();
    }

    private static void useAnimal(Animal a) {
        a.method();
    }

    private static void useInter(Inter i) {
        i.show();
        i.show2();
    }
}

package InnerClass_33.InnerClassTest_demo04;

/*
    测试类
 */
public class JumpingDemo {
    public static void main(String[] args) {
        //需求:创建接口操作类的对象，调用method方法
        JumpingOperator jo = new JumpingOperator();
        Jumping j = new Cat();
        jo.method(j);

        Jumping k = new Dog();
        jo.method(k);

        System.out.println("-----------");
        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫可以调高了");
            }
        });

        jo.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗儿飞起来");
            }
        });
    }
}

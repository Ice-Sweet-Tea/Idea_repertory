package MyGrgs_32.MyGrgsTest_demo02;

public class JumpingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumpingOperator jo = new JumpingOperator();
//        Cat c = new Cat();
        Jumping j = new Cat();
        jo.useJumping(j);

        Jumping j2 = jo.get_Jumping(); //new Cat()
        j2.jump();
    }
}

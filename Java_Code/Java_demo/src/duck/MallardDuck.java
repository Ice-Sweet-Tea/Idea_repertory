package duck;
import BehaviorTest_20_demo03.FlyWithWings;
import BehaviorTest_20_demo03.Quack;
public class MallardDuck extends Duck{
    public MallardDuck() {
        // 设置具体的行为实现
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭！");
    }
}

package duck;
import BehaviorTest_20_demo03.FlyWithWings;
import BehaviorTest_20_demo03.Quack;
/*
 * 红头鸭具体类
 */
public class RedheadDuck extends Duck{
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只红头鸭！");
    }
}

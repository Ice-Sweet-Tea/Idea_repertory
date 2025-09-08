package duck;
import BehaviorTest_20_demo03.FlyNoWay;
import BehaviorTest_20_demo03.MuteQuack;
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();    // 诱饵鸭不能飞
        quackBehavior = new MuteQuack(); // 诱饵鸭不能叫
    }

    @Override
    public void display() {
        System.out.println("我是一只诱饵鸭！");
    }
}

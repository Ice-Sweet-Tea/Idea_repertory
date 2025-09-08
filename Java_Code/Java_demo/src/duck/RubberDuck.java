package duck;
import BehaviorTest_20_demo03.FlyNoWay;
import BehaviorTest_20_demo03.Squeak;
public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();    // 橡皮鸭不能飞
        quackBehavior = new Squeak();    // 橡皮鸭吱吱叫
    }

    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭！");
    }
}

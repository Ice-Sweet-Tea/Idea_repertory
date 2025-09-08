package BehaviorTest_20_demo03;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我不能飞行！");
    }
}

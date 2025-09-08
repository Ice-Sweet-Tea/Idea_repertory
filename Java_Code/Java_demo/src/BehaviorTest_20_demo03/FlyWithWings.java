package BehaviorTest_20_demo03;
/**
 * 用翅膀飞行的具体实现
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("我用翅膀飞行！");
    }
}

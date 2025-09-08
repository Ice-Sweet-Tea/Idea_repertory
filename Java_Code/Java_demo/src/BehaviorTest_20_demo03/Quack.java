package BehaviorTest_20_demo03;
/**
 * 正常叫声的具体实现
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("嘎嘎叫！");
    }
}

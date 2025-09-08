package BehaviorTest_20_demo03;
/**
 * 不能叫的具体实现
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println(" 沉默 ");
    }
}

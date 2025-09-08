package duck;
import BehaviorTest_20_demo03.FlyBehavior;
import BehaviorTest_20_demo03.QuackBehavior;
/**
 * 鸭子抽象类
 * 所有鸭子的基类
 */
public abstract class Duck {
    // 使用接口类型声明行为变量（策略模式的核心）
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck() {}

    // 抽象方法，子类必须实现
    public abstract void display();

    // 委托给行为类执行
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("所有的鸭子都会游泳！");
    }

    // 动态设置行为的方法
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}

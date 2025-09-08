package duck;
import duck.*;
import BehaviorTest_20_demo03.FlyWithWings;
import BehaviorTest_20_demo03.Quack;
public class Client {
    public static void main(String[] args) {
        System.out.println("=== 测试各种鸭子行为 ===");

        // 创建各种鸭子
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        // 测试绿头鸭
        System.out.println("\n--- 绿头鸭 ---");
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();

        // 测试橡皮鸭
        System.out.println("\n--- 橡皮鸭 ---");
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.swim();

        // 测试诱饵鸭
        System.out.println("\n--- 诱饵鸭 ---");
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        decoy.swim();

        // 演示动态改变行为（策略模式的优势）
        System.out.println("\n=== 动态改变橡皮鸭的行为 ===");
        rubber.display();
        System.out.println("给橡皮鸭装上火箭推进器！");
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.setQuackBehavior(new Quack());
        rubber.performFly();
        rubber.performQuack();
    }
}

package BehaviorTest_20_demo03;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫！");
    }
}

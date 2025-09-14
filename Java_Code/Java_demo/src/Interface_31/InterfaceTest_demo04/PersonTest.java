package Interface_31.InterfaceTest_demo04;
/*
    测试类
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象-运动员
        PingPangPlayer p = new PingPangPlayer();
        p.setName("张继科");
        p.setAge(30);
        System.out.println(p.getName()+","+p.getAge());
        p.eat();
        p.study();
        p.speak();

        System.out.println("----------");

        PingPangPlayer p2 = new PingPangPlayer("王浩",40);
        System.out.println(p2.getName()+","+p2.getAge());
        p2.eat();
        p2.study();
        p2.speak();

        System.out.println("----------");

        BasketballPlayer b = new BasketballPlayer();
        b.setName("姚明");
        b.setAge(25);
        System.out.println(b.getName()+","+b.getAge());
        b.study();
        b.eat();

        System.out.println("----------");

        BasketballPlayer b2 = new BasketballPlayer("科比",38);
        System.out.println(b2.getName()+","+b2.getAge());
        b2.study();
        b2.eat();

        System.out.println("----------");

        //创建对象-教练
        PingPangCoach pp = new PingPangCoach();
        pp.setName("小胖");
        pp.setAge(26);
        System.out.println(pp.getName()+","+pp.getAge()+"岁");
        pp.teach();
        pp.eat();
        pp.speak();

        System.out.println("----------");

        PingPangCoach pp2 = new PingPangCoach("大魔王",30);
        System.out.println(pp2.getName()+","+pp2.getAge()+"岁");
        pp2.teach();
        pp2.eat();
        pp2.speak();

        System.out.println("----------");

        BasketballCoach bb = new BasketballCoach();
        bb.setName("欧文");
        bb.setAge(29);
        System.out.println(bb.getName()+","+bb.getAge()+"岁");
        bb.teach();
        bb.eat();

        System.out.println("----------");

        BasketballCoach bb2 = new BasketballCoach("浓眉",25);
        System.out.println(bb2.getName()+","+bb2.getAge());
        bb2.teach();
        bb2.eat();
    }
}

package Inheritance_26;

//Java中类只支持单继承，不支持多继承
//Java中类支持多层次继承

/*
    public class Son extends Father,Monther{
}
 */

public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        f.smoke();
        f.drink();
    }

}


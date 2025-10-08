package Enumeration_42.SingletonPattern;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
//        Runtime r2 = Runtime.getRuntime();
//
//        System.out.println(r==r2);

//        r.exec("calc");
//        r.exec("notepad");

//        r.exec("shutdown -s -t 10000");
        r.exec("shutdown -a");
    }
}

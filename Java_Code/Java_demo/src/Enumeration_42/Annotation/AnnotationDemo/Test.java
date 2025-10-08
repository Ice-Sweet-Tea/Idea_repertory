package Enumeration_42.Annotation.AnnotationDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.method();

        @SuppressWarnings(value="all") //取消编译器检查的注解
        List<String> list = new ArrayList();
    }
}

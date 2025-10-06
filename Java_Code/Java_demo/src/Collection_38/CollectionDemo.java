package Collection_38;

import java.util.ArrayList;
import java.util.Collection;

/*
    创建Collection集合的对象
        多态的方式
        ArrayList()
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();


        c.add("hello");
        c.add("java");
        c.add("python");

        //输出集合对象
        System.out.println(c);
    }
}

package Lambda_41.FunctionInterface.Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

/*
    String strArray[] = {"刘备,30","关羽,34","张飞,31","赵云,33"};
    字符串数组中有多条信息，通过Predicate接口的拼装将复合要求的字符串帅选到集合ArrayList中，并遍历ArrayList集合
    要求：同时满足如下要求
        1：姓名长度大于2
        2：年龄大于33
    分析：
        1：有两个判断条件，所以需要使用两个Predicate接口，对条件进行判断
        2：必须同时满足两个条件，所以可以使用and方法连接两个判断条件
 */
public class PredicateTest {
    public static void main(String[] args) {
        String strArray[] = {"汉昭帝,30", "武财神,34", "玉面君,31", "浑身但,33","吴妍珠,35"};
        ArrayList<String> array = myFilter(strArray, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 33);

        for (String str:array){
            System.out.println(str);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        //定义一个集合
        ArrayList<String> array = new ArrayList<String>();

        for (String str : strArray) {
            if (pre1.and(pre2).test(str)) {
                array.add(str);
            }
        }

        return array;
    }
}

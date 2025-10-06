package Collection_38.Map.MapTest02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
    需求：
        创建一个HashMap集合，存储三个键值对，每一个键值对元素的键是String,值是ArrayList,
        每一个ArrayList的元素是String，并遍历

    思路：
        1.创建HashMap集合
        2.创建ArrayList集合，并添加元素
        3.把ArrayList作为元素添加到HashMap集合
        4.遍历HashMap集合

    给出如下的数据：
        第一个ArrayList集合的元素：
            诸葛亮
            赵云
        第二个ArrayList集合的元素：
            唐僧
            孙悟空
        第三个ArrayList集合的元素
            武松
            鲁智深
 */
public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        //1.创建HashMap集合
        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();

        //2.创建ArrayList集合，并添加元素
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("诸葛亮");
        array1.add("赵云");
        //3.把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义",array1);

        ArrayList<String> array2 = new ArrayList<String>();
        array2.add("唐僧");
        array2.add("孙悟空");
        //3.把ArrayList作为元素添加到HashMap集合
        hm.put("西游记",array2);

        ArrayList<String> array3 = new ArrayList<String>();
        array3.add("武松");
        array3.add("鲁智深");
        //3.把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传",array3);

        //4.遍历HashMap集合
        Set<String> keySet = hm.keySet();
        for (String key:keySet){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s:value){
                System.out.println(s);
            }
        }
    }
}

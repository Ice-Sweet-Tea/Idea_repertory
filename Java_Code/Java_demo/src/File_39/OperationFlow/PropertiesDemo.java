package File_39.OperationFlow;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为Map集合的使用
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //存储元素
        prop.put("itheima001", "刘备");
        prop.put("itheima002", "关羽");
        prop.put("itheima003", "张飞");

        //集合遍历
        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}

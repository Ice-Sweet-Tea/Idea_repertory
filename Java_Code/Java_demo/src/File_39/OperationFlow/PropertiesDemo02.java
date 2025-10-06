package File_39.OperationFlow;

import java.util.Properties;
import java.util.Set;

/*
    Properties作为集合的特有方法：
        Object setProperty(String key,String value)：设置集合的键和值，都是String类型，底层调用Hashtable方法put
        String getProperty(String key)：使用此属性列表中指定的键搜索属性
        Set<String> stringPropertyNames()：从该属性列表中返回一个不可修改的键集，其中键及对应的值是字符串
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();

        //Object setProperty(String key,String value)：设置集合的键和值，都是String类型，底层调用Hashtable方法put
        prop.setProperty("itheima001","刘备");
        prop.setProperty("itheima002", "关羽");
        prop.setProperty("itheima003", "张飞");

        //String getProperty(String key)：使用此属性列表中指定的键搜索属性
//        String s = prop.getProperty("itheima001");

        //Set<String> stringPropertyNames()：从该属性列表中返回一个不可修改的键集，其中键及对应的值是字符串
        Set<String> names = prop.stringPropertyNames();
        for (String key:names){
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }
    }
}

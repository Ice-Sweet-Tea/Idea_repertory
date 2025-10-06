package File_39.OperationFlow;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    Properties和IO流结合的方法：
        void load(Reader reader):
            从输入字符流读取属性列表(键和元素对)

        void store (Writer,String comments)：
            将此属性列表(键和元素对) 写入此 Properties表中，以适合使用 load(Reader)方法的格式写入输出字符流
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException{
        //把集合中的数据保存到文件
//        myStore();
        //把文件中的数据加载到集合
        myLoad();
    }

    private static void myLoad() throws IOException{
        Properties prop = new Properties();

        //void load(Reader reader):
        FileReader fr = new FileReader("Java_demo\\File\\fw.txt");

        prop.load(fr);

        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("itheima001", "刘备");
        prop.setProperty("itheima002", "关羽");
        prop.setProperty("itheima003", "张飞");

        //void store (Writer,String comments)：
        FileWriter fw = new FileWriter("Java_demo\\File\\fw.txt");

        prop.store(fw,null);

        fw.close();
    }
}

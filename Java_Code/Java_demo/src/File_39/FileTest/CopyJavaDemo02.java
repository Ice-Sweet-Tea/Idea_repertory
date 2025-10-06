package File_39.FileTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    需求：
        复制ConversionStreamDemo到copy文件里
    数据源和目的地的分析：
        数据源：... --- 读数据 --- Reader --- InputStreamReader --- FileReader
        目的地：... --- 写数据 --- Writer --- OutputStreamWriter --- FileWriter
    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源

 */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        //1.根据数据源创建字符输入流对象
        FileReader fr = new FileReader("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\CharacterStream\\ConversionStreamDemo.java");

        //2.根据目的地创建字符输出流对象
        FileWriter fw = new FileWriter("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\FileTest\\Copy.java");

        //3.读写数据，复制文件
        //1.一次读写一个字符数据
//        int ch;
//        while ((ch=fr.read())!=-1){
//            fw.write(ch);
//        }

        //2.一次读写一个字符数组数据
        char bys[] = new char[1024];
        int len;
        while ((len=fr.read(bys))!=-1){
            fw.write(bys,0,len);
        }
        //4.释放资源
        fr.close();
        fw.close();
    }
}

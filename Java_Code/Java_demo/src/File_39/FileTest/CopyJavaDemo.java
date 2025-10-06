package File_39.FileTest;

import java.io.*;

/*
    需求：
        复制ConversionStreamDemo到copy文件里
    思路：
        1.根据数据源创建字符输入流对象
        2.根据目的地创建字符输出流对象
        3.读写数据，复制文件
        4.释放资源
 */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        //1.根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\CharacterStream\\ConversionStreamDemo.java"));
        //2.根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\src\\File_39\\FileTest\\Copy.java"));
        //3.读写数据，复制文件
        //1.一次读写一个字符数据
//        int ch;
//        while ((ch=isr.read())!=-1){
//            osw.write(ch);
//        }

        //2.一次读写一个字符数组数据
        char[] chs = new char[1024];
        int len;
        while ((len=isr.read(chs))!=-1){
            osw.write(chs,0,len);
        }

        //4.释放资源
        isr.close();
        osw.close();
    }
}

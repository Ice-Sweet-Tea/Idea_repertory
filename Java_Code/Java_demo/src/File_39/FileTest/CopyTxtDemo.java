package File_39.FileTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：
        把复制文件

    数据源：E:\IntelliJ_IDEA\Java_Study\Java_Code\Java_demo\File\CopyTxt.txt --- 读数据 --- InputStream --- FileInputStream

    目的地：E:\IntelliJ_IDEA\Java_Study\Java_Code\Java_demo\CopyTxt.txt --- 写数据 --- OutputStream --- FileOutputStream

    思路：
    1.根据数据源创建字节输入流对线
    2.根据目的地创建字节输出流对象
    3.读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
    4.释放资源
 */
public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字节输入流对线
        FileInputStream fis = new FileInputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\File\\CopyTxt.txt");

        //根据目的地创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\IntelliJ_IDEA\\Java_Study\\Java_Code\\Java_demo\\CopyTxt.txt");

        //读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while((by=fis.read())!= -1){
            fos.write(by);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
